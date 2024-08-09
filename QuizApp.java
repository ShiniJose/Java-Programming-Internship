import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApp {
    static final int NUMBER_OF_QUESTIONS = 5;
    static String[] questions = new String[NUMBER_OF_QUESTIONS];
    static String[][] options = new String[NUMBER_OF_QUESTIONS][4];
    static String[] correctAnswers = new String[NUMBER_OF_QUESTIONS];
    static  Scanner scan = new Scanner(System.in);
    static Timer timer = new Timer();
    public QuizApp() {
        addQuestions();
    }
    
    // addQuestions() is for adding questions into the quiz class
    public void addQuestions() {
        questions[0] = "What is the Capital of India?";
        options[0] = new String[]{"1. New Delhi", "2. Maharashtra", "3. Tamil Nadu", "4. Kerala"};
        correctAnswers[0] = "1";

        questions[1] = "Who is the president of India in 2024?";
        options[1] = new String[]{"1. Rajendra Prasad", "2. A.P.J Abdul Kalam", "3. Droupadi Murmu", "4. Pratibha Devisingh Patil"};
        correctAnswers[1] = "3";

        questions[2] = "What is the biggest ocean in Asia?";
        options[2] = new String[]{"1. Atlantic Ocean", "2. Pacific Ocean", "3. Indian Ocean", "4. Arctic Ocean"};
        correctAnswers[2] = "2";

        questions[3] = "Who is the Prime Minister of India in 2024?";
        options[3] = new String[]{"1. Jawaharlal Nehru", "2. Indira Gandhi", "3. Rajiv Gandhi", "4. Narendra Modi"};
        correctAnswers[3] = "4";

        questions[4] = "What is the longest river in India?";
        options[4] = new String[]{"1. Godavari River", "2. Yamuna River", "3. Ganga River", "4. Narmada River"};
        correctAnswers[4] = "3";
    }
    
   
    
    // giveQuiz() is for giving questions to user
    public void giveQuiz() {
        int score = 0;
        
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.println("Enter your answer (1/2/3/4): ");
            TimerTask task = new TimerTask() {
                public void run() {
                    System.out.println("\nTime's up! Moving to the next question.");
                    scan.nextLine(); // Clear buffer
                }
            };

            timer.schedule(task, 60000); // Set timer for 1 minute (60000 milliseconds)

            String userAnswer = scan.next();
            task.cancel(); // Cancel the timer if the user answers on time
            
            
            if (userAnswer.equals(correctAnswers[i])) {
                System.out.println("Congrats! Your answer is correct");
                score++;
            } else {
                System.out.println("Sorry! Your answer is wrong");
            }
            System.out.println("");
        }
        
        System.out.println("Your total score is: " + score + " out of " + NUMBER_OF_QUESTIONS);
    }
    
    public static void main(String[] args) {
        QuizApp quiz = new QuizApp();
        quiz.giveQuiz();
    }
}
