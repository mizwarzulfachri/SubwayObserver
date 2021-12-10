public class Employee implements CustomerObserver {

    private String employee;

    public Employee(String name) {
        employee = name;
    }

    public void Meat(CustomerListener event) {
        System.out.println(employee + " memasukkan daging.\n");
    }

    public void Cheese(CustomerListener event) {
        System.out.println(employee + " memasukkan keju.\n");
    }

    public void Lettuce(CustomerListener event) {
        System.out.println(employee + " memasukkan selada.\n");
    }

    public void Tomato(CustomerListener event) {
        System.out.println(employee + " memasukkan tomat.\n");
    }

    public void Pickle(CustomerListener event) {
        System.out.println(employee + " memasukkan acar.\n");
    }

    public void Cucumber(CustomerListener event) {
        System.out.println(employee + " memasukkan ketimun.\n");
    }

    public void Onion(CustomerListener event) {
        System.out.println(employee + " memasukkan bawang merah.\n");
    }

    public void Sauce(CustomerListener event) {
        System.out.println(employee + " memasukkan saus.\n");
    }

    public void Mayo(CustomerListener event) {
        System.out.println(employee + " memasukkan mayones.\n");
    }
    
}
