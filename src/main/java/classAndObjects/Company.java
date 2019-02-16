package classAndObjects;

public class Company {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Ccccc", "Ddddd", 1988, 12);
        Employee employee3 = new Employee("Fffff", "Ggggg", 1990, 10);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee1.returnNull());
    }
}
