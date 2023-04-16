package kuaishou.perf.util.reflect.RefConstructor;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import kuaishou.perf.util.reflect.MethodParams;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import kuaishou.perf.util.reflect.MethodReflectParams;
import java.lang.String;
import java.lang.Exception;

public class RefConstructor	// class@001d09
{
    public Constructor mCtor;

    public void RefConstructor(Class p0,Field p1){
       super();
       if (p1.isAnnotationPresent(MethodParams.class)) {
          this.mCtor = p0.getDeclaredConstructor(p1.getAnnotation(MethodParams.class).value());
       }else {
          int i = 0;
          if (p1.isAnnotationPresent(MethodReflectParams.class)) {
             String[] stringArray = p1.getAnnotation(MethodReflectParams.class).value();
             Class[] uClassArray = new Class[stringArray.length];
             while (i < stringArray.length) {
                try{
                   uClassArray[i] = Class.forName(stringArray[i]);
                   i = i + 1;
                }catch(java.lang.Exception e2){
                   e2.printStackTrace();
                   goto label_0036 ;
                }
             }
             this.mCtor = p0.getDeclaredConstructor(uClassArray);
          }else {
             Class[] uClassArray1 = new Class[i];
             this.mCtor = p0.getDeclaredConstructor(uClassArray1);
          }
       }
       RefConstructor tmCtor = this.mCtor;
       if (tmCtor != null && !tmCtor.isAccessible()) {
          this.mCtor.setAccessible(true);
       }
       return;
    }
    public Object newInstance(){
       try{
          Object[] objArray = new Object[0];
          return this.mCtor.newInstance(objArray);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public Object newInstance(Object[] p0){
       try{
          return this.mCtor.newInstance(p0);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
}
