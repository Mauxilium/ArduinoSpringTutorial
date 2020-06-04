package it.mauxilium.arduinospringtutorial.controller;


import it.mauxilium.arduinojavaserialrpc.ArduinoJavaSerialRpc;
import it.mauxilium.arduinojavaserialrpc.exception.ArduinoRpcJavaFailsException;
import it.mauxilium.arduinospring.annotation.ToArduinoAction;
import it.mauxilium.arduinospring.controller.CrossCardManager;

/**
 * This class contains all the test methods: one for each supported remote signature
 */
public class SharedCoreController implements SharedListenerController {

    public String[] getCards() {
        return CrossCardManager.getInstance().getCards();
    }

    public ArduinoJavaSerialRpc getCardByName(final String cardName) {
        return CrossCardManager.getInstance().getCardByName(cardName);
    }

    @ToArduinoAction
    public void doSimpleAction(final String cardName, final String actionName) throws ArduinoRpcJavaFailsException {
        getCardByName(cardName).executeRemoteFunction(actionName);
    }

    @ToArduinoAction
    public String doStringAction(final String cardName, final String actionName, final String arg) throws ArduinoRpcJavaFailsException {
        return getCardByName(cardName).executeRemoteFunction(actionName, arg);
    }

    @ToArduinoAction
    public int doIntIntAction(final String cardName, final String actionName, final int arg, final int arg2) throws ArduinoRpcJavaFailsException {
        return getCardByName(cardName).executeRemoteFunction(actionName, arg, arg2);
    }

    @ToArduinoAction
    public float doFloatAction(final String cardName, final String actionName, final float arg) throws ArduinoRpcJavaFailsException {
        return getCardByName(cardName).executeRemoteFunction(actionName, arg);
    }

    @Override
    public void simpleAction(String actionName) {
        System.out.println("SimpleAction");
    }

    @Override
    public String stringAction(String actionName, String arg) {
        System.out.println("SimpleAction");
        return null;
    }

    @Override
    public int intAction(String actionName, int arg) {
        System.out.println("SimpleAction");
        return 0;
    }

    @Override
    public int intIntAction(String actionName, int arg, int arg2) {
        System.out.println("SimpleAction");
        return 0;
    }

    @Override
    public float floatAction(String actionName, float arg) {
        System.out.println("SimpleAction");
        return 0;
    }
}
