package enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("HTTP CODE: ");
        int code = scanner.nextInt();

        HttpStatus[] values = HttpStatus.values();
        for (HttpStatus value : values) {
            if (value.getCode() == code) {
                System.out.println(value.getCode() + " " + value.getMessage());
                System.out.println("isSuccess = " + (code==200 ? true : false));
            }
        }
    }
}
