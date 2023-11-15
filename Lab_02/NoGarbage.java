package LAB_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
// Luong Hai Dang - 20210151
public class NoGarbage {
		public static void main(String[] args) throws IOException {
			String filename = "C:\\Users\\PhongHoang\\eclipse-workspace\\Java_23\\src\\Test2.java";
			byte[] inputString= {0};
			long startTime,endTime;
			inputString = Files.readAllBytes(Paths.get(filename));
			startTime = System.currentTimeMillis();
			StringBuilder garbage = new StringBuilder();
			for(byte b : inputString) {
				garbage.append((char) b) ;
			}
			endTime = System.currentTimeMillis();
			System.out.println(endTime-startTime);
		}
}