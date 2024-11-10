package entities;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "users")  // Specifies the table name in the database
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-incremented primary key
    @Column(name = "user_id")  // Maps to the user_id column in the table
    private int userId;

    @Column(name = "username", nullable = false, length = 50)  // Maps to the username column
    private String username;

    @Column(name = "password_hash", nullable = false)  // Maps to the password_hash column
    private String passwordHash;

    @Column(name = "email", nullable = false, unique = true)  // Maps to the email column
    private String email;

    @Column(name = "contact_number", length = 15)  // Maps to the contact_number column
    private String contactNumber;

    @Column(name = "role", nullable = false)  // Maps to the role column
    private String role;

    @Column(name = "created_at", nullable = false, updatable = false)  // Maps to the created_at column
    private Timestamp createdAt;

    @Column(name = "updated_at")  // Maps to the updated_at column
    private Timestamp updatedAt;

    // Default constructor
    public Users() {}

    // Parameterized constructor
    public Users(int userId, String username, String passwordHash, String email, String contactNumber, String role, Timestamp createdAt, Timestamp updatedAt) {
        this.userId = userId;
        this.username = username;
        this.passwordHash = passwordHash;
        this.email = email;
        this.contactNumber = contactNumber;
        this.role = role;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
        return "Users{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", email='" + email + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", role='" + role + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
