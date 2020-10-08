import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ObserverTest {
    Profesor test = new Profesor();
    CounterAlumnos counterAlumnos = new CounterAlumnos(test);

    public void notifyTest(){
        test.inputTitle("math");
        test.inputLink("2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido, 10/08 08:00-10:00 Laboratorio.");
        test.notifyOberservers();
        boolean result = false;

        if (test.title == counterAlumnos.title){
            result = true;
        }
        Assert.assertEquals(String.valueOf(result), "false");
    }
}
