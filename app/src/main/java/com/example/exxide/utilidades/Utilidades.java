package com.example.exxide.utilidades;

public class Utilidades {

    //Constantes campos tabla usuarios
    public static final String TABLA_USUARIOS="usuarios";
    public static final String CAMPO_ID_USUARIO="id_usuario";
    public static final String CAMPO_USUARIO="usuario";
    public static final String CAMPO_PASSWORD="password";
    public static final String ID_SECCION="seccion";

    public static final String CREAR_TABLA_USUARIOS ="CREATE TABLE " +
            ""+TABLA_USUARIOS+" ("+CAMPO_ID_USUARIO+ " INTEGER PRIMARY KEY AUTOINCREMENT , "+CAMPO_USUARIO+" TEXT,"+CAMPO_PASSWORD+" TEXT,"+ID_SECCION+" INT)";

    //Constantes campos tabla seccion
    public static final String TABLA_SECCION="seccion";
    public static final String CAMPO_ID_SECCION="id";
    public static final String CAMPO_SECCION="seccion";
    public static final String CAMPO_BLOQUE="bloque";
    public static final String CAMPO_VARIEDAD="variedad";
    public static final String CAMPO_TALLOS="tallos";

    public static final String CREAR_TABLA_SECCION="CREATE TABLE " +
            ""+TABLA_SECCION+" ("+CAMPO_ID_SECCION+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            +CAMPO_SECCION+" TEXT, "+CAMPO_BLOQUE+" TEXT,"+CAMPO_VARIEDAD+" TEXT ,"+CAMPO_TALLOS+" TEXT)";

    //Constantes campos tabla Costador
    public static final String TABLA_CORTADOR="cortador";
    public static final String CAMPO_ID_CORTADOR="id_cortador";
    public static final String CAMPO_CODIGO="codigo";
    public static final String CAMPO_NOM_CORTADOR="nombre";

    public static final String CREAR_TABLA_CORTADOR="CREATE TABLE " +
            ""+TABLA_CORTADOR+" ("+CAMPO_ID_CORTADOR+" INTEGER PRIMARY KEY AUTOINCREMENT, "+CAMPO_CODIGO+" INT, "+CAMPO_NOM_CORTADOR+" TEXT)";

    //Constantes campos tabla rendimeinto
    public static final String TABLA_RENDIMIENTO="rendimiento";
    public static final String CAMPO_ID_RENDIMIENTO="id_rendimiento";
    public static final String ID_BLOQUE="idbloque";
    public static final String ID_CORTADOR="idcortador";
    public static final String FECHA="fecha";
    public static final String MALLAS="mallas";
    public static final String TALLOS="tallos";
    public static final String CREAR_TABLA_RENDIMIENTO="CREATE TABLE " +
            ""+TABLA_CORTADOR+" ("+CAMPO_ID_RENDIMIENTO+" INTEGER PRIMARY KEY AUTOINCREMENT, "+ID_BLOQUE+" INT,"+ID_CORTADOR+" INT ,"+FECHA+" DATA ,"+MALLAS+" INT,"+TALLOS+" INT)";
}
