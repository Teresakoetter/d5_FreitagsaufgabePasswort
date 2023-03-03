import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Main;
import org.junit.jupiter.api.Test;


public class MainTest {

    @Test
    void when5CharactersThenTrue(){
        //given
        String PWCorrectLength = "a2345";
                //when
        boolean actual = Main.pWLength(PWCorrectLength);
        //then
        assertEquals(true, actual);
    }

    @Test
    void whenNot5CharactersThenFalse(){
        //given
        String PWInCorrectLength = "attt2345";
        //when
        boolean actual = Main.pWLength(PWInCorrectLength);
        //then
        assertEquals(false, actual);
    }

}
