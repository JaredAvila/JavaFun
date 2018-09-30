public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava test = new PuzzleJava();
        // int[] marklArr = {3,5,1,2,7,9,8,13,25,32};
        // String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momchi", "Ishikawa"};
        String[] alphaArr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        // System.out.println(test.sumAndGreaterThanTen(marklArr)); //task #1
        // System.out.println(test.shufleAndFive(names)); //task #2
        // test.alphaShuffle(alphaArr);  // task #3
        // System.out.println(test.genTen());  // task #4
        // System.out.println(test.sortedGenTen());  // task #5
        // System.out.println(test.randomString(alphaArr));  // task $6
        System.out.println(test.arrayOfStrings(alphaArr));
        
    }
}