package bm1.c;
import wj1.e;
import bm1.b;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import w51.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.l;
import com.kuaishou.live.common.core.component.gift.n;
import xz6.b;
import android.widget.ListView;
import java.util.BitSet;

public class c extends e	// class@0003c8
{
    public final b h;

    public void c(b p0){
       this.h = p0;
       super();
    }
    public void f(List p0,List p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "3")) {
          return;
       }
       c th = this.h;
       Objects.requireNonNull(th);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, th, b.class, "23")) {
          b obj = PatchProxy.apply(null, null, a.class, "8");
          b = (obj != PatchProxyResult.class)? obj.booleanValue(): l.c("enable_test_gift", 0);
          if (b) {
             obj = th.e;
             Objects.requireNonNull(obj);
             if (!PatchProxy.applyVoidTwoRefs(p0, p1, obj, n.class, "2")) {
                obj.f = p1;
                obj.e(p0);
             }
             th.d.setVisibility(0);
          }else {
             th.d.setVisibility(8);
          }
       }
       return;
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.h.g;
    }
    public boolean j(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, c.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.h;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, b.class, "22");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(!obj.f.cardinality()){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
