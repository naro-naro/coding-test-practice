import java.util.Scanner;
public class Main {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int arr [] = new int[num];
		for (int i=0; i<num; i++) {
			arr[i] = input.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			} else if (arr[i]<min){
				min = arr[i];
			}
			
		}
		System.out.println(min + " " + max);

	}

}