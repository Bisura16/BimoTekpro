package Nomor1;
public class Commission extends Hourly
{
    private double totalSales;
    private double commissionRate;

    // Sets up this commissioned employee using the specified information.
    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate,
                      double commissionRate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        totalSales = 0;
    }

    // Adds the specified sales to this employee's accumulated sales.
    public void addSales(double sales)
    {
        totalSales += sales;
    }

    // Computes and returns the pay for this commissioned employee.
    public double pay()
    {
        double payment = super.pay(); // hourly pay
        payment += totalSales * commissionRate; // add commission
        totalSales = 0; // reset sales after paying
        return payment;
    }

    // Returns information about this commissioned employee.
    public String toString()
    {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        result += "\nCommission Rate: " + commissionRate;
        return result;
    }
}