package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "seats")
public class Seats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private int seatId;

    @Column(name = "booking_id", nullable = false)
    private int bookingId;

    @Column(name = "seat_number", nullable = false, length = 10)
    private String seatNumber;

    @Column(name = "is_available", nullable = false)
    private boolean isAvailable;

    public Seats() {}

    public Seats(int seatId, int bookingId, String seatNumber, boolean isAvailable) {
        this.seatId = seatId;
        this.bookingId = bookingId;
        this.seatNumber = seatNumber;
        this.isAvailable = isAvailable;
    }

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

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Seats{" +
                "seatId=" + seatId +
                ", bookingId=" + bookingId +
                ", seatNumber='" + seatNumber + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
