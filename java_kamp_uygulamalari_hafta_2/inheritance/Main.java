package java_kamp_uygulamalari_hafta_2.inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
        Employee employee = new Employee();
        
        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        
        employeeManager.bestEmployee();
        employeeManager.list();

	}

}
