package modelo;

import java.time.LocalDate;

import interfaces.IconDescuento;
import interfaces.IesAlimento;
import interfaces.IesLiquido;

public class Vino implements IconDescuento, IesLiquido, IesAlimento {

  private String marca;
  private String tipoVino;
  private double grados;
  private double precio;

  private double volumen;

  private String tipoEnvase;
  private LocalDate caducidad;
  
  private double descuento;


  public Vino(String marca, String tipoVino, double grados, double precio) {
    this.marca = marca;
    this.tipoVino = tipoVino;
    this.grados = grados;
    this.precio = precio;

  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getTipoVino() {
    return tipoVino;
  }


  public void setTipoVino(String tipoVino) {
    this.tipoVino = tipoVino;
  }


  public double getGrados() {
    return grados;
  }


  public void setGrados(double grados) {
    this.grados = grados;
  }


  public double getPrecio() {
    return precio;
  }


  public void setPrecio(double precio) {
    this.precio = precio;
  }


  @Override
  public void setCaducidad(LocalDate fc) {
    this.caducidad = fc;
  }

  @Override
  public LocalDate getCaducidad() {
    return caducidad;
  }

  @Override
  public int getCalorias() {
    return (int) grados * 10;
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
  public void setDescuento(double desc) {
    this.descuento = desc;
  }

  @Override
  public double getDescuento() {
    return descuento;
  }

  @Override
  public double getPrecioDescuento() {
    return precio - (precio * (descuento / 100));
  }

  @Override
  public String toString() {
    return "Vino [marca=" + marca + ", tipoVino=" + tipoVino + ", grados=" + grados + ", precio=" + precio
        + " Precio con descuento: " + getPrecioDescuento() + ", volumen=" + volumen + ", tipoEnvase=" + tipoEnvase + ", caducidad=" + caducidad + ", descuento="
        + descuento + "]";
  }

  

}
