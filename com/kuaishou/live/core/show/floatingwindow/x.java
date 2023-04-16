package com.kuaishou.live.core.show.floatingwindow.x;
import ok.x;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.LivePlayerController;
import java.util.List;
import com.kwai.framework.player.core.d;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.core.show.floatingwindow.v;
import ok.h;
import ok.o;
import com.google.common.base.Predicates;
import s82.s0;
import com.kuaishou.live.core.show.floatingwindow.w;
import s82.t0;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.floatingwindow.x$a;
import lnc.u1;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.kuaishou.live.core.basic.utils.e;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import vs5.d;
import vs5.f;

public class x	// class@000b9b
{
    public final x a;
    public boolean b;
    public x$a c;

    public void x(x p0){
       super();
       this.a = p0;
    }
    public static void a(x p0){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, x.class, "1")) {
       }else {
          LivePlayerController livePlayerCo = p0.a.get();
          if (livePlayerCo != null) {
             p0.b("checkOtherPlayerPlayingStatus", m.s(d.a()).F(v.b).p(Predicates.h()).p(new s0(livePlayerCo)).d(w.b));
             k1.s(new t0(p0), p0, 500);
          }
       }
       return;
    }
    public final void b(String p0,boolean p1){
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ox, "5")) {
          return;
       }
       b.d0(LiveLogTag.FLOATING_WINDOW, "dispatchMuteStatusChanged", "reason", p0, "mute", Boolean.valueOf(p1));
       LivePlayerController livePlayerCo = this.a.get();
       if (livePlayerCo != null && !livePlayerCo.isStop()) {
          ox = this.c;
          if (ox != null) {
             ox.a(p1);
          }
          if (p1 && !livePlayerCo.isPlayerMute()) {
             livePlayerCo.mute();
          }else if(!p1 && (livePlayerCo.isPlayerMute() && this.b == null)){
             livePlayerCo.unMute();
          }
       }
    label_0058 :
       return;
    }
    public void c(boolean p0){
       this.b = p0;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, x.class, "2")) {
          return;
       }
       u1.a(this);
       if (e.s(ActivityContext.g().e())) {
          this.b("current activity PhotoDetailActivity", (a.t().u("SOURCE_LIVE").d("enableFloatingWindowUnmute", false) ^ 0x01));
       }
       k1.n(this);
       k1.s(new t0(this), this, 500);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, x.class, "3")) {
          return;
       }
       u1.b(this);
       k1.n(this);
       return;
    }
    public void onEventMainThread(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "4")) {
          return;
       }
       this.b("OnVideoPlayStartEvent", true);
       return;
    }
    public void onEventMainThread(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "6")) {
          return;
       }
       this.b("StopLivePlayEvent", true);
       return;
    }
}
