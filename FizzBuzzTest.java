public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz demo = new FizzBuzz();
        String result;
        String result2;
        String result3;
        String result4;
        String result5;
        result = demo.fizzBuzz(9);
        result2 = demo.fizzBuzz(15);
        result3 = demo.fizzBuzz(5);
        result4 = demo.fizzBuzz(3);
        result5 = demo.fizzBuzz(2);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}