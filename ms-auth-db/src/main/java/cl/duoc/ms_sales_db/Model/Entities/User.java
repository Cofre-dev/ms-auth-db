package cl.duoc.ms_auth_db.Model.Entities;
import java.util.Date


@Entity
@Table(name="auth_clients")
@Getter
@Setter
@ToString
public class User {

    @Id
    @Generatedvalue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id; 

    @Column(name="email")
    private String email;

    @Column(name="password_hash")
    private long password_hash;

    @Column(name="status")
    private String status;

    @Column(name="failed_login")
    private int failed_login;

    @Column(name="create_at")
    Date create_at;

    //relaciones con otras clases
    @OneToMany(mappedBy = "user")
    private List<Login_attempt> login_attempts;

    @OneToMany(mappedBy = "user")
    private List<UserRole> roles;

}
