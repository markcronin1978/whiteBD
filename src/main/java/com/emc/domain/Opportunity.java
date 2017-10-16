package com.emc.domain;

import java.util.UUID;

public class Opportunity {
	
	private String id;
	private String oppID;
	private String orderID;
	private String accName;
	private Product product;
	private int noOfRacks;
	private TpmName tpmName;
	private String comments;
	
	/**
	 * Declaration of TPM names as Enums
	 * @author cronit
	 *
	 */
	public enum TpmName{
		N_A,
		Demas,
		Mark,
		Conor,
		Tom,
		Ed,
		Kieran,
		Kevin,
		Greg
	};
	
	/**
	 * Declaration of Products as Enums
	 * @author cronit
	 *
	 */
	public enum Product{
		Backup,	
		CTE,	
		Replication,	
		STE,	
		Block,	
		Fabric,	
		VxB240_5200,	
		VxB340_5400,	
		VxB340_5600,	
		VxB340_5800,	
		VxB340_7600,	
		VxB340_8000,	
		VxB350_U300,	
		VxB350_U300F,	
		VxB350_U350F,	
		VxB350_U400,	
		VxB350_U400F,	
		VxB350_U450F,	
		VxB350_U500,	
		VxB350_U500F,	
		VxB350_U550F,	
		VxB350_U600,	
		VxB350_U600F,	
		VxB350_U650F,	
		VxB540_10TB,	
		VxB540_20TB,	
		VxB540_40TB,	
		VxB540_5TB,	
		VxB740_100K,	
		VxB740_200K,	
		VxB740_250F,	
		VxB740_250FX,	
		VxB740_400K,	
		VxB740_450F,	
		VxB740_450FX,	
		VxB740_850F,	
		VxB740_850FX,	
		VxB740_950F,	
		VxB740_950FX,	
		VxRack_FLEX,	
		VxRack_SDDC,
		XAPP_1_RACK
	};
	
	
	public Opportunity() {
		this.id = UUID.randomUUID().toString();
	}
	
	public Opportunity(String id, String oppID, String orderID, String accName, Product product, int noOfRacks, TpmName tpmName, String comments) {
		super();
		this.id = id;
		this.oppID = oppID;
		this.orderID = orderID;
		this.accName = accName;
		this.product = product;
		this.noOfRacks = noOfRacks;
		this.tpmName = tpmName;
		this.comments = comments;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOppID() {
		return oppID;
	}

	public void setOppID(String oppID) {
		this.oppID = oppID;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public int getNoOfRacks() {
		return noOfRacks;
	}
	
	public void SetNoOfRacks(int noOfRacks) {
		this.noOfRacks = noOfRacks;
	}

	public TpmName getTpmName() {
		return tpmName;
	}

	public void setTpmName(TpmName tpmName) {
		this.tpmName = tpmName;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Opportunity [id=" + id + ", oppID=" + oppID + ", orderID=" + orderID + ", accName=" + accName
				+ ", product=" + product + ", noOfRacks=" + noOfRacks + ", tpmName=" + tpmName + ", comments="
				+ comments + "]";
	}

}
