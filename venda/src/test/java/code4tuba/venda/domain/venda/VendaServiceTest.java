package code4tuba.venda.domain.venda;

import code4tuba.client.PessoaService;
import code4tuba.domain.venda.VendaService;
import code4tuba.venda.VendaServerTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

public class VendaServiceTest extends VendaServerTest {

    @Autowired
    private VendaService vendaService;

    @MockBean
    private PessoaService pessoaService;

    @Test
    public void testVender() {
        given(pessoaService.buscarPessoa(any())).willReturn("Maria");
        assertEquals(Double.valueOf("500"), vendaService.vender());
    }
}
