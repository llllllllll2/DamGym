package com.Gimnasio.AplicacionGimnasio.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor

@Entity(name = "clase")
public class Clase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_clase;

    @Column
    private String ubicacion;
    @Column
    private String nombre;
    @Column
    private int capacidad;
    @Column
    private String monitor;
    @Column
    private String descripcion;
//////////RELACIONES COMENTADAS POR POSIBLE ERROR//////////
   /* @OneToMany(mappedBy = "reserva", cascade = CascadeType.PERSIST)
    private List<Reserva> reservaList = new ArrayList<>();
*/





}
