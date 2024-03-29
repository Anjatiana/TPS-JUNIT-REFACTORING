package Money;

public class Money implements IMoney {
	//...

	private int fAmount;
	private String fCurrency;
	
	public Money(int amount, String currency){
		fAmount = amount;
		fCurrency = currency;
				
	}
	
	public int amount(){
		return fAmount;
	}
	
	public String currency(){
		return fCurrency;
	}
	
	//public Money add(Money m) {
	//	if (m.currency().equals(currency()))
	//	return new Money(amount() + m.amount(), currency());
		//return new MoneyBag(this, m);
	//	}
	public IMoney add(IMoney m) {
	return m.add(this);
	}

	@Override
	public IMoney addMoney(MoneyBag moneyBag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMoney add(Money Money) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
