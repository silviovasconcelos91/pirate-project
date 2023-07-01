package vasconcelos.silvio.pirateproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vasconcelos.silvio.pirateproject.data.Pirate;
import vasconcelos.silvio.pirateproject.dto.PirateBounty;
import vasconcelos.silvio.pirateproject.dto.PirateWithBounty;
import vasconcelos.silvio.pirateproject.repository.PirateRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PirateService {


    private PirateRepository pirateRepository;

    private BountyClient bountyClient;

    public List<Pirate> getAllPirates() {
        return pirateRepository.findAll();
    }

    public PirateWithBounty getPirateWithBounty(String pirateName) {
        return pirateRepository.findById(pirateName).map(this::getPirateWithBounty).orElse(null);
    }

    private PirateWithBounty getPirateWithBounty(Pirate pirate) {
        PirateBounty pirateBounty = bountyClient.getPirateBounty(pirate.getName());
        return new PirateWithBounty(pirate.getName(), pirate.getCrew(), pirate.isDemonFruit(), pirateBounty.bounty());
    }
}
