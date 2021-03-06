package com.cg.capstore.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerBean {

	private String email;

	private String password;

	private String customerName;

	private String mobileNo;

	private String address;

	private WishlistBean wishlist;

	private List<ProductBean> cart;

	public List<ProductBean> getCart() {
		return cart;
	}

	public void setCart(List<ProductBean> cart) {
		this.cart = cart;
	}

	private OrderBean order;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public WishlistBean getWishlist() {
		return wishlist;
	}

	public void setWishlist(WishlistBean wishlist) {
		this.wishlist = wishlist;
	}

	public OrderBean getOrder() {
		return order;
	}

	public void setOrder(OrderBean order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "CustomerBean [email=" + email + ", password=" + password + ", customerName=" + customerName
				+ ", mobileNo=" + mobileNo + ", address=" + address + ", wishlist=" + wishlist + ", cart=" + cart
				+ ", order=" + order + "]";
	}

	public CustomerBean(String email, String password, String customerName, String mobileNo, String address,
			WishlistBean wishlist, List<ProductBean> cart, OrderBean order) {
		super();
		this.email = email;
		this.password = password;
		this.customerName = customerName;
		this.mobileNo = mobileNo;
		this.address = address;
		this.wishlist = wishlist;
		this.cart = cart;
		this.order = order;
	}

	public CustomerBean() {
		super();
		// TODO Auto-generated constructor stub
	}
}