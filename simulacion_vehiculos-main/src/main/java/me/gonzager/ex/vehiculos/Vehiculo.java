package me.gonzager.ex.vehiculos;

public class Vehiculo{
    private Double cantCombustible;
    private Double kilometraje;
    private Double consumo;
    private Double velocidad;
    private final String TipoConduccion;

    public Double cantCombustible() {
        return cantCombustible;
    }

    public Double kilometraje() {
        return kilometraje;
    }

    public Double consumo() {
        return consumo;
    }

    public Double velocidad() {
        return velocidad;
    }

    public String tipoConduccion() {
        return TipoConduccion;
    }

    public Vehiculo(Double cantCombustible, Double kilometraje, Double consumo, Double velocidad, String TipoConduccion) {
        this.cantCombustible = cantCombustible; //litros
        this.kilometraje = kilometraje; //km
        this.consumo = consumo; //km/litros
        this.velocidad = velocidad; // km/h
        this.TipoConduccion = TipoConduccion;
    }

        public void desplazar(Integer distancia){
      if (((1.0 / consumo)* distancia)> cantCombustible){
          kilometraje += (int)(cantCombustible * consumo);
          cantCombustible = 0.0;
          throw new RuntimeException("Combustible insuficiente, solo pude recorrer X del total de Y kilometros.");

      }
      else{
        cantCombustible -= ((1.0 / consumo)* distancia);
        kilometraje += distancia;
      }
   }

}

