import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        Search search = new Search();
        Sort sort = new Sort();

        randomNumbers.randomize();
        ArrayList<Integer> nums = randomNumbers.getRandNums("RandNumb.txt");

        System.out.println("Linear Search:");
        search.linearSearch(nums,1);
        search.linearSearch(nums,500);
        search.linearSearch(nums,900);;

        System.out.println("\nBubble Sort:");
        ArrayList<Integer> sortedNums = sort.bubbleSort(randomNumbers.getRandNums("RandNumb.txt"));
        sort.writeSorted(sortedNums, "sortednumb.txt");
        System.out.println(nums);

        System.out.println("\nBinary Search:");
        search.binarySearch(sortedNums,1);
        search.binarySearch(sortedNums,500);
        search.binarySearch(sortedNums,900);






    }
}
