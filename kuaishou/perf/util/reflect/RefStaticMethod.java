package kuaishou.perf.util.reflect.RefStaticMethod;
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
import java.lang.ClassNotFoundException;
import java.lang.Exception;
import java.lang.NoSuchMethodException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Short;
import java.lang.Character;
import java.lang.Float;
import java.lang.Double;
import java.lang.Void;
import java.lang.reflect.InvocationTargetException;

public class RefStaticMethod	// class@001d12
{
    public Method mMethod;

    public void RefStaticMethod(Class p0,Field p1){
       object oobject;
       Class uClass;
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
          Method declaredMeth = p0.getDeclaredMethod(p1.getName(), uClassArray);
          this.mMethod = declaredMeth;
          declaredMeth.setAccessible(true);
       }else if(p1.isAnnotationPresent(MethodReflectParams.class)){
          String[] stringArray = p1.getAnnotation(MethodReflectParams.class).value();
          Class[] uClassArray1 = new Class[stringArray.length];
          Class[] uClassArray2 = new Class[stringArray.length];
          String str = null;
          while (i < stringArray.length) {
             Class protoType = RefStaticMethod.getProtoType(stringArray[i]);
             if (protoType == null) {
                try{
                   protoType = Class.forName(stringArray[i]);
                }catch(java.lang.ClassNotFoundException e7){
                   e7.printStackTrace();
                }
             }
             i = i + 1;
          }
          try{
             this.mMethod = p0.getDeclaredMethod(p1.getName(), uClassArray1);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
             if (str) {
                this.mMethod = p0.getDeclaredMethod(p1.getName(), uClassArray2);
             }
          }
          this.mMethod.setAccessible(true);
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
    public static Class getProtoType(String p0){
       if (p0.equals("int")) {
          return Integer.TYPE;
       }
       if (p0.equals("long")) {
          return Long.TYPE;
       }
       if (p0.equals("boolean")) {
          return Boolean.TYPE;
       }
       if (p0.equals("byte")) {
          return Byte.TYPE;
       }
       if (p0.equals("short")) {
          return Short.TYPE;
       }
       if (p0.equals("char")) {
          return Character.TYPE;
       }
       if (p0.equals("float")) {
          return Float.TYPE;
       }
       if (p0.equals("double")) {
          return Double.TYPE;
       }
       if (p0.equals("void")) {
          return Void.TYPE;
       }
       return null;
    }
    public Object call(Object[] p0){
       Object obj = null;
       try{
          obj = this.mMethod.invoke(obj, p0);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return obj;
    }
    public Object callWithException(Object[] p0){
       try{
          return this.mMethod.invoke(null, p0);
       }catch(java.lang.reflect.InvocationTargetException e3){
          if (e3.getCause() != null) {
             throw e3.getCause();
          }
          throw e3;
       }
    }
}
