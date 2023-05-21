package org.example.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

    public abstract class Device {
        protected int ram;
        protected int processors;
        protected int numberUSBSlots;
        protected int space; // in GB

        public Device(int space) {
            this.space = space;
        }

        public Device(int ram, int space, int processors, int numberUSBSlots) {
            this.ram = ram;
            this.space = space;
            this.processors = processors;
            this.numberUSBSlots = numberUSBSlots;
        }

        public int getSpace() {
            return space;
        }

        public abstract double getPrice();

        public abstract double price();

        @Override
        public String toString() {
            return String.format("Geraet: %s; RAM: %d; Space: %d; Anzahl Prozessoren: %d",
                    getClass().getSimpleName(), getRam(), getSpace(), getProcessors());
        }

        public abstract int getRam();

        public abstract int getProcessors();
    }
