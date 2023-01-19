package it.develhope;

import it.develhope.entities.Smartphone;
import it.develhope.entities.SmartphonePrice;

public class Start {
    public static void main(String[] args) {
        SmartphonePrice smartProducer0 = new SmartphonePrice("Euro", 800);
        SmartphonePrice smartProducer1 = new SmartphonePrice("USD", 600);
        SmartphonePrice smartRetail0 = new SmartphonePrice("Sterlin", 350);
        SmartphonePrice smartRetail1 = new SmartphonePrice("USD", 400);

        Smartphone smartphone1 = new Smartphone("Nokia", "lumia400", 5000, smartProducer0, smartRetail0);
        Smartphone smartphone2 = new Smartphone("Samsung", "a70", 4500, smartProducer1, smartRetail1);

        System.out.println(smartphone1.toString());
        System.out.println(smartphone2.toString());

        System.out.println("Is the smartphone equal to the other? " + smartphone1.equals(smartphone2));

        try {
            Smartphone cloneSmartphone = smartphone2.clone();
            System.out.println("A clone smartphone was generated");
            System.out.println(cloneSmartphone.toString());
            System.out.println("Is it equal to the original? " + cloneSmartphone.equals(smartphone2));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("Error!");
        }

        System.out.println();

    }
}
