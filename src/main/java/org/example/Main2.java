package org.example;

import org.example.model.dao.DaoFactory;
import org.example.model.dao.DepartmentDao;
import org.example.model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: department insert =====");
        Department department = new Department(null, "Pijamas");
        departmentDao.insert(department);
        System.out.println("Inserted! New id = " + department.getId());

        System.out.println("\n=== TEST 2: department update =====");
        Department department2 = new Department(8, "RPG");
        departmentDao.update(department2);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 3: department delete =====");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        System.out.println("\n=== TEST 4: department findById =====");
        Department dep = departmentDao.findById(Integer.valueOf(7));
        System.out.println(dep);

        System.out.println("\n=== TEST 5: department findByAll =====");
        List<Department> departments = departmentDao.findAll();
        for (Department dept : departments) {
            System.out.println(dept);
        }
        sc.close();
    }
}
