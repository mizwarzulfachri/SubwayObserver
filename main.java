import java.util.Scanner;

class main {

    public static void main (String[] args) {

        // Input nama employee.
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Siapa nama employee hari ini?\nNama : ");
        String name = scan.next();
        System.out.println();
        System.out.print("Siapa nama customer hari ini?\nNama : ");
        String i = scan.next();
        System.out.println();

        // input berakhir.
        
        // Membuat objek.
        
        Employee owner1 = new Employee(name);
        Customer customers = new Customer(i);
        customers.addCustomerObserver(owner1);
        
        
        // objek berakhir.
        scan.close();
    }
}