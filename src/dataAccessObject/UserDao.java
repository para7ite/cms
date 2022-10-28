/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccessObject;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;

public class UserDao {
    public static void save(User user){
        String query="insert into user(name,email,mobileNo,address,password,secQues,ans,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobileNo()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getSecQues()+"','"+user.getAns()+"','false')";
        DBOperations.setDataOrDelete(query,"Registered Successfully! Wait for Admin approval");
    }
    public static User login(String email,String password){
        User user = null;
        try{
            ResultSet rs=DBOperations.getData("select *from user where email='"+email+"'and password='"+password+"'");//result set is from sql library
            while(rs.next()){
                user=new User();
                user.setStatus(rs.getString("status"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, email, 0);
        }
        return user;
    }
    
    public static User getSecurityQuestion(String email){
        User user = null;
        try{
            ResultSet rs=DBOperations.getData("select *from user where email='"+email+"'");
            while(rs.next()){
                user = new User();
                user.setSecQues(rs.getString("secQues"));
                user.setAns(rs.getString("ans"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    
    public static ArrayList<User> getAllRecords(String email){
        User user = null;
        ArrayList<User> arrayList=new ArrayList<>();
        try{
            ResultSet rs=DBOperations.getData("select *from user where email like '%"+email+"%'");
            while(rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobileNo(rs.getString("mobileNo"));
                user.setAddress(rs.getString("address"));
                user.setSecQues(rs.getString("SecQues"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
            }   
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void update(String email,String newPassword){
        String query = "update user set password = '"+ newPassword + "' where email='" + email + "'";
        DBOperations.setDataOrDelete(query,"Password change successfully");
    }
    public static void changeStatus(String email,String status){
        String query="update user set status='"+status+"' where email ='"+email+"'";
        DBOperations.setDataOrDelete(query,"Status Changed Successfully");
    }
    public static void changePassword(String email,String oldPassword,String newPassword){
        try{
            ResultSet rs=DBOperations.getData("select *from user where email='"+email+"' and password ='"+oldPassword+"'");
            if(rs.next()){
                update(email,newPassword);
            }
            else{
                JOptionPane.showMessageDialog(null, "Old Password is Wrong");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void changeSecurityQuestion(String email,String Password,String securityQuestion,String answer){
        try{
            ResultSet rs=DBOperations.getData("select *from user where email='"+email+"' and password ='"+Password+"'");
            if(rs.next()){
                update(email,securityQuestion,answer);
            }
            else{
                JOptionPane.showMessageDialog(null, "Old Password is Wrong");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void update(String email,String securityQuestion,String answer){
        String query="update user set secQues='"+securityQuestion+"',ans='"+answer+"' where email='"+email+"'";
        DBOperations.setDataOrDelete(query,"Security Question Changed Successfully");
    }
    
}
 