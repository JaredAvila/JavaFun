
public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator manipulation = new StringManipulator();
        // char letter = 'o';
        // String str = manipulation.trimAndConcat("     hello    ","   worm                       ");
        // Integer num = manipulation.getIndexOrNull("Coding", letter);
        // Integer num2 = manipulation.getIndexOrNull("Hello World", letter);
        // Integer num3 = manipulation.getIndexOrNull("Hi", letter);
        // System.out.println(num);
        // System.out.println(num2);
        // String word = "Hello";
        // String subString = "llo";
        // String notSubString = "worm";
        // Integer a = manipulation.getIndexOrNull(word, subString);
        // Integer b = manipulation.getIndexOrNull(word, notSubString);

        String str = manipulation.concatSubstring("Hello", 1, 2, "worm");

        System.out.println(str);
    }
}