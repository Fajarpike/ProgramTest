package InnerClass;

public class NestedAPP {
    public static void main(String[] args) {
        
        Company company = new Company();
        company.setName("PT Gajah Mungkur");

        Company.Employee employee = company.new Employee();
        employee.setName("PT Gajar Duduk");

        System.out.println(company.getName());
        System.out.println(employee.getName());

        Company company2 = new Company();
        company2.setName("Belum ada");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("PT Sinar Fajar");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
    
}
