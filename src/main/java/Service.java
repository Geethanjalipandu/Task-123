public class Service {
    public class GameService {
    import org.springframework.stereotype.Service;
    import java.util.Random;

    @Service
    public class GameService {
        private int numberToGuess;
        private Random random;

        public GameService() {
            this.random = new Random();
            this.numberToGuess = random.nextInt(100) + 1; // Number between 1 and 100
        }

        public String guessNumber(int guessedNumber) {
            if (guessedNumber == numberToGuess) {
                return "Congratulations! You guessed the correct number.";
            } else if (guessedNumber < numberToGuess) {
                return "Too low. Try again.";
            } else {
                return "Too high. Try again.";
            }

        }
    }

    public void resetGame() {
        this.numberToGuess = random.nextInt(100) + 1;
    }
}

}
