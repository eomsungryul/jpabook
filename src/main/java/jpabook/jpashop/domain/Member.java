package jpabook.jpashop.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity //JPA媛� 愿�由ы븯�뒗 媛앹껜
//@Table(name = "MBR") // MBR�씠�씪�뒗 �뀒�씠釉붽낵 留ㅽ븨�맂�떎.
//@Entity(name = "Member") // �떎瑜� �뙣�궎吏��쓽 媛숈� �씠由꾩쓽 �겢�옒�뒪媛� �엳�뒗 寃쎌슦 �븯�굹�뒗 �떎瑜� �씠由꾩쓣 �뜥以섏빞 �븷 �븣 �젙�룄 �궗�슜.
// @Table(name = "USER") �뀒�씠釉� �꽌濡� �떎瑜� 寃쎌슦 留ㅽ븨
public class Member {

	@Id @GeneratedValue //디폴트 오토
	@Column(name="MEMBER_ID")
	//@Column(length=10) // 길이 제한을 보여줌으로서 해당 컬럼이 요 정해진 길이를 넘으면 안된다는 것을 알 수 있다.
	private Long id;

	private String name;
	private String street;
	private String zipcode;
	
	//잘못된 코드 멤버안에서 구지 주문데이터를 뽑는다? 크흠...
	@OneToMany(mappedBy = "order")
	private List<Order> orders =  new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


}
