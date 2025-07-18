package io.github.danielaalineri.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class ArquiteturaspringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ArquiteturaspringApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaspringApplication.class);
		builder.profiles("producao");
		builder.run(args);
//builder.bannerMode(Banner.Mode.OFF);
		ConfigurableApplicationContext applicationContext = builder.context();
		//var produtoRepository = applicationContext.getBean("produtoRepository");

        ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String applicationName = environment.getProperty("spring.application.name");


	}

}
