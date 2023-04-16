package com.kuaishou.live.core.show.redpacket.activity.h$b;
import xq5.c;
import com.kuaishou.live.core.show.redpacket.activity.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.activity.LiveRedPacketActivityManager;
import ekd.k1;
import xq5.b;
import java.util.Objects;
import crd.b;
import lnc.b9;
import crd.a;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class h$b implements c	// class@000e5d
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "2")) {
          return;
       }
       h u = this.b.u;
       if (u != null) {
          u.i();
       }
       k1.n(this.b);
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h$b.class, "1")) {
          return;
       }
       h u = this.b.u;
       if (u != null) {
          Objects.requireNonNull(u);
          if (!PatchProxy.applyVoid(objArray, u, LiveRedPacketActivityManager.class, "2")) {
             b9.a(u.d);
             u.d = new a();
          }
       }
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
