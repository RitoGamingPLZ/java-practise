public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        // throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusMultiplier() method");
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return this.bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        // throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
        return Math.min(this.salaryMultiplier(daysSkipped) * 1000 + bonusForProductsSold(productsSold), 2000);
    } 
}
