package jpabook.jpashop;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.Order;


public class JpaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();

		// 트랜잭션
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try { 
			
			//주문한 멤버를 찾는 방법 1안
			
			Order order = em.find(Order.class, 1L); //id로 주문 찾음
			Long memberId = order.getMemberId(); //주문에서 멤버의 id를 찾음
			
			//em.find(Order.class, memberId);//찾은 memberId로 다시 em.find()
			// ------------------ 객체 지향적이지 않은 모습을 보여준다 ------------------ //
			
			Member member = em.find(Member.class, memberId);
			Member findMember = order.getMember();
			findMember.getName(); //참조를 통해 바로 찾아갈 수 있는 형태.
			
			tx.commit();
			System.out.println("=================");
		} catch(Exception e) {
			tx.rollback();
		} finally {
			em.close();
		}

		emf.close();
	}

}
