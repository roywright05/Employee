package com.example.employee;

public class Employee {

    private String first_name, last_name, address, city, state, zip;
    private long taxId;
    private String position, department;

    public Employee(String first_name, String last_name, String address, String city, String state, String zip) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Employee(long taxId, String position, String department) {
        this.taxId = taxId;
        this.position = position;
        this.department = department;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public long getTaxId() {
        return taxId;
    }

    public void setTaxId(long taxId) {
        this.taxId = taxId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

//Coding
//        1. Create an object Employee. The class should have the following member variables:
//        1. FirstName
//        2. LastName
//        3. StreetAddress
//        4. City
//        5. State
//        6. Zip
//        7. TaxID
//        8. Position
//        9. Department
//        2. Create a database (Room or Sqlite) for the Employee object.
//        3. Create the following Activities:
//        1. MainActivity
//        1. Make this into a splash screen activity.
//        2. After any initializations for the applications, start the FilterEmployeeActivity.
