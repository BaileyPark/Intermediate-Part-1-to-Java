package lang.math.test;

import java.util.Random;

public class LottoGenerator {

    private int[] rottos;
    private int count;

    public int[] getRottos() {
        return rottos;
    }

    public int[] generator() {
        rottos = new int[6];
        count = 0;

        while (count < 6) {
            int num = new Random().nextInt(45) + 1;
            if (duplicateCheck(num)){
                rottos[count] = num;
                count++;
            }
        }
        return rottos;
    }

    private boolean duplicateCheck(int num){
        for (int i = 0; i < count; i++) {
            if (rottos[i] == num) {
                return false;
            }
        }
        return true;
    }

}
