import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingwithJUnit { //Make Morse
    @Test
    public void Test1() {
        Alphabet myInput = new Alphabet();
        int Actual_Result = myInput.getInput();
        int Expected_Result = 0;
        Assert.assertEquals(Actual_Result, Expected_Result);
    }
    @Test
    public void Test2() {
        Alphabet myInput = new Alphabet();
        myInput.getInput("some text");
        int Actual_Result = myInput.getInput();
        int Expected_Result = 1;
        Assert.assertEquals(Actual_Result, Expected_Result);
    }
    @Test
    public void return_Morse_1(){
        {
            AssertThat(Alphabet.get("-")).isEqualTo("a");
        }
    }
}