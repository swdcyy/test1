package com.kwai.live.gzone.guess.kshell.x$c;
import xq5.c;
import com.kwai.live.gzone.guess.kshell.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import fq5.b;
import crd.b;
import lnc.b9;
import android.os.CountDownTimer;
import java.util.List;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class x$c implements c	// class@000d7e
{
    public final x b;

    public void x$c(x p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, x$c.class, "1")) {
          return;
       }
       x$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, x.class, "18")) {
          tb.W = false;
          tb.X = null;
          tb.P8();
          tb.c9(tb.G.getLiveStreamId(), 2);
          b9.a(tb.U);
          b9.a(tb.V);
          x v0 = tb.V0;
          if (v0 != null) {
             v0.cancel();
             tb.V0 = null;
             tb.W0 = 0;
          }
          tb.X0.clear();
       }
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       b.b(this);
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
