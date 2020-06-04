package it.mauxilium.arduinospringtutorial.service;

import it.mauxilium.arduinojavaserialrpc.exception.ArduinoRpcJavaFailsException;
import it.mauxilium.arduinospringtutorial.controller.ByPortHwController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArduinoService {

    @Autowired
    private ByPortHwController ctrl;

    public String[] getAvailableCards() {
        return ctrl.getCards();
    }

    public void ledOn(final String cardName) throws ArduinoRpcJavaFailsException {
        ctrl.doSimpleAction(cardName, "switchOn");
    }

    public void ledOff(final String cardName) throws ArduinoRpcJavaFailsException {
        ctrl.doSimpleAction(cardName, "switchOff");
    }
}
