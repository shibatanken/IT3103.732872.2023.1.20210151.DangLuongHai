package Lab_01;


// Ho ten : Luong Hai Dang 
// Mssv: 20210151
import java.util.Scanner;

public class bai_6_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of rows of matrix");
	    int r = sc.nextInt();
	    System.out.println("Input number of columns of matrix");
	    int c  = sc.nextInt();
	 
	    int[][] a = new int[r][c];
	    int[][] b = new int[r][c];
	    int[][] sum = new int[r][c];
	    
	    // input matrix a
	    for(int i = 0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = sc.nextInt();
			}
	    }
	    
	    // input matrix b
	    for(int i = 0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j] = sc.nextInt();
			}
	    }
	    
		for(int i = 0;i<r;i++) {
			for(int j=0;j<c;j++) {
				sum[i][j] = a[i][j]+b[i][j];
			}
		}
		for(int i = 0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println("");
		}
	
	}
  
}
