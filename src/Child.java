
public class Child implements MyInterface {

    @Override
    public void sayHello() {
        System.out.println("Hello Child");
    }

    public void sayBye() {
        System.out.println("Bye Child");
    }

    public static void main(String[] args) {
        MyInterface child = new Child();
        child.sayHello();
        child.sayBye();

        MyClass myClass = new MyClass();
        myClass.sayHello();

        C.sayHello();
    }
}


interface A {
    default void sayHello() {
        System.out.println("Hello A");
    }
}

interface B {
    default void sayHello(){
        System.out.println("Hello B");
    }
}

class MyClass  implements A,B {

    public void sayHello(){
        B.super.sayHello();
    }
}


interface C {
    static void sayHello(){
        System.out.println("Hello C");
    }
}



