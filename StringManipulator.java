public class StringManipulator {
    public String trimAndConcat(String strA, String strB) {
        String result = strA.trim() + strB.trim();
        return result;
    }

    public Integer getIndexOrNull(String strA, char numb) {
        Integer result = strA.indexOf(numb);
        if(result != -1) {
            return result;
        } else {
            return null;
        }
    }

    public Integer getIndexOrNull(String strA, String strB) {
        Integer result = strA.indexOf(strB);
        if(result != -1) {
            return result;
        } else {
            return null;
        }
    }

    public String concatSubstring(String strA, int num1, int num2, String strB) {
        String result = strA.substring(num1, num2) + strB;
        return result;
    }
}
