import java.util.*;

class MusicLibrary {
    ArrayList<String> songs = new ArrayList<>();
    Random rand = new Random();

    void addSong(String song) {
        songs.add(song);
    }

    void removeSong(String song) {
        songs.remove(song);
    }

    void playRandomSong() {
        if (!songs.isEmpty()) {
            String song = songs.get(rand.nextInt(songs.size()));
            System.out.println("Playing: " + song);
        } else {
            System.out.println("No songs to play.");
        }
    }
}

public class RazaMUSIClibrary {
    public static void main(String[] args) {
        MusicLibrary lib = new MusicLibrary();
        lib.addSong("Shape of You");
        lib.addSong("Believer");
        lib.addSong("Senorita");

        lib.playRandomSong();

        lib.removeSong("Believer");
        lib.playRandomSong();
    }
}
