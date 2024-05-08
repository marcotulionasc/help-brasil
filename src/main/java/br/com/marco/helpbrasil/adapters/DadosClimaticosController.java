package br.com.marco.helpbrasil.adapters;

import br.com.marco.helpbrasil.domain.dadosclimaticos.DadosClimaticos;
import br.com.marco.helpbrasil.repository.DadosClimaticosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dados-climaticos")
public class DadosClimaticosController {
    @Autowired
    private DadosClimaticosRepository dadosClimaticosRepository;

    @GetMapping
    public List<DadosClimaticos> listarDadosClimaticos() {
        return dadosClimaticosRepository.findAll();
    }

    @PostMapping
    public DadosClimaticos adicionarDadosClimaticos(@RequestBody DadosClimaticos dadosClimaticos) {
        return dadosClimaticosRepository.save(dadosClimaticos);
    }
}

