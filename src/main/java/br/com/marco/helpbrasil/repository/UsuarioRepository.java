package br.com.marco.helpbrasil.repository;

import br.com.marco.helpbrasil.domain.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long > {
}
