package S3_46.baitap.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long Id;
    @Column(name = "role_name")
    private String RoleName;

    @OneToMany(mappedBy = "role")
    private Set<User> users;

    public Role(Long id, String roleName) {
        Id = id;
        RoleName = roleName;
    }
}
