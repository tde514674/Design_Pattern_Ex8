import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String score;
		Scanner input = new Scanner(System.in);
		ScoreObserver observer = new ScoreObserver();
		ScoreSource source = new ScoreSource();
		source.add(observer);
		source.add(observer);
		while (true) {
			System.out.print("Enter Score ");
			score = input.nextLine();
			if(score.isBlank()) break;
			else source.setSomeData(score);
		}
		input.close();
	}
}
