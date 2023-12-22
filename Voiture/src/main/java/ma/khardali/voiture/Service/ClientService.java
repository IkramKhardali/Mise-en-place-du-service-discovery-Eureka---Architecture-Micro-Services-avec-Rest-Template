package ma.khardali.voiture.Service;

import ma.khardali.voiture.Model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Service
@FeignClient(name = "SERVICE-CLIENT")
public interface ClientService {
    @GetMapping(path = "/client/{id}")
    Client clientById(@PathVariable Long id);
}
