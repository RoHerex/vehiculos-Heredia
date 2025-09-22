package me.gonzager.ex.vehiculos;

public class Estandar implements TipoConduccion{


    public Double consumo(){

        return  10.0;


    }

    public TipoConduccion anterior(){

        return new Ecologico();


    }
    
    public TipoConduccion siguiente(){

        return new Deportivo();



    }

    public Double velocidadMaxima() {

        return 150.0;
        
    }

}
