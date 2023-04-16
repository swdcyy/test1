package d6.e;
import java.util.ArrayList;
import d6.l;
import java.lang.Object;
import d6.d;
import java.util.List;
import d6.c;
import d6.h;
import d6.k;
import d6.b;
import d6.a;
import d6.g;
import java.lang.reflect.Type;
import java.util.Iterator;
import d6.i;
import java.lang.Class;
import f6.a;
import java.lang.String;
import org.json.alipay.a;
import org.json.alipay.b;

public final class e	// class@001e13
{
    public static List a;

    static {
       ArrayList uArrayList = new ArrayList();
       e.a = uArrayList;
       uArrayList.add(new l());
       e.a.add(new d());
       e.a.add(new c());
       e.a.add(new h());
       e.a.add(new k());
       e.a.add(new b());
       e.a.add(new a());
       e.a.add(new g());
    }
    public static final Object a(Object p0,Type p1){
       Object obj;
       Iterator iterator = e.a.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          i oi = iterator.next();
          if (oi.a(a.a(p1))) {
             obj = oi.a(p0, p1);
             if (obj != null) {
                break ;
             }
          }
       }
       return obj;
    }
    public static final Object b(String p0,Type p1){
       a uoa;
       if (p0 == null || !p0.length()) {
          return null;
       }
       p0 = p0.trim();
       if (p0.startsWith("[") && p0.endsWith("]")) {
          uoa = new a(p0);
       }else if(p0.startsWith("{") && p0.endsWith("}")){
          uoa = new b(p0);
       }else {
          return e.a(p0, p1);
       }
       return e.a(uoa, p1);
    }
}
