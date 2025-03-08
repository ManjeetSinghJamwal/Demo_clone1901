
public class LoopExample {

	public static void main(String[] args) {
rightTrianglePattern();
	}
public static void rightTrianglePattern() {
	int row=0;
	while(row<20) {
		System.out.print("* ");
		int col=0;
		while(col<row){
			System.out.print("* ");
		col++;
		}
		row++;
System.out.println();
	}

}
}
