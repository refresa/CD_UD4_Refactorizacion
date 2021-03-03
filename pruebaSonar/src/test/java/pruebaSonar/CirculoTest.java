package circulo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas para la clase Circulito
 * @author profesor
 */
public class CirculoTest {

    /**
     * Test of establecerX method, of class Circulito.
     */
    @Test
    public void testEstablecerX() {
        System.out.println("establecerX");
        int valorX = 0;
        Circulito instance = new Circulito();
        instance.setCoordenadaX(valorX);
    }

    /**
     * Test of establecerY method, of class Circulito.
     */
    @Test
    public void testEstablecerY() {
        System.out.println("establecerY");
        int valorY = 0;
        Circulito instance = new Circulito();
        instance.setCoordenadaY(valorY);
    }

    /**
     * Test of setRadio method, of class Circulito.
     */
    @Test
    public void testEstablecerRadio() {
        System.out.println("setRadio");
        Circulito instance = new Circulito();
        instance.setRadio(0.0);
        instance.setRadio(0.1);
        instance.setRadio(-0.1);
    }

    /**
     * Test of obtenerX method, of class Circulito.
     */
    @Test
    public void testObtenerX() {
        System.out.println("obtenerX");
        Circulito instance = new Circulito(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaX();
        assertEquals(expResult, result);
    }


    /**
     * Test of obtenerY method, of class Circulito.
     */
    @Test
    public void testObtenerY() {
        System.out.println("obtenerY");
        Circulito instance = new Circulito(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaY();
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerRadio method, of class Circulito.
     */
    @Test
    public void testObtenerRadio() {
        System.out.println("obtenerRadio");
        Circulito instance = new Circulito(0,0,0.1);
        double result = instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(0.1);
        result= instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(-0.1);
        result= instance.getRadio();
        assertEquals(0.0, result,0);
    }

    /**
     * Test of obtenerDiametro method, of class Circulito.
     */
    @Test
    public void testObtenerDiametro() {
        System.out.println("obtenerDiametro");
        Circulito instance = new Circulito(0,0,0.1);
        double result = instance.obtenerDiametro();
        assertEquals(0.2, result,0);
    }

    /**
     * Test of obtenerCircunferencia method, of class Circulito.
     */
    @Test
    public void testObtenerCircunferencia() {
        System.out.println("obtenerCircunferencia");
        Circulito instance = new Circulito(0,0,0.1);
        double expResult = 0.6283185;
        double result = instance.obtenerCircunferencia();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test of obtenerArea method, of class Circulito.
     */
    @Test
    public void testObtenerArea() {
        System.out.println("obtenerArea");
        Circulito instance = new Circulito(0,0,0.1);
        double expResult = 0.0314159;
        double result = instance.obtenerAreaCirculo();
        assertEquals(expResult, result,1e-6);
    }

    
    /**
     * Test of trasladarCentro method, of class Circulito.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
        Circulito instance = new Circulito();
        int resultx=instance.obtenerX();
        int resulty=instance.obtenerY();
        instance.trasladarCentro();
        int resultnx = instance.obtenerX();
        int resultny = instance.obtenerY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+6, resultny);
    }

}