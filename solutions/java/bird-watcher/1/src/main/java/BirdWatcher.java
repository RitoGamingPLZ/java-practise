
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");\
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
        this.birdsPerDay[this.birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
        for (int cnt: this.birdsPerDay) {
            if (cnt == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
        int sum = 0;
        for (int i = 0; i < numberOfDays && i < this.birdsPerDay.length; i++) {
            sum += this.birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
        int busyDays = 0;
        for (int cnt: this.birdsPerDay) {
            if (cnt > 4) {
                busyDays += 1;
            }
        }
        return busyDays;
    }
}
