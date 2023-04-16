package okhttp3.internal.platform.OptionalMethod;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.AssertionError;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.lang.RuntimeException;

public class OptionalMethod	// class@0020d9
{
    public final String methodName;
    public final Class[] methodParams;
    public final Class returnType;

    public void OptionalMethod(Class p0,String p1,Class[] p2){
       super();
       this.returnType = p0;
       this.methodName = p1;
       this.methodParams = p2;
    }
    public static Method getPublicMethod(Class p0,String p1,Class[] p2){
       Method method = null;
       try{
          Method method1 = p0.getMethod(p1, p2);
          try{
             if (method1.getModifiers() & 0x01) {
                method = method1;
             }
          }catch(java.lang.NoSuchMethodException e0){
          }
          return e0;
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
    public final Method getMethod(Class p0){
       OptionalMethod tmethodName = this.methodName;
       Method method = null;
       if (tmethodName != null) {
          Method publicMethod = OptionalMethod.getPublicMethod(p0, tmethodName, this.methodParams);
          if (publicMethod != null) {
             tmethodName = this.returnType;
             if (tmethodName == null || tmethodName.isAssignableFrom(publicMethod.getReturnType())) {
             }
          }else {
          }
       }
    label_001d :
       return method;
    }
    public Object invoke(Object p0,Object[] p1){
       AssertionError uAssertionEr;
       Method method = this.getMethod(p0.getClass());
       if (method != null) {
          return method.invoke(p0, p1);
       }
       throw new AssertionError("Method "+this.methodName+" not supported for object "+p0);
    }
    public Object invokeOptional(Object p0,Object[] p1){
       Method method = this.getMethod(p0.getClass());
       if (method == null) {
          return null;
       }
       try{
          return method.invoke(p0, p1);
       }catch(java.lang.IllegalAccessException e0){
          return v1;
       }
    }
    public Object invokeOptionalWithoutCheckedException(Object p0,Object[] p1){
       try{
          return this.invokeOptional(p0, p1);
       }catch(java.lang.reflect.InvocationTargetException e2){
          p0 = e2.getTargetException();
          if (p0 instanceof RuntimeException) {
             throw p0;
          }
          AssertionError uAssertionEr = new AssertionError("Unexpected exception");
          uAssertionEr.initCause(p0);
          throw uAssertionEr;
       }
    }
    public Object invokeWithoutCheckedException(Object p0,Object[] p1){
       try{
          return this.invoke(p0, p1);
       }catch(java.lang.reflect.InvocationTargetException e2){
          p0 = e2.getTargetException();
          if (p0 instanceof RuntimeException) {
             throw p0;
          }
          AssertionError uAssertionEr = new AssertionError("Unexpected exception");
          uAssertionEr.initCause(p0);
          throw uAssertionEr;
       }
    }
    public boolean isSupported(Object p0){
       boolean b = (this.getMethod(p0.getClass()) != null)? true: false;
       return b;
    }
}
