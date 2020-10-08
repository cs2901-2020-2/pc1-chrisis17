import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ProfesorTest {
    Profesor test = new Profesor();

    public void inputNameTest(){
        test.inputName("Jorge");
        boolean result = false;
        if (test.name != "" && test.name == "Jorge"){
            result = true;
        }

        Assert.assertEquals(String.valueOf(result), "true");
    }

    public void inputTitleTest(){
        test.inputTitle("matematica");
        boolean result = false;
        if (test.title != "" && test.title == "matematica"){
            result = true;
        }

        Assert.assertEquals(String.valueOf(result), "true");
    }

    public void inputLinkTest(){
        test.inputLink("2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido, 10/08 08:00-10:00 Laboratorio.");
        boolean result = false;
        if (test.link != "" && test.link == "2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido, 10/08 08:00-10:00 Laboratorio."){
            result = true;
        }

        Assert.assertEquals(String.valueOf(result), "true");
    }

    public void checkLinkTest(){
        test.inputLink("2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido, 10/08 08:00-10:00 Laboratorio.");
        boolean result = test.checkLink();

        Assert.assertEquals(String.valueOf(result), "true");
    }
}
