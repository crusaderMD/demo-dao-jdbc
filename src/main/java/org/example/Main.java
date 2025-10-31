package org.example;

import org.example.model.dao.DaoFactory;
import org.example.model.dao.SellerDao;
import org.example.model.entities.Department;
import org.example.model.entities.Seller;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById=====");
        Seller seller = sellerDao.findById(Integer.valueOf(3));
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment=====");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        for (Seller sel : sellers) {
            System.out.println(sel);
        }
    }
}