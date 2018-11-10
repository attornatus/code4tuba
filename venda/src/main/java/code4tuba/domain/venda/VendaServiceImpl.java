package code4tuba.domain.venda;

import code4tuba.client.PessoaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
class VendaServiceImpl implements VendaService {

    private PessoaService pessoaService;

    @Autowired
    public VendaServiceImpl(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @Override
    public Double vender() {
        String pessoa = pessoaService.buscarPessoa(1L);
        log.info(pessoa);
        if (pessoa.equals("Maria")) {
            return Double.valueOf("500");
        }
        return Double.valueOf("100");
    }
}
