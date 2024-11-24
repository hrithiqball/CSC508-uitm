package Assignment;

import java.util.LinkedList;

public class SongPlaylist {

  private LinkedList<String> playlist;

  SongPlaylist() {
    playlist = new LinkedList<String>();

    playlist.add("Song 1");
    playlist.add("Song 2");
    playlist.add("Song 3");
    playlist.add("Song 4");
    playlist.add("Song 5");
    playlist.add("Song 6");
    playlist.add("Song 7");
    playlist.add("Song 8");
    playlist.add("Song 9");
    playlist.add("Song 10");
  }

  private void displayPlaylist() {
    System.out.println("Playlist: ");

    for (int i = 0; i < playlist.size(); i++) {
      System.out.println(playlist.get(i));
    }
  }

  public static void main(String[] args) {
    SongPlaylist playlist = new SongPlaylist();

    for (String song : playlist.playlist) {
      System.out.println(song);
    }

    playlist.displayPlaylist();
  }
}
