package c71.a;
import java.lang.Object;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Integer;
import z61.g;

public class a	// class@000482
{

    public void a(){
       super();
    }
    public static void a(Map p0,Set p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "3")) {
          return;
       }
       g og = null;
       Iterator iterator = p2.iterator();
       while (iterator.hasNext()) {
          Integer integer = iterator.next();
          if (p1.contains(integer)) {
             continue ;
          }else {
             boolean b = true;
             g og1 = p0.get(integer);
             if (og1 == null) {
                continue ;
             }else {
                Iterator iterator1 = og1.b.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      if (p2.contains(iterator1.next())) {
                         b = false;
                      }else {
                         continue ;
                      }
                   }
                   if (b) {
                      og = og1;
                   }
                }
             }
          }
       }
       if (og != null) {
          p1.add(og.a);
          Iterator iterator2 = og.c.iterator();
          while (iterator2.hasNext()) {
             p2.remove(iterator2.next());
          }
          a.a(p0, p1, p2);
       }
       return;
    }
}
