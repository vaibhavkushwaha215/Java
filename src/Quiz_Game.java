import java.util.Scanner;

public class Quiz_Game {

	public static void main(String[] args){
		int Guess;
		boolean isValid;
		Scanner scanner = new Scanner(System.in);
		String[] questionSet = {"What is the capital of India?\n", "Which planet is known as the Red Planet?\n", "What is the largest animal on Earth?\n", "How many days are there in a week?\n","Which gas do humans need to breathe?\n"	};
		String[][] optionSet = {{"A) Mumbai","B) Delhi","C) Kolkata","D) Chennai"}, {"A) Earth","B) Mars","C) Jupiter","D) Venus"}, {"A) Elephant","B) Blue Whale","C) Giraffe","D) Shark"}, {"A) 5","B) 6","C) 7","D) 8"}, {"A) Oxygen","B) Nitrogen","C) Carbon dioxide","D) Hydrogen"}};
		int[] Answers = {2,2,2,3,1};
		int Score = 0;
		boolean wantToPlay = true;
		System.out.println("""
					Welcome to Quiz""");
		while (wantToPlay){
			int i = 0;
			while (i<questionSet.length && wantToPlay){
				System.out.printf("Here is your Question Number %d\n",i);
				System.out.println(questionSet[i]);
				System.out.println("The Options Are : ");
				for(String Option: optionSet[i]){
					System.out.println(Option);
				}
				System.out.println("5. Exit");
				System.out.print("Please Choose Your Answer (1/2/3/4/5): ");
				isValid = false;
					while (!isValid) {
						Guess = scanner.nextInt();
						scanner.nextLine();
						switch (Guess) {
							case 5 -> {
								isValid = true;
								System.out.println("Thank you for Participating");
								System.out.printf("Your Score so far was %d / %d\n", Score, i+1);
								wantToPlay = false;
							}
							case 1,2,3,4-> {
								isValid = true;
									if (Guess == Answers[i]) {
										System.out.println("Correct Answer!");
										Score++;
									}
									else {
										System.out.println("Incorrect!!");
									}
							}
							default -> System.out.println("Invalid Input!!");
						}
					}

				i++;
			}
			System.out.println("Congratulations!!! You have completed the Quiz!!");
			System.out.printf("Your Score is %d / 5\n",Score);
			System.out.print("Would you like to continue? (Y/N) : ");
			isValid=false;
			while (!isValid) {
				String Chose = scanner.nextLine();
				switch (Chose){
					case "Y","N" -> {
						isValid = true;
						if (Chose.equals("Y")) {
							System.out.println("Restarting...");
							wantToPlay = true;
						}
						else{
							wantToPlay = false;
							System.out.print("Thank You For Participating\nExiting....");
						}
					}
					default -> System.out.println("Invalid Input!!");
				}
			}

		}
		scanner.close();
	}
}
