package com.kuaishou.live.core.show.banned.d$a;
import cy1.r;
import com.kuaishou.live.core.show.banned.d;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ub1.d;
import java.util.Objects;
import z12.e;
import o02.f;
import o02.e;
import t02.a0;
import com.kuaishou.android.live.model.QLivePlayConfig;
import brd.t;
import cjd.e;
import erd.o;
import o32.h;
import o32.i;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class d$a implements r	// class@0009e5
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       if (d.b(p0)) {
          d$a ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, d.class, "6")) {
             String[] stringArray = new String[0];
             e.c("LiveBannedAudience", "fetchLiveBannedErrorInfoAndStopLive", stringArray);
             ta.X7(e.a().B(ta.p.e.getLiveStreamId()).map(new e()).subscribe(new h(ta), new i(ta)));
          }
       }
       return;
    }
}
