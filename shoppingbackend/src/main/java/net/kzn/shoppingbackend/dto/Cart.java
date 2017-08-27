package net.kzn.shoppingbackend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cart implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/*  add @OneToOne remove this @Column(name="user_id")
	private int userId;*/
	
	//-----------------------------------------------------------------------
	@OneToOne
	//@JoinColumn(name="user_id")
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	//-----------------------------------------------------------------------
	
	@Column(name="grand_total")
	private double grandTotal;
	@Column(name="cart_lines")
	private int cartLines;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/* remove getter setter for userId public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}*/
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public int getCartLines() {
		return cartLines;
	}
	public void setCartLines(int cartLines) {
		this.cartLines = cartLines;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	}
	