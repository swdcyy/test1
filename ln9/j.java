package ln9.j;
import erd.g;
import ln9.l;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gq.a;
import java.lang.StringBuilder;
import java.lang.System;
import q87.c;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import kn9.i;
import java.lang.Throwable;
import tvc.a;

public final class j implements g	// class@002e26
{
    public final l b;
    public final long c;
    public final boolean d;

    public void j(l p0,long p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().s("PostListComponentMiddleware", "loadMore cost: "+(System.currentTimeMillis() - this.c), objArray);
          KSStore kSStore = this.b.a();
          if (kSStore != null) {
             kSStore.a(new i(p0, null, this.d));
          }
       }
       return;
    }
}
