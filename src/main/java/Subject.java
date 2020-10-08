public interface Subject {
    public void  registerObserver(Observer o);
    public void remobeObserver(Observer o);
    public void notifyObservers();
}
