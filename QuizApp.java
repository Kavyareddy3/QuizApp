import java.util.*;

public class QuizApp {

    // ---- INNER CLASS (DO NOT REMOVE) ----
    static class QuizQuestion {
        String question;
        String[] options;
        int correctIndex;

        QuizQuestion(String question, String[] options, int correctIndex) {
            this.question = question;
            this.options = options;
            this.correctIndex = correctIndex;
        }
    }
    // --------------------------------------

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<QuizQuestion> quiz = new ArrayList<>();

        quiz.add(new QuizQuestion(
                "Which language is used for Android development?",
                new String[]{"A) Python", "B) Java", "C) HTML", "D) C++"},
                1));

        quiz.add(new QuizQuestion(
                "Which keyword is used to inherit a class in Java?",
                new String[]{"A) this", "B) extends", "C) super", "D) import"},
                1));

        quiz.add(new QuizQuestion(
                "Which of the following is not OOP concept?",
                new String[]{"A) Encapsulation", "B) Inheritance", "C) Polymorphism", "D) Compilation"},
                3));

        int score = 0;

        System.out.println("********** ONLINE QUIZ APP **********");

        for (QuizQuestion q : quiz) {
            System.out.println("\n" + q.question);

            for (String opt : q.options) {
                System.out.println(opt);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char ans = sc.next().toUpperCase().charAt(0);
            int ansIndex = ans - 'A';

            if (ansIndex == q.correctIndex) {
                score++;
            }
        }

        System.out.println("\n********** RESULT **********");
        System.out.println("Your Score: " + score + "/" + quiz.size());

        sc.close();
    }
}

