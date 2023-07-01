package vasconcelos.silvio.pirateproject.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import vasconcelos.silvio.pirateproject.dto.PirateBounty;

@HttpExchange("http://localhost:8081/api/bounty")
public interface BountyClient {

    @GetExchange("/{pirateName}")
    PirateBounty getPirateBounty(@PathVariable String pirateName);
}