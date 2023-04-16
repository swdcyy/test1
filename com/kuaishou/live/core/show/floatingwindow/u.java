package com.kuaishou.live.core.show.floatingwindow.u;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$m;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import java.lang.Object;
import s82.p0;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowCloseType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import s82.y;
import com.kuaishou.live.core.show.floatingwindow.z;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tj3.i;
import tj3.e;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import tkd.b;
import tkd.d;
import os5.e;

public class u implements LiveFloatingWindowManager$m	// class@000b97
{
    public final LiveFloatingWindowManager a;

    public void u(LiveFloatingWindowManager p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       u ta = this.a;
       ta.p = p0;
       ta.q = p1;
    }
    public void b(int p0,int p1){
       p0.a(this, p0, p1);
    }
    public void c(LiveFloatingWindowCloseType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       this.a.c(p0);
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, u.class, "2")) {
          return;
       }
       u ta = this.a;
       boolean b = true;
       ta.J = b;
       LiveFloatingWindowManager x = ta.x;
       if (x == null) {
          return;
       }
       if (ta.b != null) {
          u ta1 = this.a;
          y.g(x.mEntity, QCurrentUser.me().getId(), ta1.e, ta1.f());
       }
       if (this.a.l()) {
          if (z.d()) {
             ta = this.a;
             if (ta.L != null) {
                ta.K = b;
             }
             ta.b(ActivityContext.g().e(), this.a.I);
          }else {
             this.a.V.run();
             k1.r(this.a.W, 5000);
          }
       }else {
          LiveFloatingWindowManager h = this.a.H;
          if (h != null && (h.mIsSoloLiveStream == null && ActivityContext.g().e() instanceof GifshowActivity)) {
             ta = this.a;
             if (ta.L != null) {
                h = ta.d;
                if (h != null) {
                   h.h().A(b);
                }
             }
             ta = this.a;
             GifshowActivity gifshowActiv = ActivityContext.g().e();
             LiveFloatingWindowManager h1 = this.a.H;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoidTwoRefs(gifshowActiv, h1, ta, LiveFloatingWindowManager.class, "26")) {
                b.Z(LiveLogTag.FLOATING_WINDOW, "Back to slide play");
                d.a(-1835681758).b1(gifshowActiv, h1);
                ta.M = b;
                ta.H = objArray;
             }
          }else {
             ta = this.a;
             if (ta.L != null) {
                ta.K = b;
             }
             ta.b(ActivityContext.g().e(), this.a.I);
          }
       }
       return;
    }
}
