package code4tuba.pessoa.domain.pessoa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
class PessoaServiceImpl implements PessoaService {

    @Override
    public String buscarPorId(Long id) {
        log.info("Buscando pessoa com id: " + id);
        return Long.valueOf("1").equals(id) ? "João" : "Maria";
    }
}
