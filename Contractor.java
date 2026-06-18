class Contractor extends Employee {
    double rate;
    int hours;

    Contractor(String name, double rate, int hours) {
        super(name);
        this.rate = rate;
        this.hours = hours;
    }

    double calculatePay() {
        return rate * hours;
    }
}
