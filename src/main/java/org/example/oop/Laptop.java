package org.example.oop;

    class Laptop extends Device {
        private boolean numBlock;
        private String numberUSBSlots;

        public Laptop(int ram, int space, int processors, int numberUSBSlots, boolean numBlock) {
            super(ram, space, processors, numberUSBSlots);
            this.numBlock = numBlock;
        }

        @Override
        public double price() {
            if (numBlock) {
                return 1300.0; // Preis für Laptop mit Nummernblock
            } else {
                return 800.0; // Preis für Laptop ohne Nummernblock
            }
        }

        @Override
        public String toString() {
            return "Geraet: Laptop; RAM: " + getRam() + "; Space: " + getSpace() + "; Anzahl Prozessoren: "
                    + getProcessors() + "; Anzahl der USB-Steckplätze: " + getNumberUSBSlots() +"; Nummernblock: " + numBlock + ".";
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

        public String getNumberUSBSlots() {
            return numberUSBSlots;
        }
    }
