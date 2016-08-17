package apachecxfclient;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vasu.learning.Order;
import com.vasu.learning.OrderProcess;

public class OrderClient {

	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		Order order = new Order();
		order.setCustomerID("2");
		order.setItemID("1");
		order.setPrice(10);
		order.setQty(2);
		
		OrderProcess client = (OrderProcess) context.getBean("orderClient");
		String orderId = client.processOrder(order);
		System.out.println(orderId);
	}
}
