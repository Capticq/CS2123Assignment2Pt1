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
        sort.writeSorted(sort.bubbleSort(nums), "sortednumb.txt");
        //System.out.println(nums);

        /*
        When calling next sorting algorithms, use randomNumbers.getRandNums instead of nums as the input array
        because nums becomes sorted after calling bubble sort, and the sorting algorithms need to be used on RandNumb.txt
         */
        System.out.println("\nBinary Search:");
        search.binarySearch(nums,1);
        search.binarySearch(nums,500);
        search.binarySearch(nums,900);






    }
}
