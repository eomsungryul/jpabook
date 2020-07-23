package jpabook.jpashop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity //JPA가 관리하는 객체
public class OrderItem {

	@Id @GeneratedValue
	@Column(name = "ORDER_ITEM_ID") //칼럼명 서로 다를 경우 매핑
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private Order order;

	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	@ManyToOne
	@JoinColumn(name="ITEM_ID")
	private Item item;

	//이제 필요없음 
//	@Column(name = "ORDER_ID")
//	private Long orderId;

//	@Column(name = "ITEM_ID")
//	private Long itemId;

	private int orderPrice;
	
	private int count;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
//	public Long getOrderId() {
//		return orderId;
//	}
//	public void setOrderId(Long orderId) {
//		this.orderId = orderId;
//	}
//	public Long getItemId() {
//		return itemId;
//	}
//	public void setItemId(Long itemId) {
//		this.itemId = itemId;
//	}
	
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}


}
