public class CounterDocentes implements Observer{
    private String title;
    private String link;
    private Subject profesor;

    public CounterDocentes(Subject profesor){
        this.profesor = profesor;
        profesor.registerObserver(this);
    }

    @Override
    public void update(String title, String link) {
        this.title = title;
        this.link = link;
    }
}