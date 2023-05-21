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
        int space = this.space; // *3; entfernt - Angabe davor falsch interpretiert
        return space;
    }

    public int getNumberUSBSlots() {
        return numberUSBSlots;
    }


    public double price() {

        // float defaultPrice = 0;
        // syntaktischer Zucker: defaultPrice = defaultPrice/2;

        // remember: there is no such thing as over explaining in the software realm, right chatty?
        // am I the only one who talks to themselves in the comments section?

        if (numberUSBSlots == 1) {
            return 10 * getSpace() + getNumberUSBSlots() * 20; // Preisberechnung für Desktop aus Angabe
        } else if (numberUSBSlots <= 2 && getSpace() <= 256) {
            return (double) (10 * getSpace() + getNumberUSBSlots() * 20) / 2;
        } else {
            return 300; // leider in Angabe kein Fixpreis für alle anderen Fälle bzw. generell deklariert - bsp. 300 genommen
        }
    }

    @Override
    public String toString() {
        return "Geraet: Desktop; RAM: " + getRam() + "; Space: " + getSpace() + "; Anzahl Prozessoren: "
                + getProcessors() + "; Anzahl der USB-Steckplätze: " + getNumberUSBSlots() + "; " + ".";
    }

    @Override
    public int getRam() {
        return 0;
    }

    @Override
    public int getProcessors() {
        return 0;
    }

    @Override
    public double getPrice() {
        return price();
    }

    public void setNumberUSBSlots(int numberUSBSlots) {
        this.numberUSBSlots = numberUSBSlots;
    }
}

/*
public class Desktop extends Device {
        private int numberUSBslots;

        public Desktop(int space, int numberUSBslots) {
            super(space);
            if (numberUSBslots < 1) {
                numberUSBslots = 1;
            }
            this.numberUSBslots = numberUSBslots;
        }

        public int getNumberUSBslots() {
            return numberUSBslots;
        }

        @Override
        public double getPrice() {
            double price = numberUSBslots * 20 + getSpace() * 10;
            if (numberUSBslots < 3 && getSpace() <= 256) {
                price /= 2.0;
            }
            return price;
        }

        @Override
        public int getRam() {
            // Desktop hat keinen speziellen RAM
            return 0;
        }

        @Override
        public int getProcessors() {
            // Desktop hat keinen speziellen Prozessor
            return 0;
        }

        @Override
        public String toString() {
            return super.toString() + String.format("; USB-Slots: %d", numberUSBslots);
        }
    }


 */


