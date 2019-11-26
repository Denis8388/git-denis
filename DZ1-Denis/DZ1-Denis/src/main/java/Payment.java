public class Payment {
    public int paymentDistance(int fuel){
        int consumptionFuel = 10;     // 10 л. расход топлива на 100 км
        int distanceOnFuel = 100;
        int resultPayment = distanceOnFuel /consumptionFuel * fuel;
        return resultPayment;
    }
}
