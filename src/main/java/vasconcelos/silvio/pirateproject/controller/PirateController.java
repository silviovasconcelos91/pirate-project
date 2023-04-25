package vasconcelos.silvio.pirateproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vasconcelos.silvio.pirateproject.data.Pirate;
import vasconcelos.silvio.pirateproject.dto.PirateWithBounty;
import vasconcelos.silvio.pirateproject.exception.PirateNotFoundException;
import vasconcelos.silvio.pirateproject.service.PirateService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pirates")
@AllArgsConstructor
public class PirateController {


    private PirateService pirateService;

    @GetMapping
    public List<Pirate> getAllPirates() {
        return pirateService.getAllPirates();
    }

    @GetMapping("/{pirateName}")
    public PirateWithBounty getPirateWithBounty(@PathVariable String pirateName) {
        return Optional.ofNullable(pirateService.getPirateWithBounty(pirateName)).orElseThrow(() -> new PirateNotFoundException(pirateName));
    }
}
