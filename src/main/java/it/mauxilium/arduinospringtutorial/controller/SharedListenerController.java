package it.mauxilium.arduinospringtutorial.controller;


import it.mauxilium.arduinospring.annotation.FromArduinoAction;

public interface SharedListenerController {

    @FromArduinoAction
    void simpleAction(final String actionName);

    @FromArduinoAction
    String stringAction(final String actionName, final String arg);

    @FromArduinoAction
    int intAction(final String actionName, final int arg);

    @FromArduinoAction
    int intIntAction(final String actionName, final int arg, final int arg2);

    @FromArduinoAction
    float floatAction(final String actionName, final float arg);

}
