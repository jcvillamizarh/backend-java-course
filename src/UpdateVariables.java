public class UpdateVariables {
    public static void main(String[] args) {
        int salary = 1000;
        // it has a bonus $200
        //reassign a value it could be salary = salary +200; or salary += 200;
        salary += 200;
        System.out.println(salary);
        // discount of $50 it could be salary = salary - 50; salary -= 50;
        salary -= 50;
        System.out.println(salary);
        //2 extra hours $30 each one.
        salary += (30 * 2) - 45;
        System.out.println(salary);

        //updating strings
        String employeeName = "Camilo";
        employeeName = employeeName + "Villa";
        System.out.println(employeeName);
        employeeName = "Juan" + employeeName;
        System.out.println(employeeName);
    }
}
