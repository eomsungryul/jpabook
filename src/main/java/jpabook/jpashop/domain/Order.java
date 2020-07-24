package jpabook.jpashop.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity //JPA가 관리하는 객체
@Table(name = "ORDERS") //DB에는 ORDER가 예약어로 되어있다. 따라서 ORDERS
public class Order {
	
	
	@Id @GeneratedValue
	@Column(name = "ORDER_ID")
	private Long id;
	
	@Column(name = "MEMBER_ID") //객체를 관계형 DB에 맞춘 설계
	private Long memberId;
	
	//객체지향적인 모습으로, 특정 주문을 한 멤버를 찾는 방법
	private Member member;
	
	@OneToOne
	@JoinColumn(name = "DELIVERY_ID")
	private Delivery delivery;
	
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	private LocalDateTime orderDate; 
	
	@Enumerated(EnumType.STRING)//STRING의 경우 순서 꼬이지 않는다.
	private OrderStatus status;//주문 상태

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	
	
	
	
	
//	@Id @GeneratedValue
//	@Column(name="ITEM_ID")
//	private Long id;
//
//	private String name;
//	private int price;
//	private int stockQuantity;
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public int getStockQuantity() {
//		return stockQuantity;
//	}
//	public void setStockQuantity(int stockQuantity) {
//		this.stockQuantity = stockQuantity;
//	}


}
