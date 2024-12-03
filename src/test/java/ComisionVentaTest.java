//mario saborio
import cr.go.ucr.examen1.ComisionVenta;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComisionVentaTest {
    @Test
    public void testCalcularComisionRangoBajo() {
        Double resultado = ComisionVenta.getCurrentInstance().calcular(1000.0);
        assertEquals(30.0, resultado, 0.01);
    }

    @Test
    public void testCalcularComisionRangoIntermedio() {
        Double resultado = ComisionVenta.getCurrentInstance().calcular(7000.0);
        assertEquals(840.0, resultado, 0.01);
    }

    @Test
    public void testCalcularComisionFueraDeRango() {
        Double resultado = ComisionVenta.getCurrentInstance().calcular(150000.0);
        assertEquals(-1.0, resultado, 0.01);
    }

    @Test
    public void testCalcularComisionNegativa() {
        Double resultado = ComisionVenta.getCurrentInstance().calcular(-10.0);
        assertEquals(-1.0, resultado, 0.01);
    }

    @Test
    public void testCalcularComisionMaximaValida() {
        Double resultado = ComisionVenta.getCurrentInstance().calcular(100000.0);
        assertEquals(15000.0, resultado, 0.01);
    }
    
      @Test
    public void testCalculoComisionRangoBajo() {
        ComisionVenta comisionVenta = ComisionVenta.getCurrentInstance();
        double resultado = comisionVenta.calcular(1000.0);
        assertEquals(30.0, resultado, 0.01); // 3% de 1000
    }

    @Test
    public void testCalculoComisionRangoMedio() {
        ComisionVenta comisionVenta = ComisionVenta.getCurrentInstance();
        double resultado = comisionVenta.calcular(7000.0);
        assertEquals(840.0, resultado, 0.01); // 12% de 7000
    }

    @Test
    public void testCalculoComisionRangoAlto() {
        ComisionVenta comisionVenta = ComisionVenta.getCurrentInstance();
        double resultado = comisionVenta.calcular(25000.0);
        assertEquals(3750.0, resultado, 0.01); // 15% de 25000
    }

    @Test
    public void testCalculoComisionFueraDeRango() {
        ComisionVenta comisionVenta = ComisionVenta.getCurrentInstance();
        double resultado = comisionVenta.calcular(150000.0);
        assertEquals(-1.0, resultado, 0.01); // Caso fuera de rango
    }
    @Test
    public void testCalculoComisionMontoNull() {
        // Crear una instancia de ComisionVenta
        ComisionVenta comisionVenta = ComisionVenta.getCurrentInstance();
        
        // Calcular la comisión para un monto null
        double resultado = comisionVenta.calcular(null);
        
        // Verificar que el resultado es -1.0 cuando el monto es null
        assertEquals(-1.0, resultado, 0.01);
    }
        
    @Test
    public void testCalculoSaliendoDelFor() {
        // Crear una instancia de ComisionVenta
        ComisionVenta comisionVenta = ComisionVenta.getCurrentInstance();
        
        // Calcular la comisión para un monto negativo
        double resultado = comisionVenta.calcular(0.1);
        
        // Verificar que el resultado es -1.0 cuando el monto es negativo
        assertEquals(-1.0, resultado, 0.01);
    }
    
}
