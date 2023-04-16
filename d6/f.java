package d6.f;
import java.util.ArrayList;
import d6.l;
import java.lang.Object;
import d6.d;
import java.util.List;
import d6.c;
import d6.h;
import d6.b;
import d6.a;
import d6.g;
import java.lang.String;
import java.lang.Class;
import f6.a;
import org.json.alipay.b;
import java.util.Collection;
import org.json.alipay.a;
import java.util.Map;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.Iterator;
import d6.j;

public final class f	// class@001e14
{
    public static List a;

    static {
       ArrayList uArrayList = new ArrayList();
       f.a = uArrayList;
       uArrayList.add(new l());
       f.a.add(new d());
       f.a.add(new c());
       f.a.add(new h());
       f.a.add(new b());
       f.a.add(new a());
       f.a.add(new g());
    }
    public static String a(Object p0){
       if (p0 == null) {
          return null;
       }
       p0 = f.b(p0);
       if (a.b(p0.getClass())) {
          return b.c(p0.toString());
       }
       if (Collection.class.isAssignableFrom(p0.getClass())) {
          return new a(p0).toString();
       }
       if (Map.class.isAssignableFrom(p0.getClass())) {
          return new b(p0).toString();
       }
       throw new IllegalArgumentException("Unsupported Class : "+p0.getClass());
    }
    public static Object b(Object p0){
       Object obj;
       if (p0 == null) {
          return null;
       }
       Iterator iterator = f.a.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             throw new IllegalArgumentException("Unsupported Class : "+p0.getClass());
          }
          j oj = iterator.next();
          if (oj.a(p0.getClass())) {
             obj = oj.a(p0);
             if (obj != null) {
                break ;
             }
          }
       }
       return obj;
    }
}
