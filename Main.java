public class Main
{
    int val1 = 400;
    long val2 = (int)val1;
    float val3 = (int)val1;
    double val4 = (int)val1;
    
	public static void main(String[] args) {
	    Main m = new Main();
        // System.out.println(val1);
		System.out.println("Widening Cating ="+ m.val1);
		System.out.println("Widening Cating ="+ m.val2);
		System.out.println("Widening Cating ="+ m.val3);
		System.out.println("Widening Cating ="+ m.val4);
	}
}



// public class Main
// {
//     double val1 = 125.78; //give 300.89 and observe the byte output
    
//     int val2 = (int)val1;
//     short val3 = (short)val1;
//     byte val4 = (byte)val1;
// 	public static void main(String[] args) {
// 	    Main m = new Main();
// 		System.out.println("Widening Cating ="+ m.val1);
// 		System.out.println("Widening Cating ="+ m.val2);
// 		System.out.println("Widening Cating ="+ m.val3);
// 		System.out.println("Widening Cating ="+ m.val4);

// 	}
// }