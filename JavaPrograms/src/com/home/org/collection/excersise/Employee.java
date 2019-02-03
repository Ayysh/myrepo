package com.home.org.collection.excersise;

import java.util.*;

public class Employee {

    private String empname;
    private int age;
    private int empid;


    public Employee(String empname, int age, int empid) {
        this.empname = empname;
        this.age = age;
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public int getAge() {
        return age;
    }

    public int getEmpid() {
        return empid;
    }

    @Override
    public String toString() {
        return "Employee" +
                "empname='" + empname + '\'' +
                ", age=" + age +
                ", empid=" + empid;
    }

    public static void main(String[] args) {

        // List and Arraylist

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Ayys", 26, 101));
        employeeList.add(new Employee("Shankar", 31, 103));
        employeeList.add(new Employee("vijaya", 54, 102));
        employeeList.add(new Employee("moni", 55, 104));


       /* for(Employee emp : employeeList)
        {
            System.out.println(emp);
        } OR */

        Iterator<Employee> iterator = employeeList.iterator();
        System.out.println("The employee details from List are : \n");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // ****************Using Maps*******************

        Map<Integer, Employee> employeeMap = new HashMap<>();
        Iterator<Employee> iterator1 = employeeList.iterator();
        while (iterator1.hasNext()) {
            Employee e = iterator1.next();
            employeeMap.put(e.getEmpid(), e);
        }

        //  employeeMap.put(101, new Employee("Ayyshu", 26, 101));
        // employeeMap.put(103, new Employee("Shankar", 31, 103));
        //employeeMap.put(102, new Employee("Vijaya", 54, 102));
        //employeeMap.put(104, new Employee("Moni", 55, 104));

        //  System.out.println("The employee details from Map are : \n " + employeeMap.get(104));

        // Iterate through key set which is a integer ( get from empmap, the keyset and iterate
        Iterator<Integer> keyIterator = employeeMap.keySet().iterator();
        System.out.println(" The employee key details from map are\n");
        while (keyIterator.hasNext()) {
            // System.out.println(keyIterator.next());  -- gives only key
            //  System.out.println(employeeMap.get(keyIterator.next())); -- gives only value
            int k = keyIterator.next();
            System.out.println("The key is: " + k);
            System.out.println("The values are -> " + "name: " + employeeMap.get(k).getEmpname() + " age: " + employeeMap.get(k).getAge());
        }
    }
    }