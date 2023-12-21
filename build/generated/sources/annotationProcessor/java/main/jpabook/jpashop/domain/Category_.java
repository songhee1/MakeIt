package jpabook.jpashop.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpabook.jpashop.domain.Item.Item;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Category.class)
public abstract class Category_ {

	public static volatile SingularAttribute<Category, Category> parent;
	public static volatile SingularAttribute<Category, String> name;
	public static volatile SingularAttribute<Category, Long> id;
	public static volatile ListAttribute<Category, Item> items;
	public static volatile ListAttribute<Category, Category> child;

	public static final String PARENT = "parent";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String ITEMS = "items";
	public static final String CHILD = "child";

}

