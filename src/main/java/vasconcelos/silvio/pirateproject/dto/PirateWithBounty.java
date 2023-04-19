package vasconcelos.silvio.pirateproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PirateWithBounty {

    private String name;
    private String crew;
    private boolean demonFruit;
    private String bounty;
}
