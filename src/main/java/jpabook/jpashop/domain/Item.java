package jpabook.jpashop.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //JPA媛� 愿�由ы븯�뒗 媛앹껜
//@Table(name = "MBR") // MBR�씠�씪�뒗 �뀒�씠釉붽낵 留ㅽ븨�맂�떎.
//@Entity(name = "Member") // �떎瑜� �뙣�궎吏��쓽 媛숈� �씠由꾩쓽 �겢�옒�뒪媛� �엳�뒗 寃쎌슦 �븯�굹�뒗 �떎瑜� �씠由꾩쓣 �뜥以섏빞 �븷 �븣 �젙�룄 �궗�슜.
// @Table(name = "USER") �뀒�씠釉� �꽌濡� �떎瑜� 寃쎌슦 留ㅽ븨
public class Item {
	@Id @GeneratedValue
	@Column(name = "member_id")
	private Long id;
	private String name;
	
	
	
	// @Column(name = "id") 移쇰읆紐� �꽌濡� �떎瑜� 寃쎌슦 留ㅽ븨
	//private Long id;
	//private String name;
	
	//private int age;
	//private int gogo;
	// Getter, Setter ��
	
	public Item() {
		
	}
	
	public Item(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	

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
}
