/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccessObject;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class tables {
    public static void main(String[] args){
        try{
            String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNo varchar(10),address varchar(200),password varchar(200), secQues varchar(200),ans varchar(200),status varchar(20),unique(email))";
            String adminDetails="insert into user(name,email,mobileNo,address,password,secQues,ans,status) values('admin','admin@ccn.com','1234567890','India','admin','What is your favourite coffee shop','ccn','true')";
            String categoryTable="create table category(id int AUTO_INCREMENT primary key,name varchar(20))";
            String productTable="create table product(id int AUTO_INCREMENT primary key,name varchar(20), category varchar(200),price varchar(20))";
            String billTable="create table bill(id int primary key,name varchar(200), mobileNumber varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
            DBOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DBOperations.setDataOrDelete(adminDetails , "Admin details added Successfuly");
            DBOperations.setDataOrDelete(categoryTable, "User Table Created Successfully");
            DBOperations.setDataOrDelete(productTable, "Product Table Created Successfully");
            DBOperations.setDataOrDelete(billTable, "Bill Table Created Successfully");
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }
}
