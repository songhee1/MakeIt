package jpabook.jpashop.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Delivery.class)
public abstract class Delivery_ {

	public static volatile SingularAttribute<Delivery, Address> address;
	public static volatile SingularAttribute<Delivery, Long> id;
	public static volatile SingularAttribute<Delivery, Order> order;
	public static volatile SingularAttribute<Delivery, DeliveryStatus> status;

	public static final String ADDRESS = "address";
	public static final String ID = "id";
	public static final String ORDER = "order";
	public static final String STATUS = "status";

}

