package models;

public class Account {
    String accountName;
    String webSite;
    String phone;
    String employees;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public Account(String accountName, String webSite, String phone, String employees) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.phone = phone;
        this.employees = employees;
    }
}
