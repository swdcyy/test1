package com.kwai.yoda.api.YodaApi;
import com.kwai.yoda.api.YodaApi$a;
import nsd.u;
import java.lang.Object;
import com.kwai.yoda.api.YodaApi$cookieJar$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.yoda.api.YodaApi$api$2;
import com.kwai.yoda.api.YodaApi$webProxy$2;
import com.kwai.yoda.api.YodaApi$webProxyApi$2;
import qx7.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qx7.a;
import t97.a;

public final class YodaApi	// class@001171
{
    public final Dns a;
    public final a b;
    public g c;
    public boolean d;
    public final p e;
    public c f;
    public final p g;
    public final p h;
    public final p i;
    public static final YodaApi$a j;

    static {
       YodaApi.j = new YodaApi$a(null);
    }
    public void YodaApi(){
       super();
       this.e = s.c(YodaApi$cookieJar$2.INSTANCE);
       this.g = s.c(new YodaApi$api$2(this));
       this.h = s.c(new YodaApi$webProxy$2(this));
       this.i = s.c(new YodaApi$webProxyApi$2(this));
    }
    public final c a(){
       Object obj = PatchProxy.apply(null, this, YodaApi.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final a b(){
       Object obj = PatchProxy.apply(null, this, YodaApi.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final a c(){
       Object obj = PatchProxy.apply(null, this, YodaApi.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
}
