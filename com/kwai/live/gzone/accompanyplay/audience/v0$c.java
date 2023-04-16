package com.kwai.live.gzone.accompanyplay.audience.v0$c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.live.gzone.accompanyplay.audience.v0;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import wkd.b;
import ad5.a;

public class v0$c implements PopupInterface$h	// class@000bbf
{
    public final v0 b;

    public void v0$c(v0 p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(v0$c.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, v0$c.class, "1")) {
          return;
       }
       b.a(0x4c90014d).f();
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
