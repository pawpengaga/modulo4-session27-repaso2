package modelo;

import java.time.LocalDate;

import interfaces.IesAlimento;

public class Cereal implements IesAlimento {

  private String marca;
  private double precio;
  private String tipoCereal;
  private LocalDate caducidad;

  public Cereal(String marca, String tipoCereal, double precio){
    this.marca = marca;
    this.tipoCereal = tipoCereal;
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

  public String getTipoCereal() {
    return tipoCereal;
  }

  public void setTipoCereal(String tipoCereal) {
    this.tipoCereal = tipoCereal;
  }



  @Override
  public void setCaducidad(LocalDate fc) {
    this.caducidad = fc;
  }

  @Override
  public LocalDate getCaducidad() {
    return caducidad;
  }

  // Los enum van en casos que son cerrados cerrados
  // Por lo tanto, este no es situable para el uso de enums porque da posibilidades abiertas por medio de un "else"

  @Override
  public int getCalorias() {
    if(tipoCereal.equalsIgnoreCase("espelta")){
      return 5;
    } else if (tipoCereal.equalsIgnoreCase("maiz")){
      return 8;
    } else if (tipoCereal.equalsIgnoreCase("trigo")){
      return 12;
    } else {
      return 15;
    }
  }

  @Override
  public String toString() {
    return "Cereal \nMarca: " + marca + ", Precio: " + precio + ", tipoCereal=" + tipoCereal + ", caducidad=" + caducidad + "]";
  }

  

}
