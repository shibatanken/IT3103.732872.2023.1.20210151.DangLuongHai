package Lab_01;
//Ho ten : Luong Hai Dang 
//Mssv: 20210151

import java.util.Scanner;
public class bai_6_4 {
	public static int check_month(String inputMonth) {
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] monthAbbreviations = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};

        for (int i = 0; i < 12; i++) {
            if (inputMonth.equals(months[i]) || inputMonth.equals(monthAbbreviations[i]) || inputMonth.equals(String.valueOf(i + 1))) {
                return i + 1;
            }
        }
        return -1; // Invalid month input
	}
	public static int caculateMonth(int month,int year) {
		if(month == 2 && year%4==0 && year%400 !=0) {
			return 29;
		}
		else if(month == 2 && year%400 !=0) {
			return 28;
		}
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
		return 31;
		}
		return 30;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		int Months;
		String month;
		
		System.out.print("Input month : ");
		month = sc.nextLine();
		System.err.print("Input year : ");
		year= sc.nextInt();
		Months = check_month(month);
		
		
		if(year < 0 || Months == -1) {
			System.out.println("Invalid input. Exiting program.");
			System.exit(0);
		}
		System.out.println("There are " + caculateMonth(Months,year) + " days in " + month + "/" + year );

	}
}
