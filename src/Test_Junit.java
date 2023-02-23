public class Test_Junit
import org.junit.Assert;
import org.junit.Test;

public class TestingwithJUnit {
    @Test
    public void Test1() {
        Morse myInput_Words = new Morse();
        int Actual_Result = myInput_Words.getInput();
        int Expected_Result = 0;
        Assert.assertEquals(Actual_Result, Expected_Result);
    }
    @Test
    public void Test2() {
        Morse myInput_Words = new Morse();
        myInput_Words.setInput("some text");
        int Actual_Result = myInput_Words.getInput();
        int Expected_Result = 1;
        Assert.assertEquals(Actual_Result, Expected_Result);
    }
    @Test
    public void return_check(){
        public void return_check_char(){
            assertThat(Morse.get("-")).isEqualTo("a");
        }

        @Test
        public void return_word_check(){
            public void retur_word_check_Morse(){
                assertThat(Morse.get("---")).isEqualTo("aaa");
            }

        }
