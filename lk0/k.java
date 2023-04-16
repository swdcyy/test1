package lk0.k;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.krn.experiment.ExpConfigKt;
import java.util.List;
import qrd.p;
import java.util.Iterator;
import fk0.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import java.util.Map;

public class k	// class@002f8d
{

    public void k(){
       super();
    }
    public static boolean a(String p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       c obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, k.class, "2");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       obj1 = PatchProxy.apply(obj, obj, ExpConfigKt.class, "72");
       if (obj1 != patchProxyRe) {
       }else {
          Object obj2 = ExpConfigKt.l0.getValue();
       }
       if (obj1.isEmpty()) {
          return false;
       }else {
          Iterator iterator = obj1.iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return false;
             }
             obj1 = iterator.next();
             if (p0.equals(obj1.bundleId)) {
                if (TextUtils.x(p1)) {
                   break ;
                }else if(!q.f(obj1.components)){
                   Iterator iterator1 = obj1.components.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         if (p1.equals(iterator1.next().get("name"))) {
                            return true;
                         }
                      }else {
                         continue ;
                      }
                   }
                }
             }
          }
          return true;
       }
    }
}
