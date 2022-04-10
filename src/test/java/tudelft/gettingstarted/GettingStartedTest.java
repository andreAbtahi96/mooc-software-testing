package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test // indicated j unit test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
       int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }
    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15,result);
   }
    @Test
    public void addFiveToNegFive(){
        int result = new GettingStarted().addFive(-5);
        Assertions.assertEquals(0, result);
   }

   @Test
    public void addFiveToADecimalValue(){
        double result = new GettingStarted().addFive(0.5);
        Assertions.assertEquals(5.5, result);
   }

   @Test
    public void addFiveToALargePrecisionValue(){
        double result = new GettingStarted().addFive(1.66666666666666666);
        Assertions.assertEquals(6.6666666666666666, result);
   }

                 
}

