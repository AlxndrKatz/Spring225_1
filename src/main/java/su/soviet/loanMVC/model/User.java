package su.soviet.loanMVC.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Car car;
}
