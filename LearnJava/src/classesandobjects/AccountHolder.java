package classesandobjects;

public class AccountHolder {
	String firstName;
	String lastname;
	int age;
	float accountBalance;
	boolean eligibleForCreditCard;
	
	public void testEligibilityForCreditCard() {
	if (age>24 && accountBalance>=20000){
		eligibleForCreditCard = true;
	}
	}

}
