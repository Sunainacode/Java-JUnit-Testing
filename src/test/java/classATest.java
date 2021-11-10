import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class classATest {
    @Test
    public void testDB(){
        int d1= classA.binToDecimal("00110");
        int d2= classA.hexToDecimal("AB0F");
        int d3= classA.octToDecimal("00772");
        String db=classA.decToBinary(75);
        String dto=classA.decToOctal(56);
        String dh=classA.decToHexadecimal(99);
        Assertions.assertEquals(6,d1,0.0);
        Assertions.assertEquals(506,d3,0.0);
        Assertions.assertEquals(43791,d2,0.0);
        Assertions.assertEquals("1001011",db);
        Assertions.assertEquals("70",dto);
        Assertions.assertEquals("63",dh);
    }
}
