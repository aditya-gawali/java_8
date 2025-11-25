
@FunctionalInterface
public interface MyInterface {
    public void sayHello(); // single abstract method

    default void sayBye() {
        System.out.println("Bye from Interface");
    }

    public static void sayOk(){
        System.out.println("Ok from Interface");
    }
}




