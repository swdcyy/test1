package ah1.a;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentHashMap;
import ah1.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.base.model.Model$b;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;

public class a	// class@000099
{
    public final ConcurrentHashMap a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public void a(String p0,boolean p1,boolean p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = false;
       }
       if (p3 & 0x04) {
          p2 = false;
       }
       a.p(p0, "name");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.a = new ConcurrentHashMap();
       return;
    }
    public final c a(Object p0){
       c obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.get(p0);
       if (obj == null) {
          c uoc = new c(this.b, null, this.c, this.d, 2, null);
          this.a.put(p0, obj);
       }
       return obj;
    }
    public final void b(LifecycleOwner p0,Object p1,Model$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "1")) {
          return;
       }
       a.p(p0, "lifecycleOwner");
       a.p(p1, "key");
       a.p(p2, "observer");
       this.a(p1).b(p0, p2);
       return;
    }
    public final void c(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "4")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "key");
       this.a(p1).e(p0, p2);
       return;
    }
    public final void d(Object p0,Model$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a.p(p0, "key");
       String str = "observer";
       a.p(p1, str);
       p0 = this.a(p0);
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidOneRefs(p1, p0, Model.class, "7")) {
          a.p(p1, str);
          Model$b uob = p0.c.get(p1);
          if (uob != null) {
             p0.d.removeObserver(uob.b);
          }
          p0.c.remove(p1);
       }
       return;
    }
}
