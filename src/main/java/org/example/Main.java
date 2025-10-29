package org.example;

import org.example.db.DB;
import org.example.db.DbException;
import org.example.model.entities.Department;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        System.out.println(obj);
    }
}