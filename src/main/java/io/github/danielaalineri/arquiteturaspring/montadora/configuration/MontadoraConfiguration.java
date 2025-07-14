package io.github.danielaalineri.arquiteturaspring.montadora.configuration;

import io.github.danielaalineri.arquiteturaspring.montadora.Motor;
import io.github.danielaalineri.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {


    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindors(4);
        motor.setModelo("ABCD");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Primary
    @Bean(name = "motorAspirado")
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindors(4);
        motor.setModelo("ABCD");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(190);
        motor.setCilindors(4);
        motor.setModelo("EFGH");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}
