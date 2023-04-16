package azb.k;
import erd.g;
import r26.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import elb.d0;
import com.yxcorp.gifshow.util.rx.RxBus;
import w16.k;
import java.lang.Integer;
import nsd.u;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;

public final class k implements g	// class@000376
{
    public final a b;
    public final String c;

    public void k(a p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          d0.b(this.b);
          k ok = new k(this.c, null, null, true, 6, null);
          RxBus.f.b(v8);
          Object[] objArray = new Object[0];
          p3.D().w("GrowthUploadEnaActionRepo", "doUploadEndAction failed "+p0.getMessage(), objArray);
       }
       return;
    }
}
