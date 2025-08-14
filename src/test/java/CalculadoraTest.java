import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc;

    @BeforeEach
    void setup() {
        System.out.println("Iniciando prueba...");
        calc = new Calculadora();
    }

    @AfterEach
    void cleanup() {
        System.out.println("Prueba finalizada!\n");
    }

    // ----- SUMAR -----
    @Test
    void testSumar() {
        System.out.println("Ejecutando testSumar...");
        int resultado = calc.sumar(3, 4);
        assertEquals(7, resultado, "La suma debe ser 7");
    }

    // ----- RESTAR -----
    @Test
    void testRestarPositivos() {
        System.out.println("Ejecutando testRestarPositivos...");
        int resultado = calc.restar(10, 4);
        assertEquals(6, resultado, "La resta debe ser 6");
    }

    @Test
    void testRestarNegativos() {
        System.out.println("Ejecutando testRestarNegativos...");
        int resultado = calc.restar(-5, -3);
        assertEquals(-2, resultado, "La resta debe ser -2");
    }

    // ----- MULTIPLICAR -----
    @Test
    void testMultiplicarCero() {
        System.out.println("Ejecutando testMultiplicarCero...");
        int resultado = calc.multiplicar(0, 100);
        assertEquals(0, resultado, "La multiplicación debe ser 0");
    }

    @Test
    void testMultiplicarPosNeg() {
        System.out.println("Ejecutando testMultiplicarPosNeg...");
        int resultado = calc.multiplicar(5, -2);
        assertEquals(-10, resultado, "La multiplicación debe ser -10");
    }

    // ----- DIVIDIR -----
    @Test
    void testDividir() {
        System.out.println("Ejecutando testDividir...");
        int resultado = calc.dividir(12, 4);
        assertEquals(3, resultado, "La división debe ser 3");
    }

    @Test
    void testDividirPorCero() {
        System.out.println("Ejecutando testDividirPorCero...");
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }

    // ----- PORCENTAJE -----
    @Test
    void testPorcentajeNormal() {
        System.out.println("Ejecutando testPorcentajeNormal...");
        double resultado = calc.porcentaje(25, 200);
        assertEquals(12.5, resultado, "El porcentaje debe ser 12.5");
    }

    @Test
    void testPorcentajeTotalCero() {
        System.out.println("Ejecutando testPorcentajeTotalCero...");
        assertThrows(ArithmeticException.class, () -> calc.porcentaje(10, 0));
    }

    // ----- RAÍZ CUADRADA -----
    @Test
    void testRaizCuadradaNormal() {
        System.out.println("Ejecutando testRaizCuadradaNormal...");
        double resultado = calc.raizCuadrada(16);
        assertEquals(4.0, resultado, "La raíz cuadrada debe ser 4.0");
    }

    @Test
    void testRaizCuadradaNegativo() {
        System.out.println("Ejecutando testRaizCuadradaNegativo...");
        assertThrows(IllegalArgumentException.class, () -> calc.raizCuadrada(-9));
    }
}
