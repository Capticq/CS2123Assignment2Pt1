import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    public ArrayList<Integer> nums =  new ArrayList<>();

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

    public ArrayList<Integer> getRandNums(String path){
        nums =  new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = br.readLine()) != null) {

                line = line.trim();
                String[] parts = line.split(",");
                for (String part : parts) {
                    nums.add(Integer.parseInt(part));
                }
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return nums;
    }

}
