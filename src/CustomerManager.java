
public class CustomerManager implements ICustomerService{
	
	//dependency injection
	
	private ICustomerDal customerDal;
	
	
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	//constructor injection
//	public CustomerManager(ICustomerDal customerDal) {
//		this.customerDal = customerDal;
//	}

	@Override
	public void add() {
		customerDal.add();
		
	}

}
