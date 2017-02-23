/**
 * Created by user on 22/02/2017.
 */

public class Runner {
    public static void main(String[] args){

        Department.deleteAll();
        Department department1 = new Department("HR");
        Department department2 = new Department("Marketing");
        Department department3 = new Department("Sales");
        Department department4 = new Department("Finance");
        Department department5 = new Department("Admin");

        department1.save();
        department2.save();
        department3.save();
        department4.save();
        department5.save();

        Employee.deleteAll();
        Employee employee1 = new Employee("Suzie Smith", department1, 45000);
        Employee employee2 = new Employee("Pat ma' Groin", department1, 45000);

        Employee employee3 = new Employee("Jamie Jones", department2, 25000);
        Employee employee4 = new Employee("Seymour Butts", department2, 25000);

        Employee employee5 = new Employee("Ken Barlow", department3, 25000);
        Employee employee6 = new Employee("Helen Back", department3, 25000);


        Employee employee7 = new Employee("Deirde Barlow", department4, 25000);
        Employee employee8 = new Employee("Peter Barlow", department5, 25000);

        employee1.save();
        employee2.save();
        employee3.save();
        employee4.save();
        employee5.save();
        employee6.save();
        employee7.save();
        employee8.save();

//        Department tests.
//        ================
//        ================

        Department.all();

        department1.setTitle("Human Resources");
        department1.update();

        Department.all();

        department1.delete();

        Department.all();

//        Employee tests.
//        ===============
//        ===============

        Employee.all();

        employee1.setTitle("Human Resources");
        employee1.update();

        Employee.all();

        Employee1.delete();

        Employee.all();



    }
}
