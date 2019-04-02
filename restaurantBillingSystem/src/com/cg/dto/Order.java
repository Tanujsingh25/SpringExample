package com.cg.dto;

import javax.persistence.Entity;

@Entity
public class Order {
	private int order_id;
	private int table_no;
	private String order_status;
	private int wait_time;
	private double total_price;
	public Order() {}
	public int getOrder_id() {
		return order_id;
	}
	public Order(int order_id, int table_no, String order_status, int wait_time, double total_price) {
		super();
		this.order_id = order_id;
		this.table_no = table_no;
		this.order_status = order_status;
		this.wait_time = wait_time;
		this.total_price = total_price;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getTable_no() {
		return table_no;
	}
	public void setTable_no(int table_no) {
		this.table_no = table_no;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public int getWait_time() {
		return wait_time;
	}
	public void setWait_time(int wait_time) {
		this.wait_time = wait_time;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + order_id;
		result = prime * result + ((order_status == null) ? 0 : order_status.hashCode());
		result = prime * result + table_no;
		long temp;
		temp = Double.doubleToLongBits(total_price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + wait_time;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (order_id != other.order_id)
			return false;
		if (order_status == null) {
			if (other.order_status != null)
				return false;
		} else if (!order_status.equals(other.order_status))
			return false;
		if (table_no != other.table_no)
			return false;
		if (Double.doubleToLongBits(total_price) != Double.doubleToLongBits(other.total_price))
			return false;
		if (wait_time != other.wait_time)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", table_no=" + table_no + ", order_status=" + order_status
				+ ", wait_time=" + wait_time + ", total_price=" + total_price + "]";
	}
}
