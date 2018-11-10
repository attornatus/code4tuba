package code4tuba.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "pessoa-server", primary = false)
public interface PessoaService {

    @GetMapping(value = "/pessoas/{id}")
    String buscarPessoa(@PathVariable("id") Long id);

}
