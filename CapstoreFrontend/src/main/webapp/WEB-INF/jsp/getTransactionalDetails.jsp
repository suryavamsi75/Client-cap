<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaction Details</title>
</head>
<body>
	<table border="1" style="width: 100%">
		<tr>
			<th>OrderId</th>
			<th>orderStatus</th>
			<th>quantity</th>
			<th>Payment Method</th>
			<th>deliveryDate</th>
			<th>MinBillingAmount</th>
			<th>Products</th>

		</tr>

		<tr>
			<td>${order.orderId}</td>
			<td>${order.orderStatus}</td>
			<td>${order.quantity}</td>
			<td>${order.paymentMethod}</td>
			<td>${order.deliveryDate}</td>
			<td>${order.minBillingAmount}</td>
			<td>${order.product}</td>

		</tr>

	</table>
	<a href="pay" name="Back">Back to payment Page</a>
	</br>

</body>
</html>