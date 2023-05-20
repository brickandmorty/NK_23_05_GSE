package org.example.oop;

    class Mobile extends Device {
        private int resolution;

        public Mobile(int ram, int space, int processors, int resolution, int numberUSBSlots) {
            super(ram, space, processors, numberUSBSlots);
            setResolution(resolution);
        }

        public int getResolution() {
            return resolution;
        }

        public void setResolution(int resolution) {
            if (resolution == 48 || resolution == 108 || resolution == 200) {
                this.resolution = resolution;
            } else {
                this.resolution = 48; // Standardwert bei ungültigen Auflösungen
            }
        }

        @Override
        public double price() {
            switch (getRam()) {
                case 4:
                    return Math.max(4 * resolution, 200.0);
                case 6:
                    return 6 * resolution + 100.0;
                case 8:
                    return 8 * resolution;
                default:
                    return Math.min(12 * resolution, 2000.0);
            }
        }

        @Override
        public String toString() {
            return "Geraet: Mobile; RAM: " + getRam() + "; Space: " + getSpace() + "; Anzahl Prozessoren: "
                    + getProcessors() + "; Anzahl der USB-Steckplätze: " + getNumberUSBSlots() + "; Kameraaufloesung: " + resolution + ".";
        }

        @Override
        public double getPrice() {
            return price();
        }
    }
