public class AnonymousInnerClass {

    public static void main(String[] args) {
        Employee emp = new Employee() {
            @Override
            public String getSalary() {
                return "10";
            }

            @Override
            public String getName() {
                return "Software Engineer";
            }
        };

        System.out.println(emp.getName() + emp.getSalary());
    }
}

interface Employee{
    public String getSalary();
    public String getName();
}
