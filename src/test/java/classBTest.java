import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class classBTest {

   @Test
   public void testAdd(){
       int d=classB.addDec(20,31);
       Assertions.assertEquals(51,d);
       String bin1 = classB.addBin("001110","001111");
       Assertions.assertEquals("011101",bin1);
   }

   @Test
   public void invTestBinAdd(){
       String bin1 = classB.addBin("0010","0001"); // must return "0011" but checking for "1100"
       Assertions.assertEquals("1100",bin1);
   }

   @Test
   public void invTestDecAdd(){
       int dec1 = classB.addDec(25,-6); // must return 19 but checking for 31
       Assertions.assertEquals(31,dec1);
   }

}
