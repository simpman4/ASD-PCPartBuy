/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author zinha
 */
public class Payment implements Serializable {

    private int paymentID;
    private String paymentType;
    private String paymentDate;
    private int cardNo;
    private String cardExpiryDate;
    private int orderId;
    private int cvc;
    private String paymentStatus;

    public Payment() {
    }

    public Payment(int paymentID, String paymentType, String paymentDate, int cardNo, String cardExpiryDate, int orderId, int cvc, String paymentStatus) {
        this.paymentID = paymentID;
        this.paymentType = paymentType;
        this.paymentDate = paymentDate;
        this.cardNo = cardNo;

        this.cardExpiryDate = cardExpiryDate;
        this.orderId = orderId;
        this.cvc = cvc;
        this.paymentStatus = paymentStatus;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

}
