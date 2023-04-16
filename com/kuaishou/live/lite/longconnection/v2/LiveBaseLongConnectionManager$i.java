package com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$i;
import ut7.o;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$StreamStop;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import qrd.l1;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$d;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$e;
import ut7.h;
import ut7.i$b;

public final class LiveBaseLongConnectionManager$i implements o	// class@000a1b
{
    public final LiveBaseLongConnectionManager a;

    public void LiveBaseLongConnectionManager$i(LiveBaseLongConnectionManager p0){
       this.a = p0;
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefsWithListener(p0, p1, this, LiveBaseLongConnectionManager$i.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "context");
          if (this.a.G(p1)) {
             p1 = l1.a;
             LiveBaseLongConnectionManager$d uod = (this.a.y0())? new LiveBaseLongConnectionManager$d(): new LiveBaseLongConnectionManager$e();
             p0 = new i$a(p1, uod);
          }else {
             p0 = new i$b();
          }
          uoa = p0;
          PatchProxy.onMethodExit(LiveBaseLongConnectionManager$i.class, "1");
       }
       return uoa;
    }
}
