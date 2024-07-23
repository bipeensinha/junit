import static org.junit.jupiter.api.Assertions.assertEquals;
import org.mockito.Mockito;
import org.example.AddService;
import org.example.CalcService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;

public class Mokito1 {

    @Test
    void testCalc() {
        System.out.println("**--- Test testCalc executed ---**");

        AddService addService;
        CalcService calcService;

        addService = Mockito.mock(AddService.class);
        calcService = new CalcService(addService);

        int num1 = 11;
        int num2 = 12;
        int expected = 23;

        when(addService.add(num1, num2)).thenReturn(expected);

        int actual = calcService.calc(num1, num2);

        assertEquals(expected, actual);

    }
}