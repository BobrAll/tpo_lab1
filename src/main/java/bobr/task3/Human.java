package bobr.task3;

import lombok.Getter;

public class Human {
    public static final int MIN_HAPPINESS = 0;
    public static final int MAX_HAPPINESS = 100;

    @Getter
    private int happiness;
    @Getter
    private boolean isDepression = false;

    public Human(int happiness) {
        setHappiness(happiness);
    }

    public void talk() {
        upgradeHappiness(1);
    }

    public void listenMusic(Jukebox jukebox) {
        switch (jukebox.playMusic()) {
            case SCRIPTONIT: upgradeHappiness(20);
            case INSTASAMKA: reduceHappiness(20);
        }
    }

    public void hiccup() {
        reduceHappiness(1);
    }

    public void drink(Drink drink) {
        switch (drink.getType()) {
            case BEER: upgradeHappiness(5); break;
            case WHISKEY: upgradeHappiness(20); break;
        }
    }

    private void upgradeHappiness(int num) {
        setHappiness(getHappiness() + num);
    }

    private void reduceHappiness(int num) {
        setHappiness(getHappiness() - num);
    }

    private void setHappiness(int happiness) {
        if (happiness < MIN_HAPPINESS || happiness > MAX_HAPPINESS)
            throw new IncorrectHappinessException();
        else
            this.happiness = happiness;

        isDepression = getHappiness() == 0;
    }
}
