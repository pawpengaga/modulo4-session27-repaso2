package modelo;

import interfaces.IconDescuento;
import interfaces.IesLiquido;

public class Detergente implements IesLiquido, IconDescuento {

  public String marca;
  public double precio;
  private double volumen;
  private String tipoEnvase;
  private double descuento;

  // El constructor solo recibe una marca y un precio
  public Detergente(String marca, double precio){
    this.marca = marca;
    this.precio = precio;
  }
  
  public String getMarca() {
    return marca;
  }


  public void setMarca(String marca) {
    this.marca = marca;
  }


  public double getPrecio() {
    return precio;
  }


  public void setPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public void setDescuento(double desc) {
    this.descuento = desc;
  }

  @Override
  public double getDescuento() {
    return descuento;
  }

  @Override
  public double getPrecioDescuento() {
    return precio - (precio * (descuento /100));
  }

  @Override
  public void setVolume(double v) {
    this.volumen = v;
  }

  @Override
  public double getVolume() {
    return volumen;
  }

  @Override
  public void setTipoEnvase(String env) {
    this.tipoEnvase = env;
  }

  @Override
  public String getTipoEnvase() {
    return tipoEnvase;
  }

  @Override
  public String toString() {
    return "Detergente \nMarca: " + marca + ", Precio: " + precio + ",\n Descuento: " + descuento + ",\nVolumen: " + volumen + ", Tipo de envase: " + tipoEnvase;
  }


}
