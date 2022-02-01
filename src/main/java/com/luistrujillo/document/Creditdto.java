package com.luistrujillo.document;



public class Creditdto {
	
	
	  private String id;
		 
     //numero de credito
	private String cardNumber;
     //credito limite 
	private double creditLimit;
		 
    //tipo de credito 
    private String creditType;

    public Creditdto() {
	 
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getCreditType() {
		return creditType;
	}

	public void setCreditType(String creditType) {
		this.creditType = creditType;
	}
		 
	
  	 

}
