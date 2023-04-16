package c48.a;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import b48.a;
import java.util.List;
import java.util.ArrayList;
import org.json.JSONObject;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;
import d48.a;
import c48.c;

public class a	// class@0003b2
{

    public void a(){
       super();
    }
    public void a(int p0,Object p1,Map p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a.class, "1")) {
          return;
       }
       if (p2 == null) {
          return;
       }
       a uoa = this.c(p0);
       if (uoa == null) {
          return;
       }
       String str = uoa.f(p1);
       List list = p2.get(str);
       if (list == null) {
          list = new ArrayList();
          p2.put(str, list);
       }
       list.add(uoa.d(p1));
       return;
    }
    public void b(int p0,Map p1,JSONObject p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a.class, "4")) {
          return;
       }
       if (p1 != null && !p1.isEmpty()) {
          a uoa = this.c(p0);
          if (uoa == null) {
             return;
          }else if(p1.values() != null){
             Iterator iterator = p1.values().iterator();
             while (iterator.hasNext()) {
                List list = iterator.next();
                if (list != null && !list.isEmpty()) {
                   Iterator iterator1 = list.iterator();
                   while (iterator1.hasNext()) {
                      uoa.b(iterator1.next(), p2);
                   }
                }
             }
          }
       }
       return;
    }
    public final a c(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a uoa1 = c.a(p0);
       if (uoa1 == null) {
          return null;
       }else {
          return uoa1.d();
       }
    }
    public void d(int p0,Map p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       if (p1 != null && !p1.isEmpty()) {
          a uoa1 = this.c(p0);
          if (uoa1 == null) {
             return;
          }else if(p1.values() != null){
             Iterator iterator = p1.values().iterator();
             while (iterator.hasNext()) {
                List list = iterator.next();
                if (list != null && !list.isEmpty()) {
                   uoa1.a(list.remove(0));
                   list.clear();
                }
             }
          }
          p1.clear();
       }
       return;
    }
    public void e(int p0,Object p1,Map p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a.class, "2")) {
          return;
       }
       if (p2 == null) {
          return;
       }
       a uoa = this.c(p0);
       if (uoa == null) {
          return;
       }
       p1 = p2.get(uoa.f(p1));
       if (p1 != null && !p1.isEmpty()) {
          p2 = p1.remove(0);
          if (!p1.size()) {
             uoa.a(p2);
          }
       }
       return;
    }
}
