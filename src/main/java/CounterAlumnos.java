public class CounterAlumnos implements Observer{
    public String title;
    public String link;
    public Subject profesor;

    public CounterAlumnos(Subject profesor){
        this.profesor = profesor;
        profesor.registerObserver(this);
    }

    @Override
    public void update(String title, String link) {
        this.title = title;
        this.link = link;
    }
}