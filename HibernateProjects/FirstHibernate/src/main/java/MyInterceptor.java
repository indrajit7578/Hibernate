import java.io.Serializable;
import java.util.Iterator;

import org.hibernate.CallbackException;
import org.hibernate.EmptyInterceptor;
import org.hibernate.EntityMode;
import org.hibernate.Interceptor;
import org.hibernate.Transaction;
import org.hibernate.type.Type;

public class MyInterceptor implements Interceptor {

	public void afterTransactionBegin(Transaction arg0) {
		// TODO Auto-generated method stub
		System.out.println("After Transaction BEgin");
		
	}

	public void afterTransactionCompletion(Transaction arg0) {
		// TODO Auto-generated method stub
		System.out.println("After Transaction Complete");
		
	}

	public void beforeTransactionCompletion(Transaction arg0) {
		// TODO Auto-generated method stub
		System.out.println("Before Transaction Complete");
		
	}

	public int[] findDirty(Object arg0, Serializable arg1, Object[] arg2, Object[] arg3, String[] arg4, Type[] arg5) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getEntity(String arg0, Serializable arg1) throws CallbackException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEntityName(Object arg0) throws CallbackException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object instantiate(String arg0, EntityMode arg1, Serializable arg2) throws CallbackException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean isTransient(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void onCollectionRecreate(Object arg0, Serializable arg1) throws CallbackException {
		// TODO Auto-generated method stub
		
	}

	public void onCollectionRemove(Object arg0, Serializable arg1) throws CallbackException {
		// TODO Auto-generated method stub
		
	}

	public void onCollectionUpdate(Object arg0, Serializable arg1) throws CallbackException {
		// TODO Auto-generated method stub
		
	}

	public void onDelete(Object arg0, Serializable arg1, Object[] arg2, String[] arg3, Type[] arg4)
			throws CallbackException {
		// TODO Auto-generated method stub
		
	}

	public boolean onFlushDirty(Object arg0, Serializable arg1, Object[] arg2, Object[] arg3, String[] arg4,
			Type[] arg5) throws CallbackException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean onLoad(Object arg0, Serializable arg1, Object[] arg2, String[] arg3, Type[] arg4)
			throws CallbackException {
		// TODO Auto-generated method stub
		System.out.println("Obect Loaded");
		return false;
	}

	public String onPrepareStatement(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean onSave(Object arg0, Serializable arg1, Object[] arg2, String[] arg3, Type[] arg4)
			throws CallbackException {
		// TODO Auto-generated method stub
		return false;
	}

	public void postFlush(Iterator arg0) throws CallbackException {
		// TODO Auto-generated method stub
		
	}

	public void preFlush(Iterator arg0) throws CallbackException {
		// TODO Auto-generated method stub
		
	}

}
