package lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};

        int value = findValue(intArr, 4);
        System.out.println(value);

    }

    private static int findValue(int[] intArr, int target) {
        for (int i : intArr) {
            if (i == target) {
                return target;
            }
        }
        return -1;
    }
}
