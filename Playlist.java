import java.util.LinkedList;
import java.util.Scanner;

public class Playlist {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Playlist Menu ---");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. View Playlist");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song name to add: ");
                    String song = sc.nextLine();
                    playlist.add(song);
                    System.out.println(song + " added to playlist.");
                    break;

                case 2:
                    System.out.print("Enter song name to remove: ");
                    String removeSong = sc.nextLine();
                    if (playlist.remove(removeSong)) {
                        System.out.println(removeSong + " removed.");
                    } else {
                        System.out.println("Song not found!");
                    }
                    break;

                case 3:
                    System.out.println("\nYour Playlist:");
                    if (playlist.isEmpty()) {
                        System.out.println("No songs in playlist.");
                    } else {
                        for (int i = 0; i < playlist.size(); i++) {
                            System.out.println((i + 1) + ". " + playlist.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
