package cl.duoc.ms_sales_db.Model.Entities;

@Entity
@Table(name="login_attempt")
@Getter
@Setter
@ToString
public class User_role {
    @Id
    @Generatedvalue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private long user_id;
    @Column(name="role_id")
    private long role_id;
    // Falta poner las llaves foraneas!



}
