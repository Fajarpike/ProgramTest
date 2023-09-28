package InnerClass;

public class Company {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public class Employee {
        
        private String name;

        //kata kunci this digunakan untuk mengakses variable di outerClass
        public String getCompany(){
            return Company.this.name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        
    }
}
