package org.example.oop;

public class Desktop extends Device {
    private int numberUSBSlots;


    public Desktop(int ram, int space, int processors, int numberUSBSlots) {
        super(ram, space, processors, numberUSBSlots);
        setNumberUSBSlots(numberUSBSlots);

        if (numberUSBSlots < 1) {
            numberUSBSlots = 1;
        }
        this.numberUSBSlots = numberUSBSlots;

    }

    public int getSpace() {
        int space = getSpace() * 3;
        return space;
    } // KA was das ist, von mir lol

    public int getNumberUSBSlots() {
        return numberUSBSlots;
    }


    public double price() {
        if (numberUSBSlots == 1) {
            return 10 * getSpace(); // Preis für Laptop mit Nummernblock
        } else if (numberUSBSlots < 3 && getSpace() <= 256) {
            getSpace();
        } else {
            return 800.0; // Preis für Laptop ohne Nummernblock
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Geraet: Desktop; RAM: " + getRam() + "; Space: " + getSpace() + "; Anzahl Prozessoren: "
                + getProcessors() + "; Anzahl der USB-Steckplätze: " + getNumberUSBSlots() + "; " + ".";
    }

    @Override
    public double getPrice() {
        return price();
    }
}



