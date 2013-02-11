package javafiles;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaBeanStuff {

	public JavaBeanStuff() {
		// TODO Auto-generated constructor stub
	}

	
	public static void showProperties(Object bean) {  
	    BeanInfo info = null;
		try {
			info = Introspector.getBeanInfo(bean.getClass(), Object.class);
		} catch (IntrospectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	    PropertyDescriptor[] props = info.getPropertyDescriptors();  
	    for (PropertyDescriptor pd : props) {  
	        String name = pd.getName();  
	        Method getter = pd.getReadMethod();  
	        Class<?> type = pd.getPropertyType();  
	  
	        Object value = null;
			try {
				value = getter.invoke(bean);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	  
	        System.out.println(name + " = " + value + "; type = " + type + "; "+ "getter = " + getter);  
	    }  
	}  
	
}
