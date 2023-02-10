package classesandobjects;

public class AccountHolderObjects {
	public static void main(String[] args) {
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		
		tom.firstName = "Tom";
		tom.lastname = "Smith";
		tom.age = 21;
		tom.accountBalance = 10000;
		tom.testEligibilityForCreditCard();
		System.out.println(tom.eligibleForCreditCard);
		
		henry.firstName = "Henry";
		henry.lastname = "Hill";
		henry.age = 31;
		henry.accountBalance = 20000;
		henry.testEligibilityForCreditCard();
		System.out.println(henry.eligibleForCreditCard);
		
		sarah.firstName = "Sarah";
		sarah.lastname = "Lee";
		sarah.age = 25;
		sarah.accountBalance = 15000;
		sarah.testEligibilityForCreditCard();
		System.out.println(sarah.eligibleForCreditCard);
	}

}
