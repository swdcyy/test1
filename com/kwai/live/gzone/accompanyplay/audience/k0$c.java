package com.kwai.live.gzone.accompanyplay.audience.k0$c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.live.gzone.accompanyplay.audience.k0;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import crd.b;
import lnc.b9;

public class k0$c implements PopupInterface$h	// class@000b8b
{
    public final k0 b;

    public void k0$c(k0 p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(k0$c.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, k0$c.class, "1")) {
          return;
       }
       b9.a(this.b.v);
       p0.y = null;
       return;
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
