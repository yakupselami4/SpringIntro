import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		customerService.add();
		
		//Customer customer = (Customer)context.getBean("customer");
		//System.out.println(customer);
		
	}
	
	//IoC
	//Dependency Injection

}
