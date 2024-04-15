package lang.math.test;

public class LottoMain {

    public static void main(String[] args) {

        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] rottos = lottoGenerator.generator();
        System.out.print("로또 번호: ");
        for (int rotto : rottos) {
            System.out.print(rotto + " ");
        }
    }
}
