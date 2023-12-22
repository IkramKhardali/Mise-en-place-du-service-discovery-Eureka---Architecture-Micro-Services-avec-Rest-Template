package ma.khardali.voiture;

import jakarta.transaction.Transactional;
import ma.khardali.voiture.Model.Client;
import ma.khardali.voiture.Repository.VoitureRepository;
import ma.khardali.voiture.Service.ClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@EnableFeignClients

public class VoitureApplication {
    /*@Service
    @FeignClient(name = "SERVICE-CLIENT")
    interface ClientService {
        @GetMapping(path = "/client/{id}")
        Client clientById(@PathVariable Long id);
    }
    */
    private final ClientService clientService;
    private final VoitureRepository voitureRepository;


    public VoitureApplication(VoitureRepository voitureRepository, ClientService clientService) {
        this.voitureRepository = voitureRepository;
        this.clientService = clientService;
    }

    public static void main(String[] args) {
        SpringApplication.run(VoitureApplication.class, args);
    }



    @Transactional
    @Bean
    CommandLineRunner initializeDatabase(VoitureRepository voitureRepository, ClientService clientService) {
        return args -> {

        };
    }
}

