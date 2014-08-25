package com.webtradingplatform.service.interest_rates;

import java.io.IOException;

/**
 * Author: Daniel
 */
public interface IInterestRatesService {

    public double parserInterestRateForCountry(String countryName) throws IOException;

}
