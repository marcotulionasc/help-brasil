package br.com.marco.helpbrasil.repository;

import br.com.marco.helpbrasil.domain.dadosclimaticos.DadosClimaticos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DadosClimaticosRepository extends JpaRepository<DadosClimaticos, Long> {
}
