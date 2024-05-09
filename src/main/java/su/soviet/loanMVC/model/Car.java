package su.soviet.loanMVC.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Car")
@Getter
@Setter
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String manufacturer;

    private String model;

    private int price;

    @OneToOne(mappedBy = "car")
    private User user;

    public Car(String manufacturer, String model, int price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }
}