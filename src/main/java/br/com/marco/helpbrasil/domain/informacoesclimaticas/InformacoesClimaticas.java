package br.com.marco.helpbrasil.domain.informacoesclimaticas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "InformacoesClimaticas")
@Table(name = "informacoes_climaticas")
@Getter
@Setter
@NoArgsConstructor
public class InformacoesClimaticas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;

    public InformacoesClimaticas(Long id, String titulo, String descricao){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
    }
}
