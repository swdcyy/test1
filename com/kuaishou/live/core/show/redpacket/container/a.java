package com.kuaishou.live.core.show.redpacket.container.a;
import vq5.b;
import com.kuaishou.live.core.show.redpacket.container.b;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import yb7.o;
import d61.v;
import java.lang.Long;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.t;
import rg2.a;
import erd.g;

public final class a implements b	// class@000e6c
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       boolean b;
       a ta = this.a;
       Objects.requireNonNull(ta);
       b uob = b.class;
       if (p0 == null) {
          b.Z(LiveLogTag.RED_PACKET, "auto open red packet router is null");
       }else {
          LiveLogTag rED_PACKET = LiveLogTag.RED_PACKET;
          b.e0(rED_PACKET, "received auto open red packet router", "uri", p0.toString(), "local red packet type", Integer.valueOf(ta.e), "local activity red packet sub type", Integer.valueOf(ta.f));
          String obj = PatchProxy.applyOneRefs(p0, ta, uob, "5");
          b = (obj != PatchProxyResult.class)? obj.booleanValue(): "1".equals(p0.getQueryParameter("shouldignoretype"));
          if (b) {
             ta.c = true;
          }else {
             obj = p0.getQueryParameter("leeetype");
             if (o.c(obj)) {
                b.Z(rED_PACKET, "can not start auto open red packet dialog router, case red packet type is empty");
             }else {
                ta.e = v.e(obj, 0);
                ta.f = v.e(p0.getQueryParameter("leeesubtype"), -1);
             }
          }
          ta.d = p0.getQueryParameter("opensource");
          if (!PatchProxy.applyVoid(null, ta, uob, "1")) {
             b.c0(rED_PACKET, "start expire timer", "timeout", Long.valueOf(ta.g));
             b9.a(ta.h);
             ta.h = t.timer(ta.g, TimeUnit.MILLISECONDS, d.a).subscribe(new a(ta));
          }
       }
       return;
    }
}
