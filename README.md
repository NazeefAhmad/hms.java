# 🏨 Hotel Management System

## Overview

The **Hotel Management System** is a console-based application designed to manage room bookings for a fictional hotel named "Hotel Nazara." This project leverages **Object-Oriented Programming (OOP)** principles to provide a modular, maintainable, and scalable solution. The system allows users to book different types of rooms, generate receipts, and view terms and conditions. It includes error handling to ensure robustness and user-friendly interaction.

## ✨ Features

- **Room Booking**: Users can book Deluxe, Premium, or Luxury rooms.
- **Receipt Generation**: Detailed receipts are generated for bookings.
- **Error Handling**: Robust error handling for invalid inputs and unexpected situations.
- **Terms and Conditions**: Display hotel policies and rules.
- **Modular Design**: Uses OOP principles for easy maintenance and scalability.

## 🔧 OOP Concepts Used

1. **Classes and Objects**: Defines the structure and behavior of various components.
2. **Encapsulation**: Protects data within classes and provides controlled access.
3. **Abstraction**: Simplifies complex systems by exposing only necessary components.
4. **Composition**: Assembles objects using other objects.
5. **Exception Handling**: Manages errors to prevent crashes and ensure smooth execution.
6. **Static Initialization Block**: Initializes static variables when the class is first loaded.

## 🚀 Future Enhancements

- **Inheritance and Polymorphism**: Create a hierarchy for different room types.
- **File I/O for Data Persistence**: Store booking information in files.
- **Database Integration**: Manage room availability and bookings using a database.
- **Graphical User Interface (GUI)**: Enhance user experience with JavaFX or Swing.
- **User Authentication**: Add user login and registration features.
- **Admin Panel**: Manage room availability, pricing, and bookings.
- **Payment Processing**: Integrate with payment gateways.
- **Feedback System**: Allow users to leave feedback and reviews.
- **Notification System**: Send email/SMS notifications.

## 🛠️ Getting Started

### Prerequisites

- **Java Development Kit (JDK)** installed on your system.
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor (e.g., VSCode).

### Installation

1. **Clone the Repository**
    ```sh
    git clone https://github.com/yourusername/HotelNazaraManagementSystem.git
    cd HotelNazaraManagementSystem
    ```

2. **Compile the Code**
    ```sh
    javac HotelManagementSystem.java
    ```

3. **Run the Application**
    ```sh
    java HotelManagementSystem
    ```

## 🎮 Usage

1. **Booking a Room**
    - Select the number of guests.
    - Choose the type of room (Deluxe, Premium, Luxury).
    - A receipt will be generated upon successful booking.

2. **Viewing Terms and Conditions**
    - Optionally, view the hotel's terms and conditions.

3. **Handling Emergencies**
    - Press the designated key for emergency alerts (simulated with beeps).

## 📂 Code Structure

### Class Diagram


### Main Classes and Methods

- **HotelManagementSystem**: Entry point of the application.
- **Hotel**: Manages room inventory and bookings.
    - `getRoom(String type)`
    - `bookRoom(String type, int num)`
    - `showRooms()`
    - `showTermsAndConditions()`
- **Room (abstract)**: Represents a room in the hotel.
    - `DeluxeRoom`
    - `PremiumRoom`
    - `LuxuryRoom`
- **Booking**: Manages the booking process and generates receipts.
    - `generateReceipt()`
    - `saveBooking()`

## 🤝 Contributions

Contributions are welcome! Feel free to open issues or submit pull requests to enhance the functionality or add new features.

## 📜 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

**Developed by Nazeef Ahmad, Arunabh Bhattacharya, Pragati Upadhyay as a Project-Based Learning (PBL) assignment for the 4th Semester.**

For any queries or support, please contact hackblackpearl@gmail.com.

---

Thank you for using the Hotel Management System! We hope it meets your expectations and requirements.
