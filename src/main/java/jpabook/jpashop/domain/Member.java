package jpabook.jpashop.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity //JPA가 관리하는 객체
//@Table(indexes = ) //인덱스 확인 가능.
//@Table(name = "MBR") // MBR이라는 테이블과 매핑된다.
//@Entity(name = "Member") // 다른 패키지의 같은 이름의 클래스가 있는 경우 하나는 다른 이름을 써줘야 할 때 정도 사용.
// @Table(name = "USER") 테이블 서로 다를 경우 매핑
public class Member {

	@Id @GeneratedValue 
	@Column(name="MEMBER_ID")
	private Long id;
	
	//@Column(length = 10)//길이제한. 협업 시 개발자가 직관적으로 확인 가능
	private String name;
	private String city;
	private String street;
	private String zipcode; // 좀 더 상세한 설정을 하려면 직접 DB에서 수정하거나, 엔티티 상에서 상세히 작성하는 방법이 있다. 스타일 차이.
	
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	

	
	
	
//	@Id @GeneratedValue
//	@Column(name="MEMBER_ID")
//	private Long id;
//	private String name;
//	private String street;
//	private String zipcode;
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
//	public String getStreet() {
//		return street;
//	}
//	public void setStreet(String street) {
//		this.street = street;
//	}
//	public String getZipcode() {
//		return zipcode;
//	}
//	public void setZipcode(String zipcode) {
//		this.zipcode = zipcode;
//	}


}
