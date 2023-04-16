package m41.a;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;
import m41.a$b;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.jsbridge.LiveJsSubscribeParams$Params;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import v51.a;
import lp3.c;
import hf3.a;
import lf3.d;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import java.lang.Number;

public final class a extends AbstractLiveJsChannel	// class@00311d
{
    public final d h;
    public boolean i;
    public final HashMap j;

    public void a(){
       super();
       this.h = new a$b(this);
       this.j = new HashMap();
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.o();
       this.j.clear();
       return;
    }
    public void m(String p0,LiveJsSubscribeParams$Params p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "1")) {
          return;
       }
       a.p(p0, "subscribeId");
       if (p1 != null) {
          p1 = p1.messageType;
          if (p1 != null) {
             int i = p1.intValue();
             if (!PatchProxy.applyVoid(null, this, uoa, "3") && this.i == null) {
                this.i = true;
                this.i(a.class).u().c(this.h);
             }
             if (!this.j.containsKey(Integer.valueOf(i))) {
                this.j.put(Integer.valueOf(i), new HashSet());
             }
             HashSet hashSet = this.j.get(Integer.valueOf(i));
             if (hashSet != null) {
                hashSet.add(p0);
             }
          }
       }
       return;
    }
    public void n(String p0){
       Object obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "subscribeId");
       Set set = this.j.entrySet();
       a.o(set, "subscribersForMessageType.entries");
       Iterator iterator = set.iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj = iterator.next();
             if (!obj.getValue().contains(p0)) {
                continue ;
             }
          }else {
             obj = null;
          }
          if (obj != null) {
             a.o(obj, "subscribersForMessageTyp\x20\x02\(subscribeId\) } ?: return\x00");
             obj.getValue().remove(p0);
             if (!obj.getValue().size()) {
                p0 = obj.getKey();
                a.o(p0, "entry.key");
                this.j.remove(Integer.valueOf(p0.intValue()));
             }
             if (!this.j.size()) {
                this.o();
                break ;
             }
          }
          break ;
       }
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       if (this.i == null) {
          return;
       }
       this.i = false;
       this.i(a.class).u().g(this.h);
       return;
    }
}
