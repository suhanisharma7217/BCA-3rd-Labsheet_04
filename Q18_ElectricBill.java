class ElectricBill {
    int units;
    static double fixedCharge = 50.0;

    ElectricBill(int units) { this.units = units; }

    void calculateBill() {
        double energyCharge;
        if (units <= 100) energyCharge = units * 1.5;
        else if (units <= 200) energyCharge = 100 * 1.5 + (units - 100) * 2.5;
        else energyCharge = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4.0;
        double totalBill = energyCharge + fixedCharge;
        System.out.println("Units: " + units + ", Total bill: Rs. " + totalBill);
    }

    public static void main(String[] args) {
        new ElectricBill(250).calculateBill();
    }
}
