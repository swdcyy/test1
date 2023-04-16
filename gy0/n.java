package gy0.n;
import ne1.c;
import com.kuaishou.live.audience.component.comments.send.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.os.SystemClock;
import java.util.Objects;
import tj3.k;
import tj3.e;
import java.lang.System;
import z12.n;
import kuaishou.perf.page.impl.b;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import wd3.a;
import p91.m;
import k2b.e0;
import z12.x;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import pf1.b;
import android.app.Activity;
import d61.y;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public class n implements c	// class@0025b1
{
    public long a;
    public final e b;

    public void n(e p0){
       this.b = p0;
       super();
       this.a = 0;
    }
    public void a(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on, "1")) {
          return;
       }
       if ((SystemClock.elapsedRealtime() - this.a) - 1000 > 0) {
          this.a = SystemClock.elapsedRealtime();
          on = this.b;
          Objects.requireNonNull(on);
          e uoe = e.class;
          if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), on, uoe, "16")) {
             k ok = on.s.x();
             Objects.requireNonNull(ok);
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, ok, k.class, "32")) {
                ok.s0 = System.currentTimeMillis();
             }
             if (!PatchProxy.applyVoid(objArray, objArray, n.class, "9")) {
                b.d("live_click_to_destroy").f("CommentPanelReactDuration");
             }
             if (on.X8(p0, true)) {
                a0 a1 = on.r.a1;
                if (a1 != null) {
                   objArray = a1.B();
                }
                on.r.B.onClickLiveComment(x.k(on.t), on.m8(), on.r.Z2.a(), false, on.Q.h(), y.d(on.getActivity()), objArray);
             }
          }
       }
       return;
    }
}
