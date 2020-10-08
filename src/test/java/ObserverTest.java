import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ObserverTest {
    Profesor test = new Profesor();


    public void notifyCounterAlumnosTest(){
        CounterAlumnos counterAlumnos = new CounterAlumnos(test);
        test.inputTitle("math");
        test.inputLink("2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido, 10/08 08:00-10:00 Laboratorio.");
        test.notifyOberservers();
        boolean result = false;

        if (test.title == counterAlumnos.title){
            result = true;
        }
        Assert.assertEquals(String.valueOf(result), "false");
    }

    public void notifyCounterDocentesTest(){
        CounterDocentes counterDocentes = new CounterDocentes(test);
        test.inputTitle("math");
        test.inputLink("2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido, 10/08 08:00-10:00 Laboratorio.");
        test.notifyOberservers();
        boolean result = false;

        if (test.title == counterDocentes.title){
            result = true;
        }
        Assert.assertEquals(String.valueOf(result), "false");
    }

    public void notifyDGATest(){
        DGA dga = new DGA(test);
        test.inputTitle("math");
        test.inputLink("2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido, 10/08 08:00-10:00 Laboratorio.");
        test.notifyOberservers();
        boolean result = false;

        if (test.title == dga.title){
            result = true;
        }
        Assert.assertEquals(String.valueOf(result), "false");
    }

    public void notifyCE2ATest(){
        CE2A ce2A = new CE2A(test);
        test.inputTitle("math");
        test.inputLink("2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido, 10/08 08:00-10:00 Laboratorio.");
        test.notifyOberservers();
        boolean result = false;

        if (test.title == ce2A.title){
            result = true;
        }
        Assert.assertEquals(String.valueOf(result), "false");
    }
}
