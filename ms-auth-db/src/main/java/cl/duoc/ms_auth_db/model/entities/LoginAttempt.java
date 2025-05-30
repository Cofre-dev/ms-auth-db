package cl.duoc.ms_auth_db.model.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="auth_login_attempts")
@Getter
@Setter
@ToString
public class LoginAttempt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    // @ManyToOne @JoinColumn(name = "user_id")
    // private User user;
    private boolean success;
    @Column(name="ip_address")
    private String ipAddress;
    @Column(name="attempt_date")
    private LocalDateTime attempt_date;

}
