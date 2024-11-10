package entities;

import java.sql.Timestamp;

public class AdminActions {
    private int actionId;
    private int adminId;
    private String actionType;
    private String actionDetails;
    private Timestamp actionTimestamp;

    // Default constructor
    public AdminActions() {}

    // Parameterized constructor
    public AdminActions(int actionId, int adminId, String actionType, String actionDetails, Timestamp actionTimestamp) {
        this.actionId = actionId;
        this.adminId = adminId;
        this.actionType = actionType;
        this.actionDetails = actionDetails;
        this.actionTimestamp = actionTimestamp;
    }

    // Getters and setters
    public int getActionId() {
        return actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionDetails() {
        return actionDetails;
    }

    public void setActionDetails(String actionDetails) {
        this.actionDetails = actionDetails;
    }

    public Timestamp getActionTimestamp() {
        return actionTimestamp;
    }

    public void setActionTimestamp(Timestamp actionTimestamp) {
        this.actionTimestamp = actionTimestamp;
    }

    @Override
    public String toString() {
        return "AdminAction{" +
                "actionId=" + actionId +
                ", adminId=" + adminId +
                ", actionType='" + actionType + '\'' +
                ", actionDetails='" + actionDetails + '\'' +
                ", actionTimestamp=" + actionTimestamp +
                '}';
    }
}

