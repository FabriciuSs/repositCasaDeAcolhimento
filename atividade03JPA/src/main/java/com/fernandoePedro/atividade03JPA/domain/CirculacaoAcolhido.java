package com.fernandoePedro.atividade03JPA.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbCirculacaoAcolhido")
public class CirculacaoAcolhido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalTime horaSaida;
    LocalTime horaEntrada;
    String descricao;
    Boolean isActive;

    // relacionamento N:1 com acolhido
    @ManyToOne
    Acolhido acolhido;

}
