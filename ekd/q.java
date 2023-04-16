package ekd.q;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q$b;
import java.util.Iterator;
import ekd.q$a;
import java.util.Map;
import java.util.Collections;

public class q	// class@001568
{

    public static List a(Object[] p0){
       List list = (p0 != null && p0.length > 0)? Arrays.asList(p0): new ArrayList();
       return list;
    }
    public static ArrayList b(List p0){
       if (p0 == null) {
          return null;
       }
       return new ArrayList(p0);
    }
    public static void c(Collection p0,q$b p1){
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          if (!p1.a(iterator.next())) {
             iterator.remove();
          }
       }
       return;
    }
    public static Object d(List p0,int p1){
       p0 = (p0 != null && p0.size() > p1)? p0.get(p1): null;
       return p0;
    }
    public static Object e(List p0,int p1){
       p0 = (p0 != null && p0.size() > p1)? p0.get(p1): null;
       return p0;
    }
    public static boolean f(Collection p0){
       boolean b = (p0 == null || p0.isEmpty())? true: false;
       return b;
    }
    public static List g(Collection p0,q$a p1){
       if (p0 == null) {
          return null;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = p1.apply(iterator.next());
          if (obj != null) {
             uArrayList.add(obj);
          }
       }
       return uArrayList;
    }
    public static boolean h(Map p0){
       boolean b = (p0 == null || p0.isEmpty())? true: false;
       return b;
    }
    public static List i(List p0){
       if (p0 == null) {
          p0 = Collections.emptyList();
       }
       return p0;
    }
}
