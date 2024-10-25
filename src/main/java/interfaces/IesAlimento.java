package interfaces;

import java.time.LocalDate;

public interface IesAlimento {

  // Vamos a trabajar con fechas!
  public void setCaducidad(LocalDate fc);
  public LocalDate getCaducidad();

  public int getCalorias();

}
