package me.gonzager.ex.vehiculos;

public class Deportivo implements TipoConduccion{
    
    public Double consumo(){

        return 5.0;


    }

    public TipoConduccion anterior(){

        return new Estandar();


    }
    
    public TipoConduccion siguiente(){

        return this;



    }

    public Double velocidadMaxima() {

        return 200.0;
        
    }

}
