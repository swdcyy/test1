package com.kuaishou.live.audience.component.follow.card.f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.live.audience.component.follow.card.d;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Long;
import java.util.concurrent.TimeUnit;
import brd.t;
import qy0.e;
import qy0.f;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Integer;
import lnc.b9;
import o07.o;

public class f implements PopupInterface$h	// class@000acf
{
    public final long b;
    public final d c;

    public void f(d p0,long p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       f tc = this.c;
       f tb = this.b;
       Objects.requireNonNull(tc);
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Long.valueOf(tb), tc, uod, "9")) {
          b uob = t.timer(tb, TimeUnit.MILLISECONDS).subscribe(new e(tc), new f(tc));
          tc.v = uob;
          tc.X7(uob);
       }
       this.c.V8();
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, f.class, "2")) {
          return;
       }
       b9.a(this.c.v);
       p0.r = null;
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
