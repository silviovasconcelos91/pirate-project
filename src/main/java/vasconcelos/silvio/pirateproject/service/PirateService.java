package vasconcelos.silvio.pirateproject.service;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import vasconcelos.silvio.pirateproject.data.Pirate;
import vasconcelos.silvio.pirateproject.dto.PirateBounty;
import vasconcelos.silvio.pirateproject.dto.PirateWithBounty;
import vasconcelos.silvio.pirateproject.repository.PirateRepository;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class PirateService {

    private RestTemplate restTemplate;

    private PirateRepository pirateRepository;

    public List<Pirate> getAllPirates() {
        return pirateRepository.findAll();
    }

    public PirateWithBounty getPirateWithBounty(String pirateName) {
        return pirateRepository.findById(pirateName).map(this::getPirateWithBounty).orElse(null);
    }

    private PirateWithBounty getPirateWithBounty(Pirate pirate) {
        ResponseEntity<PirateBounty> forEntity = restTemplate.getForEntity("http://localhost:8081/api/bounty/{pirateName}", PirateBounty.class, pirate.getName());
        return new PirateWithBounty(pirate.getName(), pirate.getCrew(), pirate.isDemonFruit(), Objects.requireNonNull(forEntity.getBody()).getBounty());
    }
}
