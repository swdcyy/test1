package com.kwai.chat.kwailink.net.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.NoSuchMethodException;
import java.lang.Exception;
import java.lang.reflect.Field;

public class b	// class@000a67
{

    public void b(){
       super();
    }
    public static Method a(Class p0,String p1,Class[] p2){
       Method obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          for (; Object.class != p0; p0 = p0.getSuperclass()) {
             try{
                obj = p0.getDeclaredMethod(p1, p2);
                if (obj != null) {
                   obj.setAccessible(true);
                   return obj;
                }
             }catch(java.lang.NoSuchMethodException e0){
                e0.printStackTrace();
             }
          }
       }
       return null;
    }
    public static Object b(Object p0,String p1,Class[] p2,Object[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Method method = b.a(p0.getClass(), p1, p2);
       if (method != null) {
          return method.invoke(p0, p3);
       }
       throw new Exception("invoke method fail");
    }
    public static Object c(Class p0,String p1,Class[] p2,Object[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Method method = b.a(p0, p1, p2);
       if (method != null) {
          return method.invoke(null, p3);
       }
       throw new Exception("invoke method fail");
    }
    public static void d(Object p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "4")) {
          return;
       }
       Class class = p0.getClass();
       Object obj = null;
       Field obj1 = PatchProxy.applyTwoRefs(class, p1, obj, b.class, "3");
       if (obj1 != PatchProxyResult.class) {
          obj = obj1;
       }else if(class != Object.class){
          try{
             obj1 = class.getDeclaredField(p1);
             obj1.setAccessible(true);
             obj = obj1;
          }catch(java.lang.Exception e0){
             class = e0.getSuperclass();
             goto label_0024 ;
          }
       }
       if (obj != null) {
          obj.set(p0, p2);
          return;
       }else {
          throw new Exception("setFieldValue fail");
       }
    }
}
