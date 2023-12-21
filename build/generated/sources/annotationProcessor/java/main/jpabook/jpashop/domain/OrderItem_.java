package jpabook.jpashop.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpabook.jpashop.domain.Item.Item;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrderItem.class)
public abstract class OrderItem_ {

	public static volatile SingularAttribute<OrderItem, Item> item;
	public static volatile SingularAttribute<OrderItem, Integer> count;
	public static volatile SingularAttribute<OrderItem, Integer> orderPrice;
	public static volatile SingularAttribute<OrderItem, Long> id;
	public static volatile SingularAttribute<OrderItem, Order> order;

	public static final String ITEM = "item";
	public static final String COUNT = "count";
	public static final String ORDER_PRICE = "orderPrice";
	public static final String ID = "id";
	public static final String ORDER = "order";

}

