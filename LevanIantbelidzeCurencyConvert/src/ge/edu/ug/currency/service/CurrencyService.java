package ge.edu.ug.currency.service;

public interface CurrencyService {
    double convert(int amount);
    double convert(double amount);
    void setExchangeRate(double value);

}
