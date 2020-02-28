/**
* @author Yelikov Ilya
* @version 1.0
**/
public class Main {
	/**
	* @param args cli arguments
	**/
	public static void main(String[] args) {
	System.out.println("Starting project");
        int a = 0;
        char b = 'c';
        double c = -2.0;
        byte d = 126;
        short e = 111;
        long f = 1000202;
        float g = 0.005f;
        boolean h = false;

        System.out.println("This is int: " + a);
        System.out.println("This is char: " + b);
        System.out.println("This is double: " + c);
        System.out.println("This is byte: " + d);
        System.out.println("This is short: " + e);
        System.out.println("This is long: " + f);
        System.out.println("This is float: " + g);
        System.out.println("This is boolean: " + h);

        byte v_byte = 120;
        short v_short = 129;
        char v_char = 'a';
        int v_int = 65999;
        long v_long = 4294967296L;
        float v_float = 0.33333334f;
        double v_double = 0.3333333333333333;
        boolean v_boolean = true;

        System.out.print('\n' + "Alphabet: ");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch);
        }

        long begin = new java.util.Date().getTime();

        for (long i = 0; i < 100000000; i++) {}

        long end = new java.util.Date().getTime();
        System.out.println('\n' + "Long time: " + (end - begin));

        begin = new java.util.Date().getTime();

        for (int i = 0; i < 100000000; i++) {}

        end = new java.util.Date().getTime();
        System.out.println("Int time: " + (end - begin));

        int [] mas = {12, 43, 12, -65, 778, 123, 32, 76};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Matrix: ");

        int [][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int)Math.round(Math.random()*10);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
