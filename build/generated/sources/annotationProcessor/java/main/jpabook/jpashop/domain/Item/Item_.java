package jpabook.jpashop.domain.Item;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpabook.jpashop.domain.Category;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Item.class)
public abstract class Item_ {

	public static volatile SingularAttribute<Item, Integer> price;
	public static volatile SingularAttribute<Item, String> name;
	public static volatile SingularAttribute<Item, Integer> stockQuantity;
	public static volatile SingularAttribute<Item, Long> id;
	public static volatile ListAttribute<Item, Category> categories;

	public static final String PRICE = "price";
	public static final String NAME = "name";
	public static final String STOCK_QUANTITY = "stockQuantity";
	public static final String ID = "id";
	public static final String CATEGORIES = "categories";

}

