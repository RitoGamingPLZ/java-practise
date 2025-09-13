public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        // throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRatePerHour() method");
        double successRate = 1.0;
        int baseline = 221;

        if (speed == 10) {
            successRate = 0.77;
        }

        if (speed == 9) {
            successRate = 0.80;
        }

        if (speed >= 5 && speed < 9) {
            successRate = 0.90;
        }

        return successRate * speed * baseline;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(this.productionRatePerHour(speed) / 60);
    }
}
