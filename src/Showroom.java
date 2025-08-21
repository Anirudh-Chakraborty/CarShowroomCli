import java.util.*;


public class Showroom implements utility{
    String name;
    String location;
    String headName;
    int num_of_employee;
    int num_of_Car;
    int showroom_Number = 0;

    @Override
    public void get() {
        System.out.println("Showroom Number" + showroom_Number);
        System.out.println("Showroom name " + name);
        System.out.println("Showroom Address: "+location);
        System.out.println("Manager Name: "+headName);
        System.out.println("Total Employees: "+num_of_employee);
        System.out.println("Total Cars In Stock: "+num_of_Car);

    }

    @Override
    public void set() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        name = sc.nextLine();
        System.out.print(("SHOWROOM ADDRESS: "));
        location = sc.nextLine();
        System.out.print("MANAGER NAME: ");
        headName = sc.nextLine();
        System.out.print("TOTAL NO OF EMPLOYEES: ");
        num_of_employee = sc.nextInt();
        System.out.print("TOTAL CARS IN STOCK: ");
        num_of_Car= sc.nextInt();

        showroom_Number = showroom_Number++;
    }
}
