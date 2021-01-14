/*
 * Created on 2021-01-14 ( Date ISO 2021-01-14 - Time 12:43:55 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.1.2
 */

package org.demo.persistence.impl.fake.commons;

import java.util.Hashtable;
import java.util.Map;

public class Sequence {

	private final static Map<Class<?>, Long> values = new Hashtable<Class<?>,Long>() ;
	
	protected final static long getNextValue(Class<?> clazz) {
		Long value = values.get(clazz) ;
		if ( value == null ) {
			value = 1L;
		}
		else {
			value++ ;
		}
		values.put(clazz,value);
		return value ;
	}

	protected final static long getCurrentValue(Class<?> clazz) {
		Long value = values.get(clazz) ;
		if ( value == null ) {
			return 0 ;
		}
		else {
			return value ;
		}
	}

}
