package openclosed;

public class EmployeeChildClass {
    private int employeeIdNumber;
    private String employeeCountry;

    public EmployeeChildClass(int employeeIdNumber, String employeeCountry) {
        this.employeeIdNumber = employeeIdNumber;
        this.employeeCountry = employeeCountry;
    }

    public int getEmployeeIdNumber() {
        return this.employeeIdNumber;
    }

    public void setEmployeeIdNumber(int employeeIdNumber) {
        this.employeeIdNumber = employeeIdNumber;
    }

    public String getEmployeeCountry() {
        return this.employeeCountry;
    }

    public void setEmployeeCountry(String employeeCountry) {
        this.employeeCountry = employeeCountry;
    }

    @Override
    public String toString() {
        return "{" +
            " employeeIdNumber='" + getEmployeeIdNumber() + "'" +
            ", employeeCountry='" + getEmployeeCountry() + "'" +
            "}";
    }




    
}
