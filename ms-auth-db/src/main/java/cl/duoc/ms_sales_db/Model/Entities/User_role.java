package cl.duoc.ms_auth_db.Model.Entities;

@Entity
@Table(name="user_role")
@Getter
@Setter
@ToString
public class User_role {
    @Id
    @Generatedvalue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private long user_id;

    @ManyToOne
    @JoinColumn(name="user_id")
    @Column(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="role_id")
    @Column(name="role_id")
    private long role_id;




}
