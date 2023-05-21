package org.example.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DeviceManager {

        private List<Device> devices;

        public DeviceManager() {
            devices = new ArrayList<>();
        }

        public void add(Device d) {
            devices.add(d);
        }

        public void printAll() {
            for (Device d : devices) {
                System.out.printf("%s: %.2f EUR\n", d.getClass().getSimpleName(), d.getPrice());
            }
        }

        public double getDurchschnittsPrice() {
            double sum = 0;
            for (Device d : devices) {
                sum += d.getPrice();
            }
            return sum / devices.size();
        }

        public Device getByMinPrice() {
            if (devices.isEmpty()) {
                return null;
            }
            Device minDevice = devices.get(0);
            for (Device d : devices) {
                if (d.getPrice() < minDevice.getPrice()) {
                    minDevice = d;
                }
            }
            return minDevice;
        }

        public HashMap<Integer, Integer> getCountOfDevicesPerRam() {
            HashMap<Integer, Integer> countMap = new HashMap<>();
            for (Device d : devices) {
                int ram = 0;
                if (d instanceof Desktop) {
                    ram = ((Desktop) d).getSpace();
                }
                Integer count = countMap.get(ram);
                if (count == null) {
                    count = 0;
                }
                countMap.put(ram, count + 1);
            }
            return countMap;
        }
    }

    /*
    public class DeviceManager {
        private List<Device> devices;

        public DeviceManager() {
            devices = new ArrayList<>();
        }

        public void add(Device d) {
            devices.add(d);
        }

        public void printAll() {
            for (Device d : devices) {
                System.out.println(d.toString());
            }
        }

        public double getDurchschnittsPrice() {
            double sum = 0;
            for (Device d : devices) {
                sum += d.getPrice();
            }
            return sum / devices.size();
        }

        public Device getByMinPrice() {
            if (devices.isEmpty()) {
                return null;
            }
            Device minDevice = devices.get(0);
            for (Device d : devices) {
                if (d.getPrice() < minDevice.getPrice()) {
                    minDevice = d;
                }
            }
            return minDevice;
        }

        public HashMap<Integer, Integer> getCountOfDevicesPerRam() {
            HashMap<Integer, Integer> countMap = new HashMap<>();
            for (Device d : devices) {
                int ram = d.getRam();
                Integer count = countMap.get(ram);
                if (count == null) {
                    count = 0;
                }
                countMap.put(ram, count + 1);
            }
            return countMap;
        }
    }

     */
