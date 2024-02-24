package bobr.task3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Jukebox {
    private MusicType type;

    public MusicType playMusic() {
        System.out.println("Music is playing");
        return this.type;
    }
}
