package hh1.i$b;
import erd.g;
import hh1.i;
import yg1.a;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.data.giftbox.api.response.LiveVipGradeInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import yg1.f;

public final class i$b implements g	// class@0026c1
{
    public final i b;
    public final a c;
    public final String d;

    public void i$b(i p0,a p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$b.class, "1")) {
       }else {
          this.b.b.set(false);
          i$b tc = this.c;
          i$b td = this.d;
          i$b tb = this.b;
          Objects.requireNonNull(tb);
          f uof = PatchProxy.applyOneRefs(p0, tb, i.class, "3");
          if (uof != PatchProxyResult.class) {
          }else {
             uof = new f(1, "", p0);
          }
          tc.a(td, uof);
       }
       return;
    }
}
