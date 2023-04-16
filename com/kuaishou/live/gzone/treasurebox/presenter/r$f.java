package com.kuaishou.live.gzone.treasurebox.presenter.r$f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.live.gzone.treasurebox.presenter.r;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r53.a;
import r53.b;
import java.lang.Integer;
import o07.o;

public class r$f implements PopupInterface$h	// class@001c97
{
    public final r b;

    public void r$f(r p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$f.class, "2")) {
          return;
       }
       a f = this.b.v.f;
       if (f != null) {
          f.u();
       }
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(r$f.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, r$f.class, "1")) {
          return;
       }
       a f = this.b.v.f;
       if (f != null) {
          f.h();
       }
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
