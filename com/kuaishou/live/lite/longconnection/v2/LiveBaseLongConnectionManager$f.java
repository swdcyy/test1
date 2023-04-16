package com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$f;
import ut7.o;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$ConfigUpdated;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import qrd.l1;
import ut7.h;
import ut7.i$b;

public final class LiveBaseLongConnectionManager$f implements o	// class@000a18
{
    public final LiveBaseLongConnectionManager a;

    public void LiveBaseLongConnectionManager$f(LiveBaseLongConnectionManager p0){
       this.a = p0;
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefsWithListener(p0, p1, this, LiveBaseLongConnectionManager$f.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "context");
          p0 = (this.a.w(p1))? new i$a(l1.a, h.b): new i$b();
          uoa = p0;
          PatchProxy.onMethodExit(LiveBaseLongConnectionManager$f.class, "1");
       }
       return uoa;
    }
}
