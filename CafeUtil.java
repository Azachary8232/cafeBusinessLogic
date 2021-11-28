
public class CafeUtil {

    public int getStreakGoal(Integer numOfWeeks) {
        Integer sum = 0;
        for( int i = 1; i <= numOfWeeks; i++){
            sum += i;
        }
        return sum;
    }



}