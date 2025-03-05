public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean validIndex(int[] arr, int num){
		try {
			int temp = arr[num];
			return true;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
	}
	public static int divide (int num1, int num2){
		try{
			int temp = num1/num2;
			return temp;
		}
		catch (ArithmeticException e){
			return 0; 
		}
	}
	public static int safeConvertStringtoInt (String str){
		try {
			int num = Integer.parseInt(str);
			return num;
		}
		catch (NumberFormatException e) {
			return 0;
		}
	}
}
