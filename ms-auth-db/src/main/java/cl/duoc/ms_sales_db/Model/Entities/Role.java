package cl.duoc.ms_auth_db.Model.Entities;
@Entity
@Table(name="role")
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
    
    @OneToMany(mappedBy = "role")
    private List<UserRole> users;
}

