public class JedliksToyCar {
    public int distance;
    public int battery = 100;
    
    public static JedliksToyCar buy() {
        // throw new UnsupportedOperationException("Please implement the (static) JedliksToyCar.buy()  method");
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        // throw new UnsupportedOperationException("Please implement the JedliksToyCar.distanceDisplay()  method");
        return "Driven " + this.distance + " meters";
    }

    public String batteryDisplay() {
        // throw new UnsupportedOperationException("Please implement the JedliksToyCar.batteryDisplay()  method");
        if (this.battery > 0)
            return "Battery at " + this.battery + "%";
        return "Battery empty";
    }

    public void drive() {
        // throw new UnsupportedOperationException("Please implement the JedliksToyCar.drive()  method");
        if (this.battery < 1) return; 
        this.distance += 20;
        this.battery -= 1;
    }
}
