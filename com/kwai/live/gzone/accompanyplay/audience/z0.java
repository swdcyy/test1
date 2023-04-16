package com.kwai.live.gzone.accompanyplay.audience.z0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.live.gzone.accompanyplay.audience.a1;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import o37.a;
import k37.a0;
import lnc.i3;
import o07.o;

public class z0 implements PopupInterface$h	// class@000bcb
{
    public final a1 b;

    public void z0(a1 p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z0.class, "1")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.b.p.a();
       a uoa = this.b.p.t();
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, uoa, null, a0.class, "6")) {
          a0.k("AUTHOR_INFO_PANEL", a0.a(uoa).e(), liveStreamPa, uoa);
       }
       return;
    }
    public void H(c p0,int p1){
       p0.v = null;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
