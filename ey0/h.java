package ey0.h;
import erd.g;
import ey0.k;
import z1.a;
import java.lang.Object;
import zq8.a;
import ey0.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import q2b.h$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.framework.location.k;
import android.app.Activity;

public final class h implements g	// class@002220
{
    public final k b;
    public final a c;

    public void h(k p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h tc = this.c;
       k b = tb.b;
       a b1 = p0.b;
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(b, Boolean.valueOf(b1), null, uob, "3")) {
          int i = (b1 != null)? 7: 8;
          h$b uob1 = h$b.e(i, "LIVE_COMMENT_LOCATION_SYS_AUTH_RESULT");
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = b;
          uob1.h(uContentPack);
          u1.r0(uob1);
       }
       b.c0(LiveLogTag.LIVE_AUDIENCE_LOCATION, "requestSystemLocationPermission", "granted", Boolean.valueOf(p0.b));
       if (p0.b != null) {
          if (k.f()) {
             tb.b(tc);
          }else {
             tb.a(tb.a);
          }
       }else {
          tb.e = false;
       }
       return;
    }
}
