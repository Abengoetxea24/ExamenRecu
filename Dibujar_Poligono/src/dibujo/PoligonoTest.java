package dibujo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import base.Poligono;

public class PoligonoTest {

    @Test
    public void testCalcularPerimetro() {
       
        int[][] datosPrueba = {
            {3, 10, 30},
            {4, 15, 60},
            {5, 20, 100},
            {6, 25, 150}
        };

        for (int[] datos : datosPrueba) {
            
            Poligono poligono = new Poligono("Test");
            poligono.setLados(datos[0]);
            poligono.setLongitudLado(datos[1]);

           
            double perimetroCalculado = poligono.calcularPerimetro();

           
            double perimetroEsperado = datos[2];

        
            assertEquals(perimetroEsperado, perimetroCalculado, 0.001); 
        }
    }
}