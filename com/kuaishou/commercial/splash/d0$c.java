package com.kuaishou.commercial.splash.d0$c;
import com.kwai.framework.player.multisource.e;
import com.kuaishou.commercial.splash.d0;
import java.lang.Object;
import oc6.a;
import com.kwai.framework.player.multisource.PlaySourceSwitcher$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.lang.StringBuilder;
import yx.j0;
import wkd.b;
import tjc.c;
import im8.f;
import yy.x0;
import com.kuaishou.commercial.splash.i;
import oc6.b;

public class d0$c implements e	// class@0015a8
{
    public final d0 a;

    public void d0$c(d0 p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       a.a(this, p0);
    }
    public void b(PlaySourceSwitcher$a p0){
    }
    public void c(int p0){
       d0$c uoc = d0$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       d0$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, d0.class, "9")) {
          Object[] objArray = new Object[0];
          j0.f("SplashTopPlayControlPresenter", "onPlayFailed mDisplayFinished:"+ta.S, objArray);
          if (ta.S == null) {
             if (b.a(-1608526086).S()) {
                ta.Z8();
                ta.S8();
             }
             x0 ox0 = ta.t.get();
             if (ox0 != null) {
                ox0.f(i.s);
             }
          }
       }
       return;
    }
    public void d(b p0){
       a.c(this, p0);
    }
}
