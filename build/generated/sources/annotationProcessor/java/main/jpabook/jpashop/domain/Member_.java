package jpabook.jpashop.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Member.class)
public abstract class Member_ {

	public static volatile SingularAttribute<Member, Address> address;
	public static volatile SingularAttribute<Member, String> name;
	public static volatile ListAttribute<Member, Order> orders;
	public static volatile SingularAttribute<Member, Long> id;

	public static final String ADDRESS = "address";
	public static final String NAME = "name";
	public static final String ORDERS = "orders";
	public static final String ID = "id";

}

