package singleton;

public class Main {

    public static void main(String[] args) {
        ObjectA a = new ObjectA();
        ObjectB b = new ObjectB();
        a.addToA();
        b.addToA(5);
        Database db = Database.getInstance();
        System.out.print(db.getA());
    }
}
