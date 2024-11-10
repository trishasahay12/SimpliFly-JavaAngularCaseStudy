package entities;

import java.sql.Timestamp;

//@Entity
public class Flights {

    private int flightId;
    private String flightName;
    private String flightNumber;
    private int ownerId;
    private int totalSeats;
    private Integer baggageLimit; 
    private Timestamp createdAt;
    private Timestamp updatedAt;

    // Default constructor
    public Flights() {}

    // Parameterized constructor
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

    // Getters and Setters
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
        return "Flight{" +
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

