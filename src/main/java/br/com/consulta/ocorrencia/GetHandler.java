package br.com.consulta.ocorrencia;


import br.com.consulta.ocorrencia.domain.Ocorrencia;
import br.com.consulta.ocorrencia.repository.ClienteRepository;
import br.com.consulta.ocorrencia.repository.OcorrenciaRepository;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Component
public class GetHandler implements RequestHandler<Object, Object> {

@Autowired
private OcorrenciaRepository ocorrenciaRepository;
@Autowired
private ClienteRepository clienteRepository;

private Object input;

private Context context;

@Override
public Object handleRequest(Object input, Context context) {
final String[] args = new String[0];
        try (ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(OcorrenciaApplication.class, args)) {
        GetHandler app = configurableApplicationContext.getBean(GetHandler.class);
        context.getLogger().log("Passou aqui 1");
        app.input = input;
        app.context = context;
        context.getLogger().log("Passou aqui 2");
        return app.run(args);
        } catch (Exception ex) {
        context.getLogger().log("Error " + ex.getMessage());
        return "Erro ao realizar a consulta";
        }
}

    private List<Ocorrencia> run(String... strings) throws IOException {

        context.getLogger().log("Passou aqui 3");
        Gson gson = new Gson();
        final String inputJson = gson.toJson(input);
        context.getLogger().log("Passou aqui 4 : " + inputJson);
        return ocorrenciaRepository.findBysituacao(1);
    }


}