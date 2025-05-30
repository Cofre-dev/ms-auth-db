package cl.duoc.ms_auth_db.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="auth_user")
@Getter
@Setter
public class AuthUser {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="email")
    private String email;
    @Column(name= "password_hash")
    private String passwordHash;
    @Column(name="status")
    private String status;
    @Column(name="failed_login")
    private int failed_login;

}
