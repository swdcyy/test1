package fy2.c$b;
import z1.k;
import fy2.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import q00.b;
import kotlin.jvm.internal.a;
import xp5.g;
import i91.l;
import lp3.c;
import lp3.e;
import i91.a;
import com.kuaishou.live.core.voiceparty.a;

public final class c$b implements k	// class@002a10
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public Object get(){
       b uob = PatchProxy.apply(null, this, c$b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          c s = this.b.s;
          if (s == null) {
             a.S("liveInfoManager");
          }
          if (s.e()) {
             s = this.b.p;
             if (s == null) {
                a.S("serviceManager");
             }
             s = s.a(l.class);
             a.o(s, "serviceManager.getServic¡­lientService::class.java\)");
             a uoa = s.fm();
             a.o(uoa, "serviceManager.getServic¡­e::class.java\).pushClient");
             uob = uoa.u();
          }else {
             s = this.b.u;
             if (s == null) {
                a.S("aryaProvider");
             }
             uob = s.k();
          }
       }
       return uob;
    }
}
