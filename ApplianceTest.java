class Appliance {
    String brand;
    int power; 

    Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void showDetails() {
        System.out.println("Brand: " + brand + ", Power: " + power + "W");
    }
}

class WashingMachine extends Appliance {
    WashingMachine(String brand, int power) {
        super(brand, power);
    }

    void washClothes() {
        System.out.println(brand + " washing clothes...");
    }
}

class Refrigerator extends Appliance {
    Refrigerator(String brand, int power) {
        super(brand, power);
    }

    void coolItems() {
        System.out.println(brand + " cooling items...");
    }
}

public class ApplianceTest {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("LG", 1500);
        Refrigerator rf = new Refrigerator("Samsung", 800);

        wm.showDetails();
        wm.washClothes();

        rf.showDetails();
        rf.coolItems();
    }
}
