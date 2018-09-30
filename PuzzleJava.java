import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> sumAndGreaterThanTen(int[] arr) {
        ArrayList<Integer> greaterThanTen = new ArrayList();
        int sum = 0;
        for (int i : arr) {
            if (i > 10) {
                greaterThanTen.add(i);
            }
            sum += i;
        }
        System.out.println(sum);
        return greaterThanTen;
    }

    public ArrayList<String> shufleAndFive(String[] arr) {
        ArrayList<String> names = new ArrayList();
        ArrayList<String> longNames = new ArrayList();
        for (String i : arr) {
            names.add(i);
        }
        Collections.shuffle(names);
        for (String j : names) {
            if (j.length() > 5) {
                longNames.add(j);
            }
            System.out.println(j);
        }
        return longNames;
    }

    public void alphaShuffle(String[] arr) {
        ArrayList<String> alphaArr = new ArrayList();
        for (String i : arr) {
            alphaArr.add(i);
        }
        Collections.shuffle(alphaArr);
        System.out.println(alphaArr);
        System.out.println(alphaArr.get(25));
        ArrayList<String> vowels = new ArrayList();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        vowels.add("y");
        for (String i : vowels) {
            if (alphaArr.get(0) == i) {
                System.out.println("The first letter is a vowel, lucky you!");
            }
        }
        if (alphaArr.get(0) == "y") {
            System.out.println("sometimes....");
        }
        System.out.println(alphaArr.get(0));
    }

    public ArrayList<Integer> genTen() {
        ArrayList<Integer> intList = new ArrayList();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            intList.add(rand.nextInt(46) + 55);
        }
        return intList;
    }

    public ArrayList<Integer> sortedGenTen () {
        ArrayList<Integer> intList = new ArrayList();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            intList.add(rand.nextInt(46) + 55);
        }
        Collections.sort(intList);
        return intList;
    }

    public String randomString(String[] arr) {
        String randString = "";
        int randNum;
        Random rand = new Random();
        ArrayList<String> alpha = new ArrayList();
        for (String i : arr) {
            alpha.add(i);
        }
        for (int j = 0; j < 5; j++) {
            randNum = rand.nextInt(26);
            randString += alpha.get(randNum);
        }
        return randString;
    }

    public ArrayList<String> arrayOfStrings(String[] arr) {
        ArrayList<String> alpha = new ArrayList();
        ArrayList<String> stringList = new ArrayList();
        String randString = "";
        int randNum;
        Random rand = new Random();
        for (String i : arr) {
            alpha.add(i);
        }
        for (int j = 0; j < 10; j++) {
            randString = "";
            for (int q = 0; q < 5; q++) {
                randNum = rand.nextInt(26);
                randString += alpha.get(randNum);
            }
            stringList.add(randString);
        }
        return stringList;
    }


}