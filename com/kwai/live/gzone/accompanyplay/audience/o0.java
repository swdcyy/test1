package com.kwai.live.gzone.accompanyplay.audience.o0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.live.gzone.accompanyplay.audience.n0;
import com.kwai.live.gzone.accompanyplay.audience.n;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.live.gzone.accompanyplay.audience.n$c;

public class o0 implements PopupInterface$h	// class@000ba0
{
    public final n b;
    public final n0 c;

    public void o0(n0 p0,n p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(o0.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, o0.class, "1")) {
          return;
       }
       this.b.n0(null);
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
