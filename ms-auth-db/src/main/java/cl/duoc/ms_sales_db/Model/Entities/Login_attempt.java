package cl.duoc.ms_auth_db.Model.Entities;

@Entity
@Table(name="login_attempt")
@Getter
@Setter
@ToString
public class Login_attempt {

    @Id
    @Generatedvalue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id; 

    @Column(name="user_id")
    private long user_id;

    @Column(name="succes")
    private boolean succes;

    @Column(name="ip_address")
    private String ip_address;

    @ManyToOne
    @JoinColumn(name= "user_id")
    private User user;


}
