package innerclass;

public class Main {
    public static void main(String[] args) {
//        Employee employee = new Employee() {
//            @Override
//            public String getSalary() {
//                return "10";
//            }
//
//            @Override
//            public String getDesignation() {
//                return "Software Engineer";
//            }
//        };


//        System.out.println(employee.getDesignation());

    }

    private void doSomething() {
        Employee employee = () -> "10";
        System.out.println(employee.getSalary());
    }
}
