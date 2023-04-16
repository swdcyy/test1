package com.kwai.live.gzone.accompanyplay.edit.g0$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.g0;
import java.lang.Object;
import n37.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.accompanyplay.edit.j0;
import com.kwai.live.gzone.accompanyplay.edit.p0;
import com.kwai.live.gzone.accompanyplay.anchor.m;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import com.kwai.live.gzone.accompanyplay.edit.g0$c;
import com.kwai.live.gzone.accompanyplay.edit.g0$b;

public class g0$a implements g	// class@000bf1
{
    public final g0 b;

    public void g0$a(g0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0$a.class, "1")) {
       }else {
          p0 = this.b.q;
          if (p0 != null && p0.R1()) {
             this.b.q.destroy();
          }
          p0.q = new j0();
          this.b.q.U7(new p0());
          p0 = this.b;
          if (p0.r != null) {
             p0.q.U7(new m());
          }
          p0 = this.b;
          p0.q.f(p0.z());
          p0 = new g0$c();
          g0$a tb = this.b;
          p0.d = tb.p.H;
          p0.b = tb.r;
          p0.c = tb;
          Object[] objArray = new Object[]{p0};
          tb.q.i(objArray);
       }
       return;
    }
}
