package f4b.i;
import erd.o;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import java.lang.String;
import e4b.a;
import java.lang.Object;
import java.lang.Integer;
import f4b.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.lang.System;
import w3b.q;
import t45.d;
import brd.z;
import f4b.h;
import java.util.concurrent.TimeUnit;

public final class i implements o	// class@00289c
{
    public final MagicBusinessId b;
    public final String c;
    public final String d;
    public final a e;

    public void i(MagicBusinessId p0,String p1,String p2,a p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       i tb = this.b;
       i tc = this.c;
       i td = this.d;
       i te = this.e;
       int i = p0.intValue();
       p0 = k.class;
       if (PatchProxy.isSupport(p0)) {
          Object[] objArray = new Object[]{tb,Integer.valueOf(i),tc,td,te};
          p0 = PatchProxy.apply(objArray, null, p0, "6");
          if (p0 != PatchProxyResult.class) {
          label_0064 :
             return p0;
          }
       }
       p0 = te.p(tb.mId, i, tc, td, "0", "", "", true, q.d).observeOn(d.c).map(new h(tb, System.currentTimeMillis())).timeout(12, TimeUnit.SECONDS);
       goto label_0064 ;
    }
}
