import java.lang.classfile.Interfaces;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static void mainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============== Welcome to Car Showroom Creation Application ===============");
        System.out.println();
        System.out.println("===================== Chose form the Given Options =====================");
        System.out.println();
        System.out.println("1. Add Showroom               2.Add Employee               3. Add Car");
        System.out.println("4. See Showrooms              5.See Employee               6. See Cars");

    }
    public static void main(String[] args) {

        //Scanner to Take Input
        Scanner sc = new Scanner(System.in);

        // array of particular class
        Showroom showroom[] = new Showroom[5];
        Employee employee[] = new Employee[5];
        Car car[] = new Car[5];

        // To count the number of cars showrooms etc.
        int showroomCounter = 0;
        int employeeCounter = 0;
        int carCounter = 0;
        int choice = 1;
        while(choice!=0) {
            mainMenu();
            choice = sc.nextInt();
            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        showroom[showroomCounter] = new Showroom();
                        showroom[showroomCounter].set();
                        showroomCounter++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 2:
                        employee[employeeCounter] = new Employee();
                        employee[employeeCounter].set();
                        employeeCounter++;
                        System.out.println();
                        System.out.println("1].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 3:
                        car[carCounter] = new Car();
                        car[carCounter].set();
                        carCounter++;
                        System.out.println();
                        System.out.println("1].ADD NEW CAR");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 4:
                        for (int i = 0; i < showroomCounter; i++) {
                            showroom[i].get();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;

                    case 5:
                        for (int i = 0; i < employeeCounter; i++) {
                            employee[i].get();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;

                    case 6:
                        for (int i = 0; i < carCounter; i++) {
                            car[i].get();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                }
            }
        }


    }
}

interface utility{
    public void get();
    public void set();
        }

