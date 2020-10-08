import java.util.ArrayList;

public class Profesor implements Subject{
    String name = "";
    String title = "";
    String link = "";
    private ArrayList observers;

    public Profesor(){
        observers = new ArrayList();
    }

    public void inputName(String name){
        this.name = name;
    }

    public void inputTitle(String title){
        this.title = title;
    }

    public void inputLink(String link){
        this.link = link;
    }

    public boolean checkLink(){
        int anio = 0;
        String ciclo = "";
        String idioma = "";
        String curso = "";
        String seccion = "";
        String semana = "";
        String semanaNum = "";
        String profesor = "";
        int mes;
        int dia;
        int horaInicial;
        int horaFInal;
        String tipo;

        for (int i = 0; i < 4; i++){
            anio = (anio*10) + Character.getNumericValue(link.charAt(i));
        }
        for (int i = 5; i < 7; i++){
            ciclo += link.charAt(i);
        }
        for (int i = 15; i < 17; i++){
            idioma += link.charAt(i);
        }

        if (anio >= 2020){
            return true;
        }

        return false;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void remobeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        if (checkLink()) {
            for (int i = 0; i < observers.size(); i++) {
                Observer observer = (Observer) observers.get(i);
                observer.update(title, link);
            }
        }
    }
}
