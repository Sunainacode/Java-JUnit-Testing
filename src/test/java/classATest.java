import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class classATest {
   @Test
//    valid test cases for each method
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
   @Test
//    invalid test cases for each method separately to check the functionality of each method
   public void invDB(){
       int dw= classA.binToDecimal("-10010"); // must return -18 but checking for 18
       Assertions.assertEquals(18,dw);
   }
   @Test
   public void invBD(){
       String bw= classA.decToBinary(16); // must return 10000 but checking for 01111
       Assertions.assertEquals("01111",bw);
   }
   @Test
   public void invHD(){
       int hw= classA.hexToDecimal("ABF1"); // must return 44017 but checking for 44018
       Assertions.assertEquals(44018,hw);
   }
   @Test
   public void invOD(){
       int ow= classA.octToDecimal("0703"); // must return 451 but checking for 450
       Assertions.assertEquals(450,ow);
   }
   @Test
   public void invDO(){
       String dow= classA.decToOctal(451); // must return "703" but checking for "702"
       Assertions.assertEquals("702",dow);
   }
   @Test
   public void invDHB(){
       String dhw= classA.decToHexadecimal(44017); // must return "ABF1" but checking for "ABF0"
       Assertions.assertEquals("ABF0",dhw);
   }
}
