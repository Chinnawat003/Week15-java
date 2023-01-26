interface Fruit{
    // declare constant fields
    String color = "Red color fruit , Interface";
    void favorite();  // declare abstract methods
    default void province(){ //Default methods of interface
        System.out.println("Chanthaburi");
    }
    interface Message{
        void msg();
    }
}


interface Brand{
    void name(); // declare abstract methods
}

class Apple implements Fruit,Brand, Fruit.Message {

    public void msg(){
        System.out.println(Fruit.color + "Nested Interfance");
    }
    @Override
    public void name() {
        System.out.println("Dole brand");
    }

    public void province(){
        System.out.println("A Interface default method");
    }
    public void favorite(){
        System.out.println(color);
    }
}

public class Main {
    public static void main(String[] args) {
        Apple objApp = new Apple();
        Apple objApp2 = new Apple();
        Apple objApp3 = new Apple();
        Fruit.Message objApp4 = new Apple();
        objApp4.msg();
        objApp3.name();
        objApp2.province();
        objApp.favorite();
    }
}