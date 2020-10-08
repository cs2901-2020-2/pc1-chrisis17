public class CE2A implements Observer{
    public String title;
    public String link;
    public Subject profesor;

    public CE2A(Subject profesor){
        this.profesor = profesor;
        profesor.registerObserver(this);
    }

    @Override
    public void update(String title, String link) {
        this.title = title;
        this.link = link;
    }
}
