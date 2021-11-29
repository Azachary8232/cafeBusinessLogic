import java.util.ArrayList;


public class CafeUtil {

    public int getStreakGoal(Integer numOfWeeks) {
        Integer sum = 0;
        for( int i = 1; i <= numOfWeeks; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for( int i = 0; i < prices.length; i++){
            total += prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String>menuItems){
        String menu = "";
        for( int i = 0; i < menuItems.size(); i++){
            String name = menuItems.get(i);
            System.out.println(i + " " + name);
        }
    }

    public void addCustomer(ArrayList<String>customers){
        ArrayList<String> customer = customers;
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.printf("Hello, %s!", username);
        System.out.printf(" There are %s people in front of you.", customer.size());
        customers.add(username);
        System.out.println(customer);
    }

    // public String printPriceChart(String product, double price, int maxQuantity) {
    //     String item = product \n;
    //     for( int i = 1; i < maxQuantity; i++) {
    //         item += price \n
    //     }
    // }



}