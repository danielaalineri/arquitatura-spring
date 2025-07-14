package io.github.danielaalineri.arquiteturaspring.montadora.api;

import io.github.danielaalineri.arquiteturaspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TestFabricaController {

    @Autowired
    @Turbo
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){ //@RequestBody Porque vai receber os dados  via Json
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);

    }
}
