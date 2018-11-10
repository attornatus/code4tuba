package code4tuba.pessoa.domain.pessoa;

import code4tuba.pessoa.PessoaServerTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class PessoaServiceTest extends PessoaServerTest {

    @Autowired
    private PessoaService pessoaService;

    @Test
    public void testFindById() {
        assertEquals("João", pessoaService.buscarPorId(1L));
        assertEquals("Maria", pessoaService.buscarPorId(1L));
    }
}