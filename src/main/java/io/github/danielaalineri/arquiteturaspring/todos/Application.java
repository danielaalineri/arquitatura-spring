package io.github.danielaalineri.arquiteturaspring.todos;

import io.github.danielaalineri.arquiteturaspring.ExemploValue;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootApplication(scanBasePackages = "io.github.danielaalineri.arquiteturaspring")
@SpringBootApplication
@EnableConfigurationProperties
public class Application {

    public static void main(String[] args) {

        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);

        builder.bannerMode(Banner.Mode.OFF);
        builder.profiles("producao", "homologacao");
        builder.lazyInitialization(true);

        builder.run(args);

        //contexto da aplicacao ja iniciada:
        ConfigurableApplicationContext applicationContext = builder.context();
        //var produtoRepository = applicationContext.getBean("produtoRepository");
        System.out.println("Nome da aplicação: " + applicationContext.getApplicationName());

        ExemploValue value = applicationContext.getBean(ExemploValue.class);
        value.imprimirVariavel();
    }
}
