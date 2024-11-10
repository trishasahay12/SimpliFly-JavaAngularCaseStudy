package entities;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "admin_actions")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "action_id")
    private int actionId;

    @Column(name = "admin_id", nullable = false)
    private int adminId;

    @Column(name = "action_type", nullable = false, length = 50)
    private String actionType;

    @Column(name = "action_details", columnDefinition = "TEXT")
    private String actionDetails;

    @Column(name = "action_timestamp", nullable = false, updatable = false)
    private Timestamp actionTimestamp;

    public Admin() {}

    public Admin(int actionId, int adminId, String actionType, String actionDetails, Timestamp actionTimestamp) {
        this.actionId = actionId;
        this.adminId = adminId;
        this.actionType = actionType;
        this.actionDetails = actionDetails;
        this.actionTimestamp = actionTimestamp;
    }

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
        return "Admin{" +
                "actionId=" + actionId +
                ", adminId=" + adminId +
                ", actionType='" + actionType + '\'' +
                ", actionDetails='" + actionDetails + '\'' +
                ", actionTimestamp=" + actionTimestamp +
                '}';
    }
}
