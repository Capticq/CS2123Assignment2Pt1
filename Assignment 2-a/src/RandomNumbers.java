import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    public void randomize(){
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        while(numbers.size() <= 999) {
            int ran = random.nextInt(1000);
            if (!numbers.contains(ran)) {
                numbers.add(ran);
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("RandNumb.txt"))) {

            for (int i : numbers) {
                bw.write(i + ",");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
