package code4tuba.pessoa;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PessoaServer.class)
@WebAppConfiguration
public abstract class PessoaServerTest {
    static {
        System.setProperty("spring.profiles.active", "test");
        System.setProperty("eureka.client.enabled", "false");
        System.setProperty("spring.cloud.config.enabled", "false");
        System.setProperty("feign.hystrix.enabled", "false");
    }

}