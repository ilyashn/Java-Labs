package com.itmo;

import java.util.Date;
import java.util.Objects;

public class FoodItem extends GenericItem {
    private Date dateOfIncome;
    private short expires;

    public FoodItem(int id, String name, float price, GenericItem analog, Category category, Date dateOfIncome, short expires) {
        super(id, name, price, category, analog);
        this.expires = expires;
        this.dateOfIncome = dateOfIncome;
    }

    public Date getDateOfIncome() {
        return dateOfIncome;
    }

    public short getExpires() {
        return expires;
    }


    @Override
    public void printAll() {
        System.out.println(this.toString());
    }


    public FoodItem clone() {
        return new FoodItem(getId(), getName(), getPrice(), getAnalog(), getCategory(), new Date(getDateOfIncome().getTime()), getExpires());
    }

    @Override
    public String toString() {
        return super.toString() + ", Date: " + this.dateOfIncome + ", Expires: " + this.expires;
    }

    @Override
    public boolean equals(Object o) {
        FoodItem foodItem = (FoodItem)o;
        return super.equals(o) && this.dateOfIncome.compareTo(foodItem.getDateOfIncome())==0 && (this.expires == foodItem.getExpires());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dateOfIncome, expires);
    }
}
