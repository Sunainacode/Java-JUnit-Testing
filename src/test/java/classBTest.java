import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class classBTest {

    @Test
    public void testIntAdd(){
        int d=classB.addDec(20,31);
        Assertions.assertEquals(51,d);
    }

    @Test
    public void testBinAdd(){
        String bin1 = classB.addBin("001110","001111");
        Assertions.assertEquals("011101",bin1);
    }

}