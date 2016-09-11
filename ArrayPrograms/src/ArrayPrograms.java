
public class ArrayPrograms {
	
	public static String display(int[] values) {
		int x = 0; String output = "";
		while(x < values.length) {
			output = output + "subscript[" + x + "] = " + values[x] + "\n";
			x++;
		}
		return output;
	}
	
	public static int sum(int[] values) {
		int x = 0; int y = 0;
		while(x < values.length) {
			y += values[x];
			x++;
		}
		return y;
	}
	
	public static double average(int[] values) {
		return (double) ArrayPrograms.sum(values) / values.length;
	}
	
	public static void loadArray(int[] values, int times) {
		int x = 0;
		while(x < times) {
			values[(int) Math.random() * values.length]++;
		}
	}
	
	
}
