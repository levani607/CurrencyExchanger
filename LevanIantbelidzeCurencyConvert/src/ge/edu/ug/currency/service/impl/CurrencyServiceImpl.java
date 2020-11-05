package ge.edu.ug.currency.service.impl;

import ge.edu.ug.currency.service.CurrencyService;

import java.util.Scanner;

public class CurrencyServiceImpl implements CurrencyService {

    double exchangeRate;

    @Override
    public double convert(int amount) {
        double x =amount/exchangeRate;
        return x;
    }

    @Override
    public double convert(double amount) {
        double x =amount/exchangeRate;
        return x;
    }

    @Override
    public void setExchangeRate(double value) {
       exchangeRate=value;
    }
}
