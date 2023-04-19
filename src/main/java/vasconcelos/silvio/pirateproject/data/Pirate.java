package vasconcelos.silvio.pirateproject.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
