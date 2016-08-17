package com.vasu.learning;

import javax.jws.WebService;

@WebService
public class OrderProcessImpl implements OrderProcess {

	public String processOrder(Order order) {
		String orderId = validate(order);
		return orderId;
	}

	/**
	 * Validates the order and returns the order ID
	 **/
	private String validate(Order order) {
		String custID = order.getCustomerID();
		String itemID = order.getItemID();
		int qty = order.getQty();
		double price = order.getPrice();
		if (custID != null && itemID != null && !custID.equals("")
				&& !itemID.equals("") && qty > 0 && price > 0.0) {
			return "ORD1234";
		}
		return null;
	}
}
