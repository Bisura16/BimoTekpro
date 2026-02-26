package nomor3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        for (int i = 0; i < 3; i++) {
            staff[i].raiseSalary(5);
        }

        for (int i = 0; i < 3; i++) {
            staff[i].print();
        }
        printCompare(staff[0], staff[1]);
        printCompare(staff[1], staff[2]);
        printCompare(staff[2], staff[0]);
    }

    static void printCompare(Employee a, Employee b) {
        int hasil = a.compare(b);

        if (hasil < 0)
            System.out.println(a.getName() + " gaji lebih kecil dari " + b.getName());
        else if (hasil > 0)
            System.out.println(a.getName() + " gaji lebih besar dari " + b.getName());
        else
            System.out.println(a.getName() + " gajinya sama dengan " + b.getName());
    }

}
