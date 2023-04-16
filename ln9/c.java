package ln9.c;
import erd.g;
import ln9.l;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import tvc.e;
import nn9.d;
import java.util.List;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import gq.a;
import java.lang.StringBuilder;
import java.lang.System;
import q87.c;
import kn9.g;
import java.lang.Throwable;
import tvc.a;

public final class c implements g	// class@002e1f
{
    public final l b;
    public final long c;
    public final boolean d;
    public final boolean e;

    public void c(l p0,long p1,boolean p2,boolean p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          KSStore kSStore = this.b.a();
          if (kSStore != null) {
             d uod = kSStore.b();
             if (uod != null) {
                List list = uod.f();
                if (list != null && CollectionsKt___CollectionsKt.H1(list, this.b.d) == true) {
                   this.b.d = null;
                }
             }
          }
          Object[] objArray = new Object[0];
          a.D().s("PostListComponentMiddleware", "loadDataList cost: "+(System.currentTimeMillis() - this.c), objArray);
          kSStore = this.b.a();
          if (kSStore != null) {
             kSStore.a(new g(p0, null, this.d, this.e));
          }
       }
       return;
    }
}
