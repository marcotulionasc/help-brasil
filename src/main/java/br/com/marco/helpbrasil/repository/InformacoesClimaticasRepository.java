package br.com.marco.helpbrasil.repository;

import br.com.marco.helpbrasil.domain.informacoesclimaticas.InformacoesClimaticas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformacoesClimaticasRepository extends JpaRepository< InformacoesClimaticas, Long> {

}
