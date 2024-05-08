package br.com.marco.helpbrasil.domain.dadosclimaticos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "DadosClimaticos")
@Table(name = "dados_climaticos")
@Getter
@Setter
@NoArgsConstructor

public class DadosClimaticos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "regiao")
    private String regiao;

    @Column(name = "temperatura")
    private double temperatura;

    public DadosClimaticos(Long id, String regiao, double temperatura){
        this.id = id;
        this.regiao = regiao;
        this.temperatura = temperatura;
    }


}
