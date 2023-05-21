package org.example.oop;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        DeviceManager manager = new DeviceManager();
        manager.add(new Desktop(8000, 500, 4, 2));
        manager.add(new Desktop(16000, 1000, 8, 4));
        manager.add(new Desktop(4000, 256, 2, 2));

        manager.add(new Laptop(128, 2, 2, 2, true));
        manager.add(new Laptop(512, 4, 2, 2, true));
        manager.add(new Laptop(128, 1, 1, 2, false));
        manager.add(new Mobile(128, 2, 2, 2, 2));


        manager.printAll();
        System.out.printf("Durchschnittspreis: %.2f EUR\n", manager.getDurchschnittsPrice());
        System.out.printf("Device mit dem kleinsten Preis: %s\n", manager.getByMinPrice().getClass().getSimpleName());
        HashMap<Integer, Integer> countMap = manager.getCountOfDevicesPerRam();
        for (int ram : countMap.keySet()) {
            System.out.printf("%d GB RAM: %d Geräte\n", ram, countMap.get(ram));
        }
    }
}
