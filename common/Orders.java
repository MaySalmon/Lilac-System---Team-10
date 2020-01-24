package common;
import java.sql.Date;

public class Orders {
	private int ID;
	private int ClientID;
	private Date Time;
	private Date OrderDate;
	private int Shipment_Method;
	private String Address;
	private int ReciverPhone;
	private String ReciverName;
	private Date DeliveryTime;
	private ItemInOrder itemList;
	private static int DeliveryCost=10;
	private static int counter = 0;

	public Orders(Orders _order) {
		ID = _order.getID();
		ClientID = _order.getClientID();
		Time = _order.getTime();
		OrderDate = _order.getOrderDate();
		Shipment_Method = _order.getShipment_Method();
		Address = _order.getAddress();
		ReciverPhone = _order.ReciverPhone;
		ReciverName = _order.getReciverName();
		DeliveryTime = _order.getDeliveryTime();
		itemList = _order.getItemList();
	}

	public Orders(int _clientID, Date _time, Date _orderDate, int _shipment, String _address, int _receiverPhone,
			String _reciverName, Date _deliveryTime) {
		ID = ++counter;
		ClientID = _clientID;
		Time = _time;
		OrderDate = _orderDate;
		Shipment_Method = _shipment;
		Address = _address;
		ReciverPhone = _receiverPhone;
		ReciverName = _reciverName;
		DeliveryTime = _deliveryTime;
	}

	public int getClientID() {
		return ClientID;
	}

	public void setClientID(int clientID) {
		ClientID = clientID;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Date getTime() {
		return Time;
	}

	public void setTime(Date time) {
		Time = time;
	}

	public Date getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(Date orderDate) {
		OrderDate = orderDate;
	}

	public int getShipment_Method() {
		return Shipment_Method;
	}

	public void setShipment_Method(int shipment_Method) {
		Shipment_Method = shipment_Method;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getReciverPhone() {
		return ReciverPhone;
	}

	public void setReciverPhone(int reciverPhone) {
		ReciverPhone = reciverPhone;
	}

	public String getReciverName() {
		return ReciverName;
	}

	public void setReciverName(String reciverName) {
		ReciverName = reciverName;
	}

	public Date getDeliveryTime() {
		return DeliveryTime;
	}

	public void setDeliveryTime(Date deliveryTime) {
		DeliveryTime = deliveryTime;
	}



	public ItemInOrder getItemList() {
		return itemList;
	}

	public void setItemList(ItemInOrder itemList) {
		this.itemList = itemList;
	}

	public String toString() {
		return String.valueOf(this.ID);
	}

	public static int getDeliveryCost() {
		return DeliveryCost;
	}

	public static void setDeliveryCost(int deliveryCost) {
		DeliveryCost = deliveryCost;
	}
}