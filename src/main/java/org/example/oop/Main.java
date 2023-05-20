package org.example.oop;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        DeviceManager manager = new DeviceManager();
        manager.add(new Desktop(512, 2, 4, 2));
        manager.add(new Desktop(128, 1, 2, 2));
        manager.add(new Desktop(256, 4, 6, 4));
        manager.add(new Laptop(512,2, 2, 4, true));
        manager.add(new Mobile(4, 1, 3, 200, 1));
        manager.add(new Mobile(12, 4, 4, 200, 1));

        manager.printAll();
        System.out.printf("Durchschnittspreis: %.2f EUR\n", manager.getDurchschnittsPrice());
        System.out.printf("Device mit dem kleinsten Preis: %s\n", manager.getByMinPrice().getClass().getSimpleName());
        HashMap<Integer, Integer> countMap = manager.getCountOfDevicesPerRam();
        for (int ram : countMap.keySet()) {
            System.out.printf("%d GB RAM: %d Geräte\n", ram, countMap.get(ram));
        }
    }
}
