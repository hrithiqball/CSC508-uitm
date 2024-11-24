package Assignment;

import java.util.LinkedList;
import java.util.Scanner;

public class SongPlaylist {

  private LinkedList<String> playlist;
  private Scanner scanner = new Scanner(System.in);
  private String currentSong;
  private int currentIndex;
  private boolean isPlaying;
  private boolean isInvalid;

  final String RED = "\033[31m";
  final String GREEN = "\033[32m";
  final String BLUE = "\033[34m";
  final String PURPLE = "\033[35m";
  final String YELLOW = "\033[33m";
  final String RESET = "\033[0m";

  private static final String UP = "w";
  private static final String DOWN = "s";
  private static final String PLAY = "p";
  private static final String ADD = "+";
  private static final String DELETE = "-";
  private static final String QUIT = "q";

  SongPlaylist() {
    playlist = new LinkedList<String>();

    playlist.add("The Chainsmokers - Closer");
    playlist.add("Alan Walker - Faded");
    playlist.add("Beren Olivia - Is That What You Like Now");
    playlist.add("Olivia Rodrigo - drivers license");
    playlist.add("Katy Perry - Roar");
    playlist.add("Taylor Swift - Love Story");
    playlist.add("Ariana Grande - 7 rings");
    playlist.add("Dua Lipa - Don't Start Now");
    playlist.add("Billie Eilish - bad guy");
    playlist.add("Shawn Mendes - Stitches");

    currentIndex = 0;
    currentSong = "";
    isPlaying = false;
    isInvalid = false;
  }

  private void navigateUp() {
    if (currentIndex > 0) {
      currentIndex--;
    } else {
      System.out.println("You are at the top of the playlist.");
    }
  }

  private void navigateDown() {
    if (currentIndex < playlist.size() - 1) {
      currentIndex++;
    } else {
      System.out.println("You are at the bottom of the playlist.");
    }
  }

  private void playSong() {
    if (playlist.isEmpty()) {
      System.out.println("Playlist is empty!");
      return;
    }

    currentSong = playlist.get(currentIndex);
    isPlaying = true;
  }

  private void addSong() {
    System.out.print("Enter new song title: ");
    String newSong = scanner.nextLine();

    playlist.add(newSong);

    System.out.println("Added: " + newSong);
  }

  private void deleteSong() {
    if (playlist.isEmpty()) {
      System.out.println("Playlist is empty!");
      return;
    }

    System.out.println("Removing: " + playlist.get(currentIndex));
    playlist.remove(currentIndex);

    if (currentIndex >= playlist.size())
      currentIndex = playlist.size() - 1;
  }

  private void displayHeader() {
    System.out.print("\033\143");
    System.out.flush();

    System.out.println(GREEN + "                ~ ♫♪ SpotiJavafy ♪♫ ~" + RESET + "\n");
    System.out.println(YELLOW + "    [w = up, s = down, p = play, + = add, - = delete]" + RESET);
    displayDivider();
  }

  private void displayPlaylist() {
    for (int i = 0; i < playlist.size(); i++) {
      if (i == currentIndex)
        System.out.println(BLUE + "> " + (i + 1) + ". " + playlist.get(i) + RESET);
      else
        System.out.println("  " + (i + 1) + ". " + playlist.get(i));
    }
  }

  private void displayFooter() {
    displayDivider();

    if (isPlaying)
      System.out.println("Currently Playing: " + PURPLE + currentSong + " ♪" + RESET);
    else
      System.out.println("Select a song to play.");

    displayDivider();
  }

  private void displayDivider() {
    System.out.println(GREEN + "=".repeat(60) + RESET);
  }

  private void displayUI() {
    displayHeader();
    displayPlaylist();
    displayFooter();

    if (isInvalid)
      System.err.println(RED + "Invalid command. Use [Arrow Keys/SPACE/DEL/+]." + RESET);
  }

  private void quitApp() {
    scanner.close();
    System.out.println("Goodbye!");
  }

  private void navigatePlaylist() {
    displayUI();

    while (true) {
      String input = scanner.nextLine().trim();
      isInvalid = false;

      switch (input.toLowerCase()) {
        case UP:
          navigateUp();
        case DOWN:
          navigateDown();
        case PLAY:
          playSong();
        case DELETE:
          deleteSong();
        case ADD:
          addSong();
        case QUIT:
          quitApp();
        default:
          isInvalid = true;
      }

      displayUI();
    }
  }

  public static void main(String[] args) {
    SongPlaylist playlist = new SongPlaylist();

    playlist.navigatePlaylist();
  }
}
