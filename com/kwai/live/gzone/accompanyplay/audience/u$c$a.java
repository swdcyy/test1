package com.kwai.live.gzone.accompanyplay.audience.u$c$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.live.gzone.accompanyplay.audience.u$c;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.live.gzone.accompanyplay.audience.u;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;

public class u$c$a implements PopupInterface$h	// class@000bb7
{
    public final u$c b;

    public void u$c$a(u$c p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(u$c$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, u$c$a.class, "1")) {
          return;
       }
       this.b.a.t.i();
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
