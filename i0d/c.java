package i0d.c;
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
import com.kwai.robust.PatchProxy;
import java.lang.reflect.Field;
import java.lang.NoSuchFieldException;
import java.lang.Throwable;
import java.lang.RuntimeException;
import com.kwai.robust.PatchProxyResult;

public class c	// class@001783
{
    public static final Map a;

    static {
       HashMap hashMap = new HashMap();
       c.a = hashMap;
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
    public void c(){
       super();
    }
    public static void a(Object p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "3")) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "4")) {
          Class class = p0.getClass();
          Field uField = null;
          while (true) {
             if (uField == null) {
                try{
                   uField = class.getDeclaredField(p1);
                }catch(java.lang.NoSuchFieldException e0){
                   class = e0.getSuperclass();
                }
             }else {
                uField.setAccessible(true);
                uField.set(p0, p2);
                break ;
             }
          }
       }
       return;
    }
    public static void b(Class p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "5")) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "6")) {
          Field uField = null;
          while (true) {
             if (uField == null) {
                try{
                   uField = p0.getDeclaredField(p1);
                }catch(java.lang.NoSuchFieldException e0){
                   p0 = p0.getSuperclass();
                }
             }else {
                uField.setAccessible(true);
                uField.set(null, p2);
                break ;
             }
          }
       }
       return;
    }
    public static RuntimeException c(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof RuntimeException) {
          return p0;
       }
       return new RuntimeException(p0);
    }
}
