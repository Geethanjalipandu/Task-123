
    public class GameController {
    import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/game")
    public class GameController {

        @Autowired
        private GameService gameService;

        @GetMapping("/guess")
        public String guessNumber(@RequestParam int number) {
            return gameService.guessNumber(number);
        }

        @PostMapping("/reset")
        public String resetGame() {
            gameService.resetGame();
            return "Game has been reset. Try to guess the new number.";
        }
    }


}
}
