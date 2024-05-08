package br.com.marco.helpbrasil.adapters;

import br.com.marco.helpbrasil.domain.informacoesclimaticas.InformacoesClimaticas;
import br.com.marco.helpbrasil.repository.InformacoesClimaticasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/informacoes-climaticas")
public class InformacoesClimaticasController {
    @Autowired
    private InformacoesClimaticasRepository informacoesClimaticasRepository;

    @GetMapping
    public List<InformacoesClimaticas> listarInformacoesClimaticas() {
        return informacoesClimaticasRepository.findAll();
    }

    @PostMapping
    public InformacoesClimaticas adicionarInformacoesClimaticas(@RequestBody InformacoesClimaticas informacoesClimaticas) {
        return informacoesClimaticasRepository.save(informacoesClimaticas);
    }
}

