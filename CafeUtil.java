
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
        for( int i = 0; i < menuItems.length; i++){
            System.out.println(i + menuItems[i]);
        }
    }

    // public String printPriceChart(String product, double price, int maxQuantity) {
    //     String item = product \n;
    //     for( int i = 1; i < maxQuantity; i++) {
    //         item += price \n
    //     }
    // }



}