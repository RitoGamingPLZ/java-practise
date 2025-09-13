class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int battery = 100;
    private int distance;
    
    NeedForSpeed(int speed, int batteryDrain) {
        // throw new UnsupportedOperationException("Please implement the NeedForSpeed constructor");
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        // throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        // throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
        return this.distance;
    }

    public void drive() {
        // throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
        if (this.batteryDrained()) return;
        this.distance += this.speed;
        this.battery -= this.batteryDrain;
        
    }

    public static NeedForSpeed nitro() {
        // throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        // throw new UnsupportedOperationException("Please implement the RaceTrack constructor");
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (car.distanceDriven() < this.distance && !car.batteryDrained()) {
            car.drive();
        }
        return car.distanceDriven() >= this.distance;
    }
}
