import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        while(numbers.size() <= 999) {
            int ran = random.nextInt(1000);
            if (!numbers.contains(ran)) {
                numbers.add(ran);
            }
        }
        System.out.println(numbers.size());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("RandNumb.txt"))) {

            for (int i : numbers) {
                bw.write(i + "");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}