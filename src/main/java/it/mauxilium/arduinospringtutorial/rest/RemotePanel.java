package it.mauxilium.arduinospringtutorial.rest;

import it.mauxilium.arduinojavaserialrpc.exception.ArduinoRpcJavaFailsException;
import it.mauxilium.arduinospringtutorial.service.ArduinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class RemotePanel {

    @Autowired
    private ArduinoService arService;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces="text/plain")
    public String home() {
        return availableCards();
    }

    @RequestMapping(value = "/cards", method = RequestMethod.GET, produces="text/plain")
    public String availableCards() {
        return Arrays.toString(arService.getAvailableCards());
    }

    @RequestMapping(value = "/{card}/on", method = RequestMethod.GET)
    public void activateLed(@PathVariable("card") String card) throws ArduinoRpcJavaFailsException {
        arService.ledOn(card);
    }

    @RequestMapping(value = "/{card}/off", method = RequestMethod.GET)
    public void deactivateLed(@PathVariable("card") String card) throws ArduinoRpcJavaFailsException {
        arService.ledOff(card);
    }
}
