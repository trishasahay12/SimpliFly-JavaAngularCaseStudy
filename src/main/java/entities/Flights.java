package entities;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "flights")
public class Flights {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id")
    private int flightId;

    @Column(name = "flight_name", nullable = false, length = 100)
    private String flightName;

    @Column(name = "flight_number", nullable = false, length = 20)
    private String flightNumber;

    @Column(name = "owner_id", nullable = false)
    private int ownerId;

    @Column(name = "total_seats", nullable = false)
    private int totalSeats;

    @Column(name = "baggage_limit")
    private Integer baggageLimit;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Timestamp createdAt;

    @Column(name = "updated_at", nullable = false)
    private Timestamp updatedAt;

    public Flights() {}

    public Flights(int flightId, String flightName, String flightNumber, int ownerId, int totalSeats, Integer baggageLimit, Timestamp createdAt, Timestamp updatedAt) {
        this.flightId = flightId;
        this.flightName = flightName;
        this.flightNumber = flightNumber;
        this.ownerId = ownerId;
        this.totalSeats = totalSeats;
        this.baggageLimit = baggageLimit;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public Integer getBaggageLimit() {
        return baggageLimit;
    }

    public void setBaggageLimit(Integer baggageLimit) {
        this.baggageLimit = baggageLimit;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "flightId=" + flightId +
                ", flightName='" + flightName + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", ownerId=" + ownerId +
                ", totalSeats=" + totalSeats +
                ", baggageLimit=" + baggageLimit +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}