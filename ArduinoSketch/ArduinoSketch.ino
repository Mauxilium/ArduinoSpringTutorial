#include <ArduinoSerialRpc.h>

ArduinoSerialRpc rpc("ArduinoSpring_Card_1");

void setup() {
  Serial.begin(9600);
  pinMode(LED_BUILTIN, OUTPUT);
  digitalWrite(LED_BUILTIN, LOW);

  rpc.registerArduinoFunction("switchOn", ledOn);
  rpc.registerArduinoFunction("switchOff", ledOff);
}

void serialEvent() {
  rpc.serialEventHandler();
}

void ledOn() {
  digitalWrite(LED_BUILTIN, HIGH);
}

void ledOff() {
  digitalWrite(LED_BUILTIN, LOW);
}

void loop() {
  delay(1);
}
