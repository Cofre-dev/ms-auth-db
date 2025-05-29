package cl.duoc.ms_sales_db.Model.Entities;
@Entity
@Table(name="login_attempt")
@Getter
@Setter
@ToString
public class Role {
    @Id
    @Generatedvalue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
    
}

