package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] splitfruits = fruits.split(",");
        for (String fruit : splitfruits) {
            System.out.println(fruit);
        }
        String joinedString = String.join("->", splitfruits);
        System.out.println("joinedString = " + joinedString);

    }
}
