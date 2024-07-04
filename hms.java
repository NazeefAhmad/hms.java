// import java.util.HashMap;
// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class HotelNazara {
//     static HashMap<String, Integer> roomInventory = new HashMap<>();
    
//     static {
//         roomInventory.put("Deluxe", 10);
//         roomInventory.put("Premium", 5);
//         roomInventory.put("Luxury", 3);
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int num = 0;
//         int opt = 0;

//         try {
//             System.out.println("Welcome to the *Hotel NAZARA*\n\nIf you want to book a room in our hotel\n\n");
//             System.out.println("*Press 1 for 2 Guests.");
//             System.out.println("*Press 2 for 2 to 4 Guests");
//             System.out.println("*Press 3 for more than 4 Guests");

//             num = scanner.nextInt();

//             if (num == 1 || num == 2 || num == 3) {
//                 deluxe(num);
//                 premium(num);
//                 luxury(num);

//                 System.out.println("*Press 4 for Deluxe room");
//                 System.out.println("*Press 5 for Premium room");
//                 System.out.println("*Press 6 for Luxury room");

//                 opt = scanner.nextInt();

//                 switch (opt) {
//                     case 4:
//                         if (checkAvailability("Deluxe", num)) {
//                             System.out.println("Congratulations! You are allotted with Deluxe room");
//                             receipt(num, 2000);
//                         } else {
//                             System.out.println("Sorry, Deluxe rooms are fully booked.");
//                         }
//                         break;
//                     case 5:
//                         if (checkAvailability("Premium", num)) {
//                             num = (num == 1) ? 2 : (num == 2) ? 4 : 6;
//                             System.out.println("Congratulations! You are allotted with Premium room");
//                             receipt(num, 4000);
//                         } else {
//                             System.out.println("Sorry, Premium rooms are fully booked.");
//                         }
//                         break;
//                     case 6:
//                         if (checkAvailability("Luxury", num)) {
//                             num = (num == 1) ? 3 : (num == 2) ? 6 : 9;
//                             System.out.println("Congratulations! You are allotted with Luxury room");
//                             receipt(num, 6000);
//                         } else {
//                             System.out.println("Sorry, Luxury rooms are fully booked.");
//                         }
//                         break;
//                     default:
//                         System.out.println("Invalid option selected.");
//                         break;
//                 }
//             } else {
//                 System.out.println("Invalid number of guests selected.");
//                 return;
//             }

//             System.out.println("Press 100 in case of emergency");
//             num = scanner.nextInt();
//             if (num == 100) {
//                 for (int i = 0; i < 20; i++) {
//                     java.awt.Toolkit.getDefaultToolkit().beep();
//                     Thread.sleep(600);
//                 }
//             }

//             System.out.println("\nPress 0 for T&C");
//             num = scanner.nextInt();
//             if (num == 0) {
//                 conditions();
//             }

//         } catch (InputMismatchException e) {
//             System.out.println("Invalid input. Please enter a number.");
//             scanner.nextLine(); // Clear the invalid input
//         } catch (InterruptedException e) {
//             System.out.println("An unexpected error occurred: " + e.getMessage());
//         } finally {
//             scanner.close();
//         }
//     }

//     public static boolean checkAvailability(String roomType, int num) {
//         if (roomInventory.get(roomType) >= num) {
//             roomInventory.put(roomType, roomInventory.get(roomType) - num);
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public static void deluxe(int num) {
//         try {
//             System.out.printf("The cost of deluxe room per person is %d\n", num * 2000);
//             System.out.println("This room comes with a basic view from a window.");
//             System.out.println("A comfortable size bed.");
//             System.out.println("Free wifi");
//             System.out.println("Hot running water 24X7\n\n\n");
//         } catch (Exception e) {
//             System.out.println("Error calculating deluxe room cost: " + e.getMessage());
//         }
//     }

//     public static void premium(int num) {
//         try {
//             System.out.printf("The cost of premium room per person is %d per night\n", num * 4000);
//             System.out.println("It comes with a great view from window as well as balcony.");
//             System.out.println("Free wifi");
//             System.out.println("A twin size bed");
//             System.out.println("Air conditioning");
//             System.out.println("LED TV + Netflix");
//             System.out.println("Hot running water 24X7.\n\n\n");
//         } catch (Exception e) {
//             System.out.println("Error calculating premium room cost: " + e.getMessage());
//         }
//     }

//     public static void luxury(int num) {
//         try {
//             System.out.printf("The cost of luxury room per person is %d\n", num * 6000);
//             System.out.println("It is one of the best rooms in our Hotel.");
//             System.out.println("It comes with all the facilities of the above rooms included.");
//             System.out.println("FREE lunch and dinner as complimentary.");
//             System.out.println("A personal cab available for sightseeing.\n\n\n");
//         } catch (Exception e) {
//             System.out.println("Error calculating luxury room cost: " + e.getMessage());
//         }
//     }

//     public static void receipt(int num, int roomCost) {
//         try {
//             System.out.println("\n\n\n     HOTEL NAZARA\n\nYour booking is successful\n");
//             System.out.printf("*Total guests are %d\n", num * 2);
//             System.out.printf("*Your room no. is %d\n", num + 200);
//             System.out.printf("*Your Total amount is %d\n", num * roomCost);
//             System.out.println("*This booking is valid only for 24 hours only.");
//             System.out.println("*For any assistance please contact us at: 9990518959; 9026475321.");
//         } catch (Exception e) {
//             System.out.println("Error printing receipt: " + e.getMessage());
//         }
//     }

//     public static void conditions() {
//         try {
//             System.out.println("Terms and Conditions for Hotel Nazara");
//             System.out.println("Please read these Terms and Conditions carefully before making a reservation or staying at Hotel Nazara. By making a reservation or staying at Hotel Nazara, you agree to be bound by these Terms and Conditions. If you do not agree with any part of these Terms and Conditions, you should not make a reservation or stay at Hotel Nazara.");
//             System.out.println("Reservation and Payment: All reservations at Hotel Nazara are subject to availability and confirmation. To secure a reservation, a valid credit card or other acceptable form of payment may be required at the time of booking. Payment for the entire reservation may be charged at the time of booking or upon check-in, as per the hotel's policy. Any additional charges incurred during the stay, such as room service, minibar, or damages, must be paid at the time of check-out.");
//             System.out.println("Cancellation and No-show: Cancellation policies may vary depending on the rate plan and time of booking. Please refer to the specific cancellation policy mentioned during the booking process. In case of a no-show, where the guest fails to arrive without prior notice, Hotel Nazara reserves the right to charge for the full reservation amount or apply the cancellation policy.");
//             System.out.println("Check-in and Check-out: Check-in time at Hotel Nazara is typically after 2:00 PM, and check-out time is before 12:00 PM, unless otherwise stated. Early check-in and late check-out requests are subject to availability and may incur additional charges.");
//             System.out.println("Guest Responsibilities: Guests are responsible for providing valid identification at the time of check-in and for ensuring the accuracy of their reservation details. Guests are also responsible for any damages or losses caused to the hotel property during their stay and may be charged for any such damages or losses. Smoking, illegal drugs, and loud noises are strictly prohibited in the hotel premises.");
//             System.out.println("Children and Extra Guests: Children under a certain age, as specified by the hotel, may stay free of charge using existing bedding. Extra guests, including children above a certain age, may be subject to additional charges, as per the hotel's policy. Please refer to the hotel's specific policy for details.");
//             System.out.println("Services and Amenities: Hotel Nazara strives to provide a comfortable and enjoyable stay for all guests. However, the availability and quality of services and amenities may vary depending on factors such as weather conditions, maintenance, or other unforeseen circumstances. Hotel Nazara reserves the right to alter or suspend services or amenities without prior notice.");
//             System.out.println("Liability: Hotel Nazara shall not be liable for any loss, damage, or injury to guests or their belongings, including but not limited to theft, fire, natural disasters, accidents, or any other unforeseen events. Guests are advised to use hotel facilities, including the swimming pool, fitness center, or other amenities, at their own risk.");
//             System.out.println("Privacy: Hotel Nazara respects the privacy of its guests and complies with applicable privacy laws. Please refer to the hotel's privacy policy for details on the collection, use, and disclosure of personal information.");
//         } catch (Exception e) {
//             System.out.println("Error displaying terms and conditions: " + e.getMessage());
//         }
//     }
// }
