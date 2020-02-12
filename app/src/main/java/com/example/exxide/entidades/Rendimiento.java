package com.example.exxide.entidades;

import java.io.Serializable;

/**
 * Created by CHENAO on 17/06/2017.
 */

public class Rendimiento implements Serializable {

    private Integer idRendimiento;
    private Integer idSeccion;
    private Integer idCortador;
    private Integer mallas;
    private Integer tallos;
    private String fecha;


    public Rendimiento(){

    }

    public Rendimiento(Integer idRendimiento, Integer idSeccion, Integer idCortador, Integer mallas, Integer tallos, String fecha) {
        this.idRendimiento = idRendimiento;
        this.idSeccion = idSeccion;
        this.idCortador = idCortador;
        this.mallas = mallas;
        this.tallos = tallos;
        this.fecha = fecha;
    }
}
