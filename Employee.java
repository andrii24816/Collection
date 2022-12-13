package org.example;

import java.util.Objects;

public class Employee extends People{

    private  String company;
    private  String position;
    private int salary;

    public Employee(String name, String company1) {

        super(name);
        company = company1;
        position = "manager";
        salary = 12500;
    }

    public Employee(String name, String company1,  String position1, int salary1) {
        super(name);
        company = company1;
        position = position1;
        salary = salary1;
    }

    public Employee(String Name, int Number, int LeaseTerm, int CodeP, String company1,  String position1, int salary1) {

        super(Name, Number, LeaseTerm, CodeP);
        company = company1;
        position = position1;
        salary = salary1;
    }

    public String getCompany(){ return company; }

    public String toString(){

        return "Info{ " +
                "Name - " + this.GetName()+ " |" +
                "CodeP - " + this.GetCodeP() + " |" +
                "Phone Number +" + this.GetNumber() + " |" +
                "Lease Term " + this.GetLeaseTerm() + "mounth |" +
                "Company name " + this.getCompany() + " |" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Employee people = (Employee) o;
        return Objects.equals(GetName(), people.GetName()) && Objects.equals(GetCodeP(), people.GetCodeP()) && Objects.equals(GetNumber(), people.GetNumber()) && Objects.equals(GetLeaseTerm(),people.GetLeaseTerm()) && Objects.equals(salary, people.salary) && Objects.equals(company, people.company) &&  Objects.equals(position, people.position);
    }
    @Override
    public int hashCode() { return Objects.hash( CodeP, Name, Number, LeaseTerm); }

}