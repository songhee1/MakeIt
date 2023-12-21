package jpabook.jpashop.domain.Item;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Movie.class)
public abstract class Movie_ extends jpabook.jpashop.domain.Item.Item_ {

	public static volatile SingularAttribute<Movie, String> actor;
	public static volatile SingularAttribute<Movie, String> director;

	public static final String ACTOR = "actor";
	public static final String DIRECTOR = "director";

}

