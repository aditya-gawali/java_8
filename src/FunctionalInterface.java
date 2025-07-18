interface Parent{
    default void sayHello(){
        System.out.println("Hello");
    }

    public static void sayBye(){
        System.out.println("Bye");
    }
}

class Child implements Parent{

}



public class FunctionalInterface {
    public static void main(String[] args) {
        // this is an interface having single abstract method and any no. of default and static method
        Parent c = new Child();
        c.sayHello();
        Parent.sayBye();
        // @FunctionalInterface


        // we can define the functional interface abstract method using lambda expression
        MyInterface inter = () -> "Hello from lambda expression";

        System.out.println(inter.sayHello());
    }


}




