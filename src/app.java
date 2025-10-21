import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interesRate = 1.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter invesment Amout: ");
        money = input.nextDouble();

        System.out.println("Enter number of month: ");
        month = input.nextInt();

        System.out.println("Enter annual interest rate in percentage: ");
        interesRate = input.nextDouble();


        double totalInterest = 0;
        for(int i =1; i < month; i++);
        {
            totalInterest += money * (interesRate / 100) / 12 * month;
        }
        System.out.println("Total interest: " + totalInterest);
    }
    }

//    import java.util.Scanner;
//
//public class app {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("--- CHƯƠNG TRÌNH TÍNH LÃI SUẤT ---");
//            System.out.println("Bấm 1 để bắt đầu tính lãi");
//            System.out.println("Bấm 0 để thoát chương trình");
//            System.out.print("Lựa chọn của bạn: ");
//            int choice = input.nextInt();
//
//            if (choice == 0) {
//                System.out.println("Chương trình đã thoát. Tạm biệt!");
//                break;
//            } else if (choice == 1) {
//                System.out.print("Enter investment amount: ");
//                double money = input.nextDouble();
//
//                System.out.print("Enter number of months: ");
//                int month = input.nextInt();
//
//                System.out.print("Enter annual interest rate in percentage: ");
//                double interestRate = input.nextDouble();
//
//                double totalInterest = 0;
//                for (int i = 1; i <= month; i++) {
//                    totalInterest += money * (interestRate / 100) / 12;
//                }
//
//                System.out.println("Total interest: " + totalInterest);
//                System.out.println();
//            } else {
//                System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập 0 hoặc 1.\n");
//            }
//        }
//    }
//}

