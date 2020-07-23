package jpabook.jpashop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderItem;

public class JpaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();


		// �듃�옖�옲�뀡
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			//Order order = em.find(Order.class, 1L);
			//Long memberId = order.getMemberId();
//			System.out.println("=================");
			
			Order order = new Order();
//			order.addOrderItem()
			em.persist(order);
			
			OrderItem orderItem = new OrderItem();
			orderItem.setOrder(order);
			em.persist(orderItem);
			
			
			
			
		} catch(Exception e) {
			tx.rollback();
		} finally {
			em.close();
		}

		emf.close();
	}

}
