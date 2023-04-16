package d6.g;
import d6.i;
import d6.j;
import java.lang.Object;
import java.util.TreeMap;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.String;
import d6.f;
import java.lang.reflect.Type;
import org.json.alipay.b;
import d6.e;

public final class g implements i, j	// class@001e15
{

    public void g(){
       super();
    }
    public final Object a(Object p0){
       Object obj;
       TreeMap treeMap = new TreeMap();
       Class class = p0.getClass();
       Field[] declaredFiel = class.getDeclaredFields();
       while (!class.equals(Object.class)) {
          if (declaredFiel != null && declaredFiel.length > 0) {
             int len = declaredFiel.length;
             int i = 0;
             while (i < len) {
                object oobject = declaredFiel[i];
                if (oobject != null && !("this$0").equals(oobject.getName())) {
                   boolean b = oobject.isAccessible();
                   oobject.setAccessible(true);
                   Object obj1 = oobject.get(p0);
                   if (obj1 != null) {
                      oobject.setAccessible(b);
                      obj = f.b(obj1);
                   label_0047 :
                      if (obj != null) {
                         treeMap.put(oobject.getName(), obj);
                      }
                      i = i + 1;
                   }
                }
                obj = null;
                goto label_0047 ;
             }
          }
          class = class.getSuperclass();
       }
       return treeMap;
    }
    public final Object a(Object p0,Type p1){
       if (!p0.getClass().equals(b.class)) {
          return null;
       }
       Object obj = p1.newInstance();
       while (!p1.equals(Object.class)) {
          Field[] declaredFiel = p1.getDeclaredFields();
          if (declaredFiel != null && declaredFiel.length > 0) {
             int len = declaredFiel.length;
             int i = 0;
             while (i < len) {
                object oobject = declaredFiel[i];
                String name = oobject.getName();
                Type genericType = oobject.getGenericType();
                if (p0.b(name)) {
                   oobject.setAccessible(true);
                   oobject.set(obj, e.a(p0.a(name), genericType));
                }
                i = i + 1;
             }
          }
          Class superclass = p1.getSuperclass();
       }
       return obj;
    }
    public final boolean a(Class p0){
       return true;
    }
}
