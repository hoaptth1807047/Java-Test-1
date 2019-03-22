import entity.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- Thông tin game ----");
        System.out.println("Vui lòng nhập tên game: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Vui lòng nhập mô tả: ");
        String description = scanner.nextLine();
        System.out.println("Vui lòng nhập giá: ");
        String price = scanner.nextLine();
        System.out.println("Vui lòng nhập ngày phát hành: ");
        String createAt = scanner.nextLine();
        System.out.println("Vui lòng nhập trang chủ: ");
        String home = scanner.nextLine();
        Game game = new Game(name, description, price, createAt, home);
        System.out.println(game.toString());
    }
}
