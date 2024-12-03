package cr.go.ucr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComisionVentaTest {

    @Test
    public void testVentasDentroDeRango() {
        assertEquals(1200.0 * 0.03, ComisionVenta.getCurrentInstance().calcular(1200.0), 0.01);
        assertEquals(4000.0 * 0.07, ComisionVenta.getCurrentInstance().calcular(4000.0), 0.01);
        assertEquals(20000.0 * 0.15, ComisionVenta.getCurrentInstance().calcular(20000.0), 0.01);
    }

    @Test
    public void testVentasEnLimites() {
        assertEquals(0.0 * 0.03, ComisionVenta.getCurrentInstance().calcular(0.0), 0.01);
        assertEquals(1500.0 * 0.03, ComisionVenta.getCurrentInstance().calcular(1500.0), 0.01);
        assertEquals(100000.0 * 0.15, ComisionVenta.getCurrentInstance().calcular(100000.0), 0.01);
    }

    @Test
    public void testVentasFueraDeRango() {
        assertEquals(-1.0, ComisionVenta.getCurrentInstance().calcular(-50.0));
        assertEquals(-1.0, ComisionVenta.getCurrentInstance().calcular(110000.0));
        assertEquals(-1.0, ComisionVenta.getCurrentInstance().calcular(null));
    }
}
