import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        // throw new UnsupportedOperationException("Please implement the CaptainsLog.randomPlanetClass() method");
        int idx = this.random.nextInt(10);
        return this.PLANET_CLASSES[idx];
    }

    String randomShipRegistryNumber() {
        // throw new UnsupportedOperationException("Please implement the CaptainsLog.randomShipRegistryNumber() method");
        int idx = this.random.nextInt(9000);
        return String.format("NCC-%d", 1000 + idx);
    }

    double randomStardate() {
        // throw new UnsupportedOperationException("Please implement the CaptainsLog.randomStardate() method");
        double val = this.random.nextDouble(1000.0);
        return 41000.0 + val;
    }
}
