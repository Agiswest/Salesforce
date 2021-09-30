package models;

public class Account {
    String accountName;
    String webSite;
    String phone;
    String employees;
    String type;
    String industry;

    public Account(String accountName, String webSite,
                   String phone, String employees,
                   String type, String industry) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.phone = phone;
        this.employees = employees;
        this.type = type;
        this.industry = industry;
    }

    public Account(String accountName, String webSite, String phone, String employees) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.phone = phone;
        this.employees = employees;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

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
}
