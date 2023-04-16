package com.kwai.live.gzone.guess.kshell.v;
import h47.b;
import com.kwai.live.gzone.guess.kshell.x;
import java.lang.Object;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k67.b;
import com.kwai.live.gzone.pendant.service.LiveGzoneAudienceFeatureEntranceItem;
import android.view.View;
import k67.e$a;
import k67.g;
import com.kwai.live.gzone.guess.kshell.y;
import com.kwai.live.gzone.guess.kshell.k;
import android.os.SystemClock;
import java.lang.Math;
import com.kwai.live.gzone.guess.kshell.k$a;
import mq5.h;
import mq5.b;
import p57.y;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import oq5.c;
import oq5.a;

public final class v implements b	// class@000d6e
{
    public final x a;

    public void v(x p0){
       this.a = p0;
    }
    public final void a(LiveGzoneConfigResponse p0){
       v ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, x.class, "4")) {
       }else {
          x f = ta.F;
          ta.h1 = (f != null && f.S2())? p0.mEnableKshellBetRecommend: false;
          f = ta.K;
          if (f != null && ta.e1 == null) {
             ta.e1 = f.Sc(LiveGzoneAudienceFeatureEntranceItem.GUESS, ta.a1);
          }
          if (ta.W8()) {
             ta.K.pi(ta.e1, 0);
          }
          if (p0.mEnableGzoneLiveBet != null) {
             x s = ta.S;
             y oy = new y(ta);
             Objects.requireNonNull(s);
             k ok = k.class;
             if (!PatchProxy.applyVoidOneRefs(oy, s, ok, "5")) {
                s.a = oy;
                if (!PatchProxy.applyVoid(null, s, ok, "6") && s.a != null) {
                   if (s.b - null > 0 && Math.abs((SystemClock.elapsedRealtime() - s.b)) - 0x2710 < 0) {
                      s.a.b(500);
                   }
                   s.b = -1;
                }
             }
             ta.L.Km(ta.c1);
             ta.X7(ta.U0.subscribe(new y(ta)));
             ta.w.W0(ta.g1, 0);
          }
       }
       return;
    }
}
