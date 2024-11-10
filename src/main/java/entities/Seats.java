package entities;
//package com.laxman.simpli_fly.entities;

public class Seats {
    private int seatId;
    private int bookingId;
    private String seatNumber;
    private boolean isAvailable;

    // Default constructor
    public Seats() {}

    // Parameterized constructor
    public Seats(int seatId, int bookingId, String seatNumber, boolean isAvailable) {
        this.seatId = seatId;
        this.bookingId = bookingId;
        this.seatNumber = seatNumber;
        this.isAvailable = isAvailable;
    }

    // Getters and setters
    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatId=" + seatId +
                ", bookingId=" + bookingId +
                ", seatNumber='" + seatNumber + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}

