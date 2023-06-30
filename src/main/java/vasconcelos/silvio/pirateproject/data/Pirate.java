package vasconcelos.silvio.pirateproject.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Pirate {

    @Id
    private String name;

    private String crew;

    @Column(name = "demon_fruit")
    private boolean demonFruit;
}
