package com.company;

import java.util.List;

public class Gato {

  private String nombre;
  private Double energia;
  private Double velocidad;

  public Gato(String nombre) {
    this.nombre = nombre;
    this.energia = 0.0;
    this.velocidad = 5.0;
  }

  public void comerRaton(Raton unRaton){
    System.out.println(this.nombre + " se come al raton " + unRaton.getNombre());
    this.energia += unRaton.getPeso();
    System.out.println("Ahora la energía de " + this.nombre + " es de " + this.energia);
  }

  public void comerRaton(List<Raton> unosRatones){
    for (Raton unRaton : unosRatones) {
      this.comerRaton(unRaton);
    }
    System.out.println("Despues de la panzada, la energia es de " + this.energia);
  }

  public Double correr(Integer cantidadDeMetros){
    Double tiempoDeCorrida = cantidadDeMetros / this.velocidad;
    this.energia -= 0.5 * cantidadDeMetros;
    System.out.println(this.nombre + " tardó " + tiempoDeCorrida + " en recorrer la distancia");
    return tiempoDeCorrida;
  }

  public Boolean meConvieneComerA(Raton unRaton, Integer unaDistancia){
    Double energiaGanadaPorComer = unRaton.getPeso();
    Double energiaPerdidaPorCorrer = 0.5 * unaDistancia;

    return(energiaGanadaPorComer > energiaPerdidaPorCorrer);
  }

  public String getNombre() {
    return nombre;
  }

  public Double getEnergia() {
    return energia;
  }

  public Double getVelocidad() {
    return velocidad;
  }


}
