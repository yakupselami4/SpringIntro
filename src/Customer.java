
public class Customer {
	
	private String name;
	private String nationalityId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	@Override
	public String toString() {
		return "Customer ["
				+ "name=" + name + ","
				+ " nationalityId=" + nationalityId + 
				"]";
	}
	
	
}
