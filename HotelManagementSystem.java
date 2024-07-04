import java.util.InputMismatchException;
import java.util.Scanner;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Welcome to the *Hotel NAZARA*\n\nIf you want to book a room in our hotel\n\n");
            hotel.showRoomTypes();

            System.out.println("*Press 1 for 2 Guests.");
            System.out.println("*Press 2 for 2 to 4 Guests");
            System.out.println("*Press 3 for more than 4 Guests");

            int num = scanner.nextInt();
            int guests = 0;
            String roomType = "";

            switch (num) {
                case 1:
                    guests = 2;
                    break;
                case 2:
                    guests = 4;
                    break;
                case 3:
                    guests = 6;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid number of guests selected.");
            }

            System.out.println("*Press 4 for Deluxe room");
            System.out.println("*Press 5 for Premium room");
            System.out.println("*Press 6 for Luxury room");

            int opt = scanner.nextInt();
            switch (opt) {
                case 4:
                    roomType = "Deluxe";
                    break;
                case 5:
                    roomType = "Premium";
                    break;
                case 6:
                    roomType = "Luxury";
                    break;
                default:
                    throw new IllegalArgumentException("Invalid room type selected.");
            }

            new Booking(hotel, roomType, guests);
            new Booking(hotel, roomType, guests).generateReceipt();

            System.out.println("Press 100 in case of emergency");
            int emergency = scanner.nextInt();
            if (emergency == 100) {
                for (int i = 0; i < 20; i++) {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    Thread.sleep(600);
                }
            }

            System.out.println("\nPress 0 for T&C");
            int terms = scanner.nextInt();
            if (terms == 0) {
                hotel.showTermsAndConditions();
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        } catch (InterruptedException e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
