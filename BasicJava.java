import java.util.ArrayList;

public class BasicJava{
    public Boolean print1To255() {
        for(int i = 1; i < 256; i++) {
            System.out.println(i);
        }
        return true;
    }

    public Integer printAllOdd() {
        int sum = 0;
        for(int i = 1; i < 256; i++) {
            if(i%2 != 0) {
                sum+= i;
            }
        }
        return sum;
    }

    public void printSum() {
        int sum = 0;
        for(int i = 0; i < 256; i++) {
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    public void iterateArray(int[] arr) {
        for(int i: arr) {
            System.out.println(i);
        }
    }

    public Integer findMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public Integer getAverage(int[] arr) {
        int length = 0;
        int sum = 0;
        for(int i: arr) {
            sum += i;
            length++;
        }
        return sum / length;
    }

    public ArrayList<Integer> arrayWithOdds() {
        ArrayList<Integer> theOdds = new ArrayList();
        for(int i = 1; i < 256; i++) {
            if(i % 2 != 0) {
                theOdds.add(i);
            }
        }
        return theOdds;
    }

    public Integer greaterThanY(int[] arr, int Y) {
        int bigger = 0;
        for (int i : arr) {
            if (i > Y) {
                bigger++;
            }
        }
        return bigger;
    }

    public void squareTheValues(int[] arr) {
        int[] x = arr;
        int counter = 0;
        for (int i : arr) {
            x[counter] = i * i;
            counter++;
        }
        for (int j : x) {
            System.out.println(j);
        }
    }

    public void removeTheNegatives(int[] arr){
        int indexVar = 0;
        for (int i: arr){
            if (i < 0) {
                arr[indexVar] = 0;
            }
            indexVar += 1;
        }
        for (int j : arr) {
            System.out.println(j); 
        }
    }

    public ArrayList<Integer> minMaxAvg(int[] arr) {
        ArrayList<Integer> theAnswer = new ArrayList();
        int min = arr[0];
        int max = arr[0];
        int count = 0;
        int sum = 0;
        for (int i : arr) {
            if (i < min) {
                min = arr[count];
            } else if (i > max) {
                max = arr[count];
            }
            sum += i;
            count++;
        }
        int avg = sum / count;
        theAnswer.add(min);
        theAnswer.add(max);
        theAnswer.add(avg);
        return theAnswer;
    }

    public ArrayList<Integer> shiftingTheArray(int[] arr) {
        ArrayList<Integer> newList = new ArrayList();
        for (int i : arr) {
            newList.add(i);
        }
        newList.add(0);
        newList.remove(0);
        return newList;
    }
    
}