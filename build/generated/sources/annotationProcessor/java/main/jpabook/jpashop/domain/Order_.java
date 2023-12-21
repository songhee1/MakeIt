package jpabook.jpashop.domain;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Order.class)
public abstract class Order_ {

	public static volatile SingularAttribute<Order, Delivery> delivery;
	public static volatile SingularAttribute<Order, Member> member;
	public static volatile SingularAttribute<Order, Long> id;
	public static volatile ListAttribute<Order, OrderItem> orderItems;
	public static volatile SingularAttribute<Order, LocalDateTime> orderDate;
	public static volatile SingularAttribute<Order, OrderStatus> status;

	public static final String DELIVERY = "delivery";
	public static final String MEMBER = "member";
	public static final String ID = "id";
	public static final String ORDER_ITEMS = "orderItems";
	public static final String ORDER_DATE = "orderDate";
	public static final String STATUS = "status";

}

