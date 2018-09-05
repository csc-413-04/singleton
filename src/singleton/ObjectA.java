package singleton;

public class ObjectA {
  public void addToA() {
    Database db = Database.getInstance();
    db.setA(db.getA() + 1);
  }
}
