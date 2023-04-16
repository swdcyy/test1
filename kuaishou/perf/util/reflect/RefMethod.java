package kuaishou.perf.util.reflect.RefMethod;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import kuaishou.perf.util.reflect.MethodParams;
import java.lang.annotation.Annotation;
import java.lang.ClassLoader;
import java.lang.String;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.reflect.Method;
import kuaishou.perf.util.reflect.MethodReflectParams;
import kuaishou.perf.util.reflect.RefStaticMethod;
import java.lang.ClassNotFoundException;
import java.lang.NoSuchMethodException;
import java.lang.reflect.InvocationTargetException;

public class RefMethod	// class@001d0f
{
    public Method mMethod;

    public void RefMethod(Class p0,Field p1){
       object oobject;
       Method declaredMeth;
       super();
       int i = 0;
       if (p1.isAnnotationPresent(MethodParams.class)) {
          Class[] uClassArray = p1.getAnnotation(MethodParams.class).value();
          while (i < uClassArray.length) {
             oobject = uClassArray[i];
             if (oobject.getClassLoader() == this.getClass().getClassLoader()) {
                Class.forName(oobject.getName());
                uClassArray[i] = oobject.getField("TYPE").get(null);
             }
             i = i + 1;
          }
          declaredMeth = p0.getDeclaredMethod(p1.getName(), uClassArray);
          this.mMethod = declaredMeth;
          declaredMeth.setAccessible(true);
       }else if(p1.isAnnotationPresent(MethodReflectParams.class)){
          String[] stringArray = p1.getAnnotation(MethodReflectParams.class).value();
          Class[] uClassArray1 = new Class[stringArray.length];
          for (; i < stringArray.length; i = i + 1) {
             Class protoType = RefStaticMethod.getProtoType(stringArray[i]);
             if (protoType == null) {
                try{
                   protoType = Class.forName(stringArray[i]);
                }catch(java.lang.ClassNotFoundException e5){
                   e5.printStackTrace();
                }
             }
             uClassArray1[i] = protoType;
          }
          declaredMeth = p0.getDeclaredMethod(p1.getName(), uClassArray1);
          this.mMethod = declaredMeth;
          declaredMeth.setAccessible(true);
       }else {
          Method[] declaredMeth1 = p0.getDeclaredMethods();
          int len = declaredMeth1.length;
          while (i < len) {
             oobject = declaredMeth1[i];
             if ((oobject.getName()).equals(p1.getName())) {
                this.mMethod = oobject;
                oobject.setAccessible(true);
                break ;
             }
             i = i + 1;
          }
       }
       if (this.mMethod != null) {
          return;
       }else {
          throw new NoSuchMethodException(p1.getName());
       }
    }
    public Object call(Object p0,Object[] p1){
       try{
          return this.mMethod.invoke(p0, p1);
       }catch(java.lang.reflect.InvocationTargetException e2){
          if (e2.getCause() == null) {
             e2.printStackTrace();
          }
          return null;
       }
    }
    public Object callWithException(Object p0,Object[] p1){
       try{
          return this.mMethod.invoke(p0, p1);
       }catch(java.lang.reflect.InvocationTargetException e2){
          if (e2.getCause() != null) {
             throw e2.getCause();
          }
          throw e2;
       }
    }
    public Class[] paramList(){
       return this.mMethod.getParameterTypes();
    }
}
