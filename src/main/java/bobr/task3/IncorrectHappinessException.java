package bobr.task3;

public class IncorrectHappinessException extends RuntimeException {
    IncorrectHappinessException() {
        super(String.format("Happiness must be in range [%d;%d]\n",
                Human.MIN_HAPPINESS, Human.MAX_HAPPINESS));
    }
}
