package enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10_000;
        String grade = "";
        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액 = " + vip);

        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMOND 등급의 할인 금액 = " + diamondd);

        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액 = " + diamondd);
    }
}
