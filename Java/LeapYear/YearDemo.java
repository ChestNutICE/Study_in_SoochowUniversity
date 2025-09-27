import java.util.Scanner;
public class YearDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        int days = getDays(year, month);
        System.out.println(year + "年" + month + "月有" + days + "天");
        sc.close();
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getDays(int year, int month) {
        if (month != 2) {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                return 30;
            } else {
                return 31;
            }
        } else {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
    }
}