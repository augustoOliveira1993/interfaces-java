package model.services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	public double getInterestRate();
	
	default double payment(double amount, int months) {
		if(months < 1) {
			throw new InvalidParameterException("Moths must be greater tham zeo");
		}
		return amount * Math.pow(1.0 + this.getInterestRate() / 100.0, months);
	}
}
