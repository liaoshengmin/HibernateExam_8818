package com.hand;

import java.io.Serializable;
import java.util.Iterator;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import com.model.Staff;

public class MyInterceptor extends EmptyInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private int updates;
	// private int creates;
	// private int loads;

	public void onDelete(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {

		// System.out.println("Interceptor onDelete......");
	}

	// This method is called when Employee object gets updated.
	public boolean onFlushDirty(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {

		if (entity instanceof Staff) {
			// System.out.println("Interceptor onFlushDirty, Update
			// Operation......");
			return true;
		} else
			return false;
	}

	// This method is called when Employee object gets created.
	public boolean onLoad(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {

		System.out.println("Before save......");
		return true;
	}

	// called before commit into database
	public void preFlush(Iterator iterator) {
		// System.out.println("Interceptor preFulsh......");
	}

	// called after committed into database
	public void postFlush(Iterator iterator) {
		// System.out.println("Interceptor postFlush......");
	}

}
