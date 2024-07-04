import java.util.HashMap;

public class Hotel {
    private HashMap<String, Room> rooms;

    public Hotel() {
        rooms = new HashMap<>();
        rooms.put("Deluxe", new Room("Deluxe", 2000, 10));
        rooms.put("Premium", new Room("Premium", 4000, 5));
        rooms.put("Luxury", new Room("Luxury", 6000, 3));
    }

    public Room getRoom(String type) {
        return rooms.get(type);
    }

    public void bookRoom(String type, int num) {
        Room room = getRoom(type);
        if (room != null) {
            room.bookRoom(num);
        } else {
            throw new IllegalArgumentException("Room type " + type + " does not exist.");
        }
    }

    public void showRooms() {
        for (Room room : rooms.values()) {
            System.out.println(room);
        }
    }

    public void showRoomTypes() {
        System.out.println("Available Room Types:");
        for (Room room : rooms.values()) {
            System.out.println(room.getType());
        }
    }

    public void showTermsAndConditions() {
        System.out.println("Terms and Conditions for Hotel Nazara");
        System.out.println("Please read these Terms and Conditions carefully before making a reservation or staying at Hotel Nazara. By making a reservation or staying at Hotel Nazara, you agree to be bound by these Terms and Conditions. If you do not agree with any part of these Terms and Conditions, you should not make a reservation or stay at Hotel Nazara.");
        System.out.println("Reservation and Payment: All reservations at Hotel Nazara are subject to availability and confirmation. To secure a reservation, a valid credit card or other acceptable form of payment may be required at the time of booking. Payment for the entire reservation may be charged at the time of booking or upon check-in, as per the hotel's policy. Any additional charges incurred during the stay, such as room service, minibar, or damages, must be paid at the time of check-out.");
        System.out.println("Cancellation and No-show: Cancellation policies may vary depending on the rate plan and time of booking. Please refer to the specific cancellation policy mentioned during the booking process. In case of a no-show, where the guest fails to arrive without prior notice, Hotel Nazara reserves the right to charge for the full reservation amount or apply the cancellation policy.");
        System.out.println("Check-in and Check-out: Check-in time at Hotel Nazara is typically after 2:00 PM, and check-out time is before 12:00 PM, unless otherwise stated. Early check-in and late check-out requests are subject to availability and may incur additional charges.");
        System.out.println("Guest Responsibilities: Guests are responsible for providing valid identification at the time of check-in and for ensuring the accuracy of their reservation details. Guests are also responsible for any damages or losses caused to the hotel property during their stay and may be charged for any such damages or losses. Smoking, illegal drugs, and loud noises are strictly prohibited in the hotel premises.");
        System.out.println("Children and Extra Guests: Children under a certain age, as specified by the hotel, may stay free of charge using existing bedding. Extra guests, including children above a certain age, may be subject to additional charges, as per the hotel's policy. Please refer to the hotel's specific policy for details.");
        System.out.println("Services and Amenities: Hotel Nazara strives to provide a comfortable and enjoyable stay for all guests. However, the availability and quality of services and amenities may vary depending on factors such as weather conditions, maintenance, or other unforeseen circumstances. Hotel Nazara reserves the right to alter or suspend services or amenities without prior notice.");
        System.out.println("Liability: Hotel Nazara shall not be liable for any loss, damage, or injury to guests or their belongings, including but not limited to theft, fire, natural disasters, accidents, or any other unforeseen events. Guests are advised to use hotel facilities, including the swimming pool, fitness center, or other amenities, at their own risk.");
        System.out.println("Privacy: Hotel Nazara respects the privacy of its guests and complies with applicable privacy laws. Please refer to the hotel's privacy policy for details on the collection, use, and disclosure of personal information.");
    }
}
