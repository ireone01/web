/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Admin
 */
public class Customer {
    private int uid ;
    private String user;
    private String pass;
    
    
   public Customer(){
       
   }

    public Customer(int uid, String user, String pass) {
        this.uid = uid;
        this.user = user;
        this.pass = pass;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Customer{" + "uid=" + uid + ", user=" + user + ", pass=" + pass + '}';
    }
   
}
