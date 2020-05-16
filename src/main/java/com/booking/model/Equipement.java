package com.booking.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Equipement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int equipementID;
	private String equipementName;
	private long quanityRequired;
	private Date purchasedDate;
	private long costOfPurchasedEquipements;

	public Equipement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Equipement(int equipementID, String equipementName, long quanityRequired, Date purchasedDate,
			long costOfPurchasedEquipements) {
		super();
		this.equipementID = equipementID;
		this.equipementName = equipementName;
		this.quanityRequired = quanityRequired;
		this.purchasedDate = purchasedDate;
		this.costOfPurchasedEquipements = costOfPurchasedEquipements;
	}
	
	
	public int getEquipementID() {
		return equipementID;
	}
	public void setEquipementID(int equipementID) {
		this.equipementID = equipementID;
	}
	public String getEquipementName() {
		return equipementName;
	}
	public void setEquipementName(String equipementName) {
		this.equipementName = equipementName;
	}
	public long getQuanityRequired() {
		return quanityRequired;
	}
	public void setQuanityRequired(long quanityRequired) {
		this.quanityRequired = quanityRequired;
	}
	public Date getPurchasedDate() {
		return purchasedDate;
	}
	public void setPurchasedDate(Date purchasedDate) {
		this.purchasedDate = purchasedDate;
	}
	public long getCostOfPurchasedEquipements() {
		return costOfPurchasedEquipements;
	}
	public void setCostOfPurchasedEquipements(long costOfPurchasedEquipements) {
		this.costOfPurchasedEquipements = costOfPurchasedEquipements;
	}
	@Override
	public String toString() {
		return "Equipement [equipementID=" + equipementID + ", equipementName=" + equipementName + ", quanityRequired="
				+ quanityRequired + ", purchasedDate=" + purchasedDate + ", costOfPurchasedEquipements="
				+ costOfPurchasedEquipements + "]";
	}
	
	
	
}
