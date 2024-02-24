package bobr.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void listenMusic() {
        assertThrows(IncorrectHappinessException.class, () -> {
            Jukebox jukebox = new Jukebox(MusicType.INSTASAMKA);
            Human human = new Human(15);

            human.listenMusic(jukebox);
        });

        Jukebox jukebox = new Jukebox(MusicType.INSTASAMKA);
        Human human = new Human(20);

        assertDoesNotThrow(() -> {
            human.listenMusic(jukebox);
        });

        assertTrue(human.isDepression());
    }

    @Test
    void talk() {
        assertThrows(IncorrectHappinessException.class, () -> {
            Human human = new Human(99);

            human.talk();
            human.talk();
        });

        assertDoesNotThrow(() -> {
            Human human = new Human(50);

            for (int i = 0; i < 50; i++) {
                human.talk();
            }
        });
    }

    @Test
    void hiccup() {
        assertThrows(IncorrectHappinessException.class, () -> {
            Human human = new Human(1);

            human.hiccup();
            human.hiccup();
        });

        assertDoesNotThrow(() -> {
            Human human = new Human(50);

            for (int i = 0; i < 50; i++) {
                human.hiccup();
            }
        });
    }

    @Test
    void drink() {
        assertThrows(IncorrectHappinessException.class, () -> {
            Drink whiskey = new Drink(DrinkType.WHISKEY);
            Human human = new Human(81);

            human.drink(whiskey);
        });

        assertDoesNotThrow(() -> {
            Drink whiskey = new Drink(DrinkType.WHISKEY);
            Human human = new Human(80);

            human.drink(whiskey);
        });

        assertThrows(IncorrectHappinessException.class, () -> {
            Drink beer = new Drink(DrinkType.BEER);
            Human human = new Human(81);

            human.drink(beer);
            human.drink(beer);
            human.drink(beer);
            human.drink(beer);
        });

        assertDoesNotThrow(() -> {
            Drink beer = new Drink(DrinkType.BEER);
            Human human = new Human(81);

            human.drink(beer);
            human.drink(beer);
            human.drink(beer);
        });
    }

    @Test
    void creation() {
        assertThrows(IncorrectHappinessException.class, () -> new Human(-1));

        assertThrows(IncorrectHappinessException.class, () -> new Human(101));
    }
}