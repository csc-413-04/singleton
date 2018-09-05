package singleton;

public class ObjectB {
  public void addToA(int num) {
    Database db = Database.getInstance();
    db.setA(db.getA() + num);
  }
}
