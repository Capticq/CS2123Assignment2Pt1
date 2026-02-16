

public class Main{
    public static void main(String[] args) {
    RandomNumbers randomNumbers = new RandomNumbers();
    randomNumbers.randomize();

    Search search = new Search();
    System.out.println(search.getRandNums("RandNumb.txt"));
    search.linearSearch(1);
    search.linearSearch(500);
    search.linearSearch(900);



    }
}