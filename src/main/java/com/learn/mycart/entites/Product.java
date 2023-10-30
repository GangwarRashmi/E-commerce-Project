
package com.learn.mycart.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int p_Id;
    private String p_Name;
    @Column(length=3000)
    private String p_Desc;
    private String p_Photo;
    private int p_Price;
    private int p_Discount;
    private int p_Quantity;
    
    public Product(){
        
    }

    public Product(int p_Id, String p_Name, String p_Desc, String p_Photo, int p_Price, int p_Discount, int p_Quantity) {
        this.p_Id = p_Id;
        this.p_Name = p_Name;
        this.p_Desc = p_Desc;
        this.p_Photo = p_Photo;
        this.p_Price = p_Price;
        this.p_Discount = p_Discount;
        this.p_Quantity = p_Quantity;
    }

    public int getP_Id() {
        return p_Id;
    }

    public void setP_Id(int p_Id) {
        this.p_Id = p_Id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }

    public String getP_Desc() {
        return p_Desc;
    }

    public void setP_Desc(String p_Desc) {
        this.p_Desc = p_Desc;
    }

    public String getP_Photo() {
        return p_Photo;
    }

    public void setP_Photo(String p_Photo) {
        this.p_Photo = p_Photo;
    }

    public int getP_Price() {
        return p_Price;
    }

    public void setP_Price(int p_Price) {
        this.p_Price = p_Price;
    }

    public int getP_Discount() {
        return p_Discount;
    }

    public void setP_Discount(int p_Discount) {
        this.p_Discount = p_Discount;
    }

    public int getP_Quantity() {
        return p_Quantity;
    }

    public void setP_Quantity(int p_Quantity) {
        this.p_Quantity = p_Quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "p_Id=" + p_Id + ", p_Name=" + p_Name + ", p_Desc=" + p_Desc + ", p_Photo=" + p_Photo + ", p_Price=" + p_Price + ", p_Discount=" + p_Discount + ", p_Quantity=" + p_Quantity + '}';
    }
    
    
    
    
    
    
    
    
}
