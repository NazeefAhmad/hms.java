public class Booking {
    private Hotel hotel;
    private String roomType;
    private int numGuests;

    public Booking(Hotel hotel, String roomType, int numGuests) {
        this.hotel = hotel;
        this.roomType = roomType;
        this.numGuests = numGuests;
        hotel.bookRoom(roomType, numGuests);
    }

    public void generateReceipt() {
        Room room = hotel.getRoom(roomType);
        int totalCost = numGuests * room.getCostPerPerson();
        System.out.println("\n\n\n     HOTEL NAZARA\n\nYour booking is successful\n");
        System.out.printf("*Total guests are %d\n", numGuests * 2);
        System.out.printf("*Your room no. is %d\n", numGuests + 200);
        System.out.printf("*Your Total amount is %d\n", totalCost);
        System.out.println("*This booking is valid only for 24 hours only.");
        System.out.println("*For any assistance please contact us at: 9990518959; 9026475321.");
    }
}
