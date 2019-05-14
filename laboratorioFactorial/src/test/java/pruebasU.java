
import laboratorio.factorial;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;


public class pruebasU {
        private factorial f;
    

    
    @Test
        (expected = IllegalArgumentException.class)
    public void pruebaNegativo() {
       
        f.FactorialN(-2);
       // fail("Debería haber saltado una excepción - no se puede calcular el factorial de un número negativo");
    }
    
    
        @Test
    public void pruebaNormal() {
        assertEquals(120, f.FactorialN(5));
    }

}
