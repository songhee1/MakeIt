package jpabook.jpashop.domain.Item;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Album.class)
public abstract class Album_ extends jpabook.jpashop.domain.Item.Item_ {

	public static volatile SingularAttribute<Album, String> artist;
	public static volatile SingularAttribute<Album, String> etc;

	public static final String ARTIST = "artist";
	public static final String ETC = "etc";

}

