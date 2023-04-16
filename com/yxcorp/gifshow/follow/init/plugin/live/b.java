package com.yxcorp.gifshow.follow.init.plugin.live.b;
import com.kwai.component.feedstaggercard.widget.SimpleDanmakuView$d;
import com.yxcorp.gifshow.follow.init.plugin.live.d;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.follow.init.plugin.live.d$b;
import crd.b;
import lnc.b9;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import brd.t;
import oha.q;
import erd.o;
import t45.d;
import brd.z;
import oha.l;
import com.gifshow.tuna.player.poi.e;
import erd.g;

public final class b implements SimpleDanmakuView$d	// class@0010e4
{
    public final d a;

    public void b(d p0){
       this.a = p0;
    }
    public final void a(int p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), ta, uod, "5") && (ta.n != null || (ta.o < (ta.k - 1) && (ta.c.c() - p0) <= 10)))) {
          b9.a(ta.h);
          ta.n = true;
          ta.h = t.timer(((ta.m + ta.j) - SystemClock.elapsedRealtime()), TimeUnit.MILLISECONDS).flatMap(new q(ta)).observeOn(d.a).subscribe(new l(ta), e.b);
       }
    label_0065 :
       return;
    }
}
