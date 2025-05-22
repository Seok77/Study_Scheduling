import java.util.Scanner;

public class Main {
	
	public static String Opponent() {
		int rsp=(int) (Math.random()*3);
		String op;
		
		if(rsp==0) {
			op="Rock";
			System.out.println(op);
			return op;
		}else if(rsp==1) {
			op="Scissors";
			System.out.println(op);
			return op;
		}else {
			op="Paper";
			System.out.println(op);
			return op;
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		String my=input.nextLine();
		String op=Opponent();
		if(op.equals("Rock") && my.equals("paper") || op.equals("Scissors") && my.equals("rock") || op.equals("Paper") && my.equals("scissors")) {
			System.out.println("You win");
		}else if(op.equals("Rock") && my.equals("scissors") || op.equals("Scissors") && my.equals("paper") || op.equals("Paper") && my.equals("rock")) {
			System.out.println("You lost :(");
		}else if(op.equals("Paper") && my.equals("paper") || op.equals("Scissors") && my.equals("scissors") || op.equals("Rock") && my.equals("rock")){
			System.out.println("Tie!");
		}
	}

}
