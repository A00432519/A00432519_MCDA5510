package com.mcda5510.A00432519.entity;

public class Transaction{
	
	private int id;

	private String nameOnCard;
	
	private String cardNumber;
	
	private String cardType;
	
	private double unitPrice;
	
	private double quantity;
	
	private String totalPrice;
	
	private String expDate;
	
	private String createdOn;
	
	private String createdBy;
	

	
	
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}	
	
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	
	
	public String toString(){
		
		String results = new String();
		
		results = "[ID: " + id + ",NameOnCard: " + nameOnCard +",CardNumber: " + cardNumber+ ",UnitPrice: " + unitPrice + ",Quantity: " + quantity + ",TotalPrice: " + totalPrice + ",ExpDate: " + expDate + ",CreatedOn: " + createdOn + ",CreatedBy: " + createdBy + ",CardType: " + cardType+"]";
		return results;

	}

	
	
}
