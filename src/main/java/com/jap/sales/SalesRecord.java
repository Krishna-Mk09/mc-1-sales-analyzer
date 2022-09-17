package com.jap.sales;

public class SalesRecord {
    private String date;
    private int customerId;
    private int productCategory;
    private String paymentMethod;
    private double amount;
    private double timeOnSite;
    private int clicksInSite;

    public SalesRecord(String date, int customerId, int productCategory, String paymentMethod, double amount, double timeOnSite, int clicksInSite) {
        this.date = date;
        this.customerId = customerId;
        this.productCategory = productCategory;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.timeOnSite = timeOnSite;
        this.clicksInSite = clicksInSite;
    }

    public SalesRecord() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(int productCategory) {
        this.productCategory = productCategory;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTimeOnSite() {
        return timeOnSite;
    }

    public void setTimeOnSite(double timeOnSite) {
        this.timeOnSite = timeOnSite;
    }

    public int getClicksInSite() {
        return clicksInSite;
    }

    public void setClicksInSite(int clicksInSite) {
        this.clicksInSite = clicksInSite;
    }

    // A method that is used to print the object.
    @Override
    public String toString() {
        return "SalesRecord{" + "date='" + date + '\'' + ", customer_id=" + customerId + ", product_category=" + productCategory + ", payment_method='" + paymentMethod + '\'' + ", amount=" + amount + ", time_on_site=" + timeOnSite + ", clicks_in_site=" + clicksInSite + '}';
    }
}
