#include "Adafruit_Thermal.h"
#include "SoftwareSerial.h"

#include "adalogo.h"

#define TX_PIN 6 // Arduino transmit  YELLOW WIRE  labeled RX on printer
#define RX_PIN 5 // Arduino receive   GREEN WIRE   labeled TX on printer

SoftwareSerial mySerial(RX_PIN, TX_PIN); // Declare SoftwareSerial obj first
Adafruit_Thermal printer(&mySerial);     // Pass addr to printer constructor

void setup() {
  pinMode(7, OUTPUT); digitalWrite(7, LOW);

  mySerial.begin(19200);  // Initialize SoftwareSerial
  printer.begin();        // Init printer (same regardless of serial type)

  printer.setFont('A');
  printer.justify('C');
  printer.setSize('L');
  printer.boldOn();
  printer.println(F("\n  Isle of Man    Da Bank\n"));
  printer.boldOff();

  printer.setSize('S');
  printer.println(F("--------------------------------"));
  printer.justify('L');
  printer.println(F("Opgenomen bedrag: "));
  printer.println(F("IBAN: XXXXXXXXXXXXXXX-0979"));
  printer.println(F("Pasnummer: "));
  printer.println(F("Datum: "));
  printer.println(F("Tijd: "));
  printer.justify('C');
  printer.println(F("--------------------------------"));
  printer.println(F("Wijnhaven 107, Rotterdam"));
  printer.setSize('L');
  printer.boldOn();
  printer.doubleHeightOn();
  printer.println(F("     \nBedankt!\n Tot ziens! \n   \n   \n"));

  printer.sleep();      // Tell printer to sleep
  delay(3000L);         // Sleep for 3 seconds
  printer.wake();       // MUST wake() before printing again, even if reset
  printer.setDefault(); // Restore printer to defaults
}

void loop() {
}
