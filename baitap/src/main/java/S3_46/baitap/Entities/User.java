package S3_46.baitap.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(unique = true)
    private String Name;
    @Column(unique = true)
    private String Email;
    private String Password;
    private String FirstName;
    private String LastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String BirthDay;
    private boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "RoleId")
    private Role Role;

    public User(Long id, String name, String email, String password, String firstName, String lastName, String birthDay, String isDeleted) {
        Id = id;
        Name = name;
        Email = email;
        Password = password;
        FirstName = firstName;
        LastName = lastName;
        BirthDay = birthDay;
        this.isDeleted = isDeleted;
    }

    public boolean isDeleted(){
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
