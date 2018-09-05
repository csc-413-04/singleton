package singleton;

public class Database {
  private static Database instance = new Database();
  private int a;

  private Database() {

  }

  public static Database getInstance() {
    return instance;
  }


  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }
}
