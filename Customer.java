import java.util.HashSet;
import java.util.Set;

public class Customer {
    Subway sub = new Bread();

    private Thread customersOrder = new Thread() {
        public void run() {            
            while (true) {
                int meat, cheese, lettuce, tomato, pickle;
                int cucumber, onion, sauce, mayo;
                
                //meat
                meat = (int) (Math.random() * 2.0);
                while (meat == 1) {
                    CustomerMeat();
                    meat = (int) (Math.random() * 2.0);
                } try {
                    sleep(500l);
                } catch (Exception e) { }
                
                //Cheese
                cheese = (int) (Math.random() * 2.0);
                while (cheese == 1) {
                    CustomerCheese();
                    cheese = (int) (Math.random() * 2.0);                
                } try {
                    sleep(500l);
                } catch (Exception e) { }
                
                //Lettuce
                lettuce = (int) (Math.random() * 2.0);
                while (lettuce == 1) {
                    CustomerLettuce();
                    lettuce = (int) (Math.random() * 2.0);                
                } try {
                    sleep(500l);
                } catch (Exception e) { }
                
                //Tomato
                tomato = (int) (Math.random() * 2.0);
                while (tomato == 1) {
                    CustomerTomato();
                    tomato = (int) (Math.random() * 2.0);
                } try {
                    sleep(500l);
                } catch (Exception e) { }
                
                //Pickle
                pickle = (int) (Math.random() * 2.0);
                while (pickle == 1) {
                    CustomerPickle();
                    pickle = (int) (Math.random() * 2.0);                
                } try {
                    sleep(500l);
                } catch (Exception e) { }
                
                //Cucumber
                cucumber = (int) (Math.random() * 2.0);
                while (cucumber == 1) {
                    CustomerCucumber();
                    cucumber = (int) (Math.random() * 2.0);                
                } try {
                    sleep(500l);
                } catch (Exception e) { }
            
                //Onion
                onion = (int) (Math.random() * 2.0);
                while (onion == 1) {
                    CustomerOnion();
                    onion = (int) (Math.random() * 2.0);                
                } try {
                    sleep(500l);
                } catch (Exception e) { }
            
                //Sauce
                sauce = (int) (Math.random() * 2.0);
                while (sauce == 1) {
                    CustomerSauce();
                    sauce = (int) (Math.random() * 2.0);                
                } try {
                    sleep(500l);
                } catch (Exception e) { }
            
                //Mayo
                mayo = (int) (Math.random() * 2.0);
                while (mayo == 1) {
                    CustomerMayo();
                    mayo = (int) (Math.random() * 2.0);                
                } try {
                    sleep(500l);
                } catch (Exception e) { }

                CustomerReciept();
                break;
            }  try {
                sleep(5000l);
            } catch (Exception e) { }
        }
    };

    private Set<CustomerObserver> observers;
    private String name;

    public Customer(String name) {
        this.name = name;
        observers = new HashSet<CustomerObserver>();
        customersOrder.start();
    }

    public String getName() {
        return name;
    }

    public synchronized void addCustomerObserver(CustomerObserver observe) {
        observers.add(observe);
    }

    public synchronized void removeCustomerObserver(CustomerObserver observe) {
        observers.remove(observe);
    }

    protected synchronized void CustomerMeat() {
        System.out.println("Customer " +name+ " ingin daging.");
        sub = new Meat(sub);
        CustomerListener e = new CustomerListener(this);
        for (CustomerObserver observer : observers) {
            observer.Meat(e);
        }
    }

    protected synchronized void CustomerCheese() {
        System.out.println("Customer " +name+ " ingin keju.");
        sub = new Cheese(sub);
        CustomerListener e = new CustomerListener(this);
        for (CustomerObserver observer : observers) {
            observer.Cheese(e);
        }
    }

    protected synchronized void CustomerLettuce() {
        System.out.println("Customer " +name+ " ingin selada.");
        sub = new Lettuce(sub);
        CustomerListener e = new CustomerListener(this);
        for (CustomerObserver observer : observers) {
            observer.Lettuce(e);
        }
    }

    protected synchronized void CustomerTomato() {
        System.out.println("Customer " +name+ " ingin tomat.");
        sub = new Tomato(sub);
        CustomerListener e = new CustomerListener(this);
        for (CustomerObserver observer : observers) {
            observer.Tomato(e);
        }
    }

    protected synchronized void CustomerPickle() {
        System.out.println("Customer " +name+ " ingin acar.");
        sub = new Pickle(sub);
        CustomerListener e = new CustomerListener(this);
        for (CustomerObserver observer : observers) {
            observer.Pickle(e);
        }
    }

    protected synchronized void CustomerCucumber() {
        System.out.println("Customer " +name+ " ingin ketimun.");
        sub = new Cucumber(sub);
        CustomerListener e = new CustomerListener(this);
        for (CustomerObserver observer : observers) {
            observer.Cucumber(e);
        }
    }

    protected synchronized void CustomerOnion() {
        System.out.println("Customer " +name+ " ingin bawang merah.");
        sub = new Onion(sub);
        CustomerListener e = new CustomerListener(this);
        for (CustomerObserver observer : observers) {
            observer.Onion(e);
        }
    }

    protected synchronized void CustomerSauce() {
        System.out.println("Customer " +name+ " ingin saus.");
        sub = new Sauce(sub);
        CustomerListener e = new CustomerListener(this);
        for (CustomerObserver observer : observers) {
            observer.Sauce(e);
        }
    }

    protected synchronized void CustomerMayo() {
        System.out.println("Customer " +name+ " ingin mayones.");
        sub = new Mayo(sub);
        CustomerListener e = new CustomerListener(this);
        for (CustomerObserver observer : observers) {
            observer.Mayo(e);
        }
    }

    protected void CustomerReciept() {
        System.out.println("\n    ~~ Karcis Customer " +name+ " ~~ ");
        System.out.println(sub.makeSub());
        System.out.printf("Harga Total $%.2f", sub.cost());
    }
}
