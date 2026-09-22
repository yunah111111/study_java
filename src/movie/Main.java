package movie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Seat[] seats = new Seat[10];

        for (int i = 0; i < seats.length; i++) {
            seats[i] = new Seat();
            seats[i].seatNumber = "K" + (i + 5);
        }

        while (true) {
            System.out.println("==== 메뉴 선택 ====");
            System.out.println("1. 전체 좌석 조회");
            System.out.println("2. 좌석 예약");
            System.out.println("3. 예약 취소");
            System.out.println("4. 좌석 정보 수정");
            System.out.println("5. 좌석 삭제");
            System.out.println("0. 종료");
            System.out.print("번호 입력: ");
            int menu = sc.nextInt();

            if (menu == 1) {
                for (int i = 0; i < seats.length; i++) {
                    if (seats[i] != null) {
                        seats[i].showInfo();
                    }
                }
            } else if (menu == 2) {
                System.out.print("예약할 좌석 번호를 입력해주세요 (K열): ");
                String num = sc.nextLine();

                for (int i = 0; i < seats.length; i++) {
                    if (seats[i] != null && seats[i].seatNumber.equals(num)) {
                        seats[i].reserve();
                        System.out.println("예약되었습니다.");
                    }
                }
            } else if (menu == 3) {
                System.out.print("취소할 좌석 번호를 입력해주세요 (k열): " );
                String num = sc.nextLine();

                for (int i = 0; i < seats.length; i++) {
                    if (seats[i] != null && seats[i].seatNumber.equals(num)) {
                        seats[i].cancel();
                        System.out.println("예약이 취소되었습니다.");
                    }
                }
            } else if (menu == 4) {
                System.out.print("수정할 좌석 번호를 입력해주세요 (k열)");
                String num = sc.nextLine();

                for (int i = 0; i < seats.length; i++) {
                    if (seats[i] != null && seats[i].seatNumber.equals(num)) {
                        System.out.print("새 좌석 번호를 입력해주세요 (k열)");
                        String newNum = sc.nextLine();
                        seats[i].seatNumber = newNum;
                        System.out.println("좌석이 수정되었습니다.");
                    }
                }
            } else if (menu == 5){
                System.out.print("삭제할 좌석 번호를 입력해주세요 (k열): " );
                String num = sc.nextLine();

                for (int i = 0; i < seats.length; i++) {
                    if (seats[i] != null && seats[i].seatNumber.equals(num)) {
                        seats[i] = null;
                        System.out.println("좌석이 삭제되었습니다...?");
                    }
                }

            } else if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        } sc.close();
    }
}
