bulldogg
========

This is a repository for a university project in which a vehicle is controlled via raspberry-pi to android communication.
Later on, autonomy shall be added.

The Raspberry uses a http Server (mongoose) to get commands from the Android App, that is connected to it via an Access Point.

We used Ian Rentons raspberrytank (https://github.com/ianrenton/raspberrytank) as a reference for our C code.


#define PIN(1) Bitsequenz
#define PIN(2) Bitsequenz
...
#define PIN(MAX) Bitsequenz


Developer Note:
PWM über:
for (i = 0; i < MAX_PIN_NUMBER; i++){
checkPin(PIN(i));
}


void checkPin(int Pinnummer)
{

Check if Pin(i) has to be turned ON/OFF or remain in current state;


}