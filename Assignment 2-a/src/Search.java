import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Search {
    public ArrayList<Integer> nums =  new ArrayList<>();

    public ArrayList<Integer> getRandNums(String path){
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

    public void linearSearch(int searchNum){
        long start = System.nanoTime();

        for (Integer num : nums) {
            if (num == searchNum) {
                long end = System.nanoTime();
                System.out.println(end - start);
            }
        }
    }

}

