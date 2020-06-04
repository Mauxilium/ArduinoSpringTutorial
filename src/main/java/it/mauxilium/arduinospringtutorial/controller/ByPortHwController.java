package it.mauxilium.arduinospringtutorial.controller;


import it.mauxilium.arduinospring.annotation.ArduinoController;

@ArduinoController(port="COM5", baudRate="9600")
public class ByPortHwController extends SharedCoreController {
}
