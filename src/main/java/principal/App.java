package principal;

import java.time.LocalDate;
import java.util.ArrayList;

import interfaces.IesAlimento;
import modelo.Cereal;
import modelo.Detergente;
import modelo.Vino;

public class App {
  public static void main(String[] args) {

    System.err.println("---------------------------------------------------------\n");

    Detergente det1 = new Detergente("MAS", 2.5);
    det1.setVolume(23);
    det1.setDescuento(2);
    det1.setTipoEnvase("Botella de plastico pequenia");

    System.out.println(det1);

    System.out.println("...................................................................\n");
    
    Cereal cereal = new Cereal("Crunchy", "espelta", 4.5);
    cereal.setCaducidad(LocalDate.of(2025, 10, 24));
    System.out.println(cereal);
    System.out.println("Calorias: " + cereal.getCalorias());
    
    System.out.println();
    System.out.println("...................................................................\n");

    Vino gato = new Vino("El borracho", "Tinto", 15, 5.8);
    gato.setVolume(330);
    gato.setTipoEnvase("Caja de carton");
    gato.setCaducidad(LocalDate.of(2026, 6, 30));
    gato.setDescuento(5);

    System.out.println(gato);

    System.out.println("***************************************************************************");

    ArrayList<IesAlimento> lista = new ArrayList<>();
    
    lista.add(cereal);
    lista.add(gato);
    int totalCalorias = 0;

    // Hacemos el for solo usando los datos de la interfaz

    for (IesAlimento elementos : lista) {
      totalCalorias += elementos.getCalorias();
    }

    System.out.println("Total calorias: " + totalCalorias);

  }
}
