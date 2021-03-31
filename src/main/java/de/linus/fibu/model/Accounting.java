package de.linus.fibu.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Document
public class Accounting {

    @MongoId
    @NotNull
    private long id;
    @NotNull
    private double amount;
    private String purpose;
    private PaymentMethod paymentMethod;
    private Date date;

    public Accounting(@NotNull long id, @NotNull double amount, String purpose, de.linus.fibu.model.PaymentMethod paymentMethod, Date date) {
        this.id = id;
        this.amount = amount;
        this.purpose = purpose;
        this.paymentMethod = paymentMethod;
        this.date = date;
    }

    public Accounting() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Accounting{")
                .append("id=")
                .append(id)
                .append(", amount=")
                .append(amount)
                .append(", purpose='")
                .append(purpose)
                .append('\'')
                .append(", PaymentMethod=")
                .append(paymentMethod)
                .append(", date=")
                .append(date)
                .append('}')
                .toString();
    }
}
