package ca7.k;
import java.util.HashMap;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Map;
import java.lang.Byte;
import java.lang.Character;
import java.lang.Short;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Long;
import java.lang.Double;
import java.lang.String;
import java.lang.Class;
import java.lang.Throwable;
import ca7.k$a;
import java.lang.reflect.Method;
import java.util.Objects;
import java.lang.NoSuchMethodException;
import c97.d;
import java.lang.RuntimeException;

public final class k	// class@00051e
{
    public static boolean a;
    public static final Map b;

    static {
       HashMap hashMap = new HashMap();
       k.b = hashMap;
       Class tYPE = Boolean.TYPE;
       hashMap.put(Boolean.class, tYPE);
       hashMap.put(Byte.class, Byte.TYPE);
       hashMap.put(Character.class, Character.TYPE);
       hashMap.put(Short.class, Short.TYPE);
       Class tYPE1 = Integer.TYPE;
       hashMap.put(Integer.class, tYPE1);
       Class tYPE2 = Float.TYPE;
       hashMap.put(Float.class, tYPE2);
       Class tYPE3 = Long.TYPE;
       hashMap.put(Long.class, tYPE3);
       hashMap.put(Double.class, Double.TYPE);
       hashMap.put(tYPE, tYPE);
       hashMap.put(Byte.TYPE, Byte.TYPE);
       hashMap.put(Character.TYPE, Character.TYPE);
       hashMap.put(Short.TYPE, Short.TYPE);
       hashMap.put(tYPE1, tYPE1);
       hashMap.put(tYPE2, tYPE2);
       hashMap.put(tYPE3, tYPE3);
       hashMap.put(Double.TYPE, Double.TYPE);
    }
    public static Object a(String p0,String p1,Object[] p2){
       return k.b(Class.forName(p0), p1, p2);
    }
    public static Object b(Class p0,String p1,Object[] p2){
       Class[] uClassArray;
       Object[] objArray;
       int i = 0;
       if (p2 != null && p2.length > 0) {
          uClassArray = new Class[p2.length];
          int i1 = 0;
          while (i1 < p2.length) {
             object oobject = p2[i1];
             if (oobject != null && oobject instanceof k$a) {
                uClassArray[i1] = oobject.a;
             }else if(oobject == null){
                oobject = null;
             }else {
                Class class = oobject.getClass();
             }
             uClassArray[i1] = oobject;
             i1 = i1 + 1;
          }
       }else {
          uClassArray = null;
       }
       Method method = k.c(p0, p1, uClassArray);
       if (p2 != null && p2.length > 0) {
          objArray = new Object[p2.length];
          while (i < p2.length) {
             object oobject1 = p2[i];
             objArray[i] = (oobject1 != null && oobject1 instanceof k$a)? oobject1.b: oobject1;
             i = i + 1;
          }
       }else {
          objArray = null;
       }
       return method.invoke(null, objArray);
    }
    public static Method c(Class p0,String p1,Class[] p2){
       object oobject;
       String str;
       Method[] declaredMeth = p0.getDeclaredMethods();
       Objects.requireNonNull(p1, "Method name must not be null.");
       int len = declaredMeth.length;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = declaredMeth[i];
             if ((oobject.getName()).equals(p1)) {
                Class[] parameterTyp = oobject.getParameterTypes();
                if (parameterTyp == null) {
                   if (p2 == null || !p2.length) {
                   label_0063 :
                      str = 1;
                   }
                }else if(p2 == null){
                   if (!parameterTyp.length) {
                      goto label_0063 ;
                   }
                }else if(parameterTyp.length != p2.length){
                   int i1 = 0;
                   while (true) {
                      if (i1 < parameterTyp.length) {
                         if (!parameterTyp[i1].isAssignableFrom(p2[i1])) {
                            Map b = k.b;
                            if (b.containsKey(parameterTyp[i1]) && b.get(parameterTyp[i1]).equals(b.get(p2[i1]))) {
                            }
                         }else {
                         }
                      }else {
                         goto label_0063 ;
                      }
                   }
                   if (str) {
                   label_006b :
                      if (oobject == null) {
                         if (p0.getSuperclass() != null) {
                         }else {
                            throw new NoSuchMethodException();
                         }
                      }else {
                         oobject.setAccessible(true);
                         return oobject;
                      }
                   }
                }
                str = null;
                goto label_0064 ;
             }
             i = i + 1;
          }else {
             oobject = null;
             goto label_006b ;
          }
       }
       return k.c(p0.getSuperclass(), p1, p2);
    }
    public static void d(Throwable p0){
       if (!k.a) {
          d.a().i();
          return;
       }else if(p0 instanceof RuntimeException){
          throw p0;
       }else {
          throw new RuntimeException(p0);
       }
    }
}
