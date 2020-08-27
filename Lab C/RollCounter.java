import java.util.Random;

public class RollCounter {
    
    public RollCounter() {
    }
    
    public void runExperiment(int numTimes) {
        Random r = new Random();
        int i = 0;
        int[] count = new int[13];
        while (i < numTimes) {
            count[r.nextInt(6)+1 + r.nextInt(6)+1]++;
            i++;
        }
        
        i = 2;
        System.out.println("Roll   Count");
        while (i < count.length) {
            System.out.println(i + "      " + count[i]);
            i++;
        }
    }
    
}