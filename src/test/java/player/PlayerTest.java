package player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void looses_when_say_number_is_too_low(){
        // Create a Mock
        Say say =  Mockito.mock(Say.class);
        // Simulation return value 3
        Mockito.when(say.roll()).thenReturn(3);
        Player player = new Player (say,3);
        assertFalse(player.play());
    }

    @Test
    public void looses_when_say_number_is_big(){
        // Create a Mock
        Say say =  Mockito.mock(Say.class);
        // Simulation return value 2
        Mockito.when(say.roll()).thenReturn(4);
        Player player = new Player (say,3);
        assertTrue(player.play());
    }
}