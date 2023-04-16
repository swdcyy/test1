package com.yxcorp.gifshow.v3.editor.effectv2.vb.EffectTimelineViewBinder$c;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$e;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.EffectTimelineViewBinder;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.EffectTimelineViewBinder$PlayStatus;
import com.kwai.video.editorsdk2.PreviewPlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qqc.d;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPlayerStateAction;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPlayerTimeAndStatusUpdateAction;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import java.lang.Double;
import lqc.d;
import tvc.e;
import kqc.c;
import kqc.f;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectEnableAutoPlayToVideoEndAction;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPlayerTimeUpdateAction;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectTimelineRefreshAction;

public final class EffectTimelineViewBinder$c extends VideoSDKPlayerView$e	// class@000f5d
{
    public double a;
    public EffectTimelineViewBinder$PlayStatus b;
    public final EffectTimelineViewBinder c;

    public void EffectTimelineViewBinder$c(EffectTimelineViewBinder p0){
       this.c = p0;
       super();
       this.b = EffectTimelineViewBinder$PlayStatus.IDLE;
    }
    public void onEnd(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EffectTimelineViewBinder$c.class, "4")) {
          return;
       }
       EffectTimelineViewBinder$c tb = this.b;
       EffectTimelineViewBinder$PlayStatus eND = EffectTimelineViewBinder$PlayStatus.END;
       if (tb != eND && tb != EffectTimelineViewBinder$PlayStatus.PAUSE) {
          this.c.E().t0(new EffectPlayerStateAction(false, this.c.G().getVideoLength()));
       }
       this.b = eND;
       return;
    }
    public void onPause(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EffectTimelineViewBinder$c.class, "3")) {
          return;
       }
       EffectTimelineViewBinder$c tb = this.b;
       EffectTimelineViewBinder$PlayStatus pAUSE = EffectTimelineViewBinder$PlayStatus.PAUSE;
       if (tb != pAUSE && tb != EffectTimelineViewBinder$PlayStatus.END) {
          a.m(p0);
          this.c.E().t0(new EffectPlayerTimeAndStatusUpdateAction(p0.getCurrentTime(), UpdateTo.TIMELINE, false));
       }
       this.b = pAUSE;
       return;
    }
    public void onPlay(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EffectTimelineViewBinder$c.class, "2")) {
          return;
       }
       this.b = EffectTimelineViewBinder$PlayStatus.PLAY;
       return;
    }
    public void onTimeUpdate(PreviewPlayer p0,double p1){
       double d;
       EffectTimelineViewBinder$c uoc = EffectTimelineViewBinder$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uoc, "1")) {
          return;
       }
       if (!p1 - this.a) {
          return;
       }
       this.a = p1;
       if (p0 != null) {
          boolean b = d.a.d(this.c.E().o0());
          d = this.c.E().o0().i().d();
          if (!b && (d - null >= 0 && (d - p1 <= 0 || (b && p1 - d <= 0)))) {
             this.c.G().seekTo(d);
             EffectPlayerTimeAndStatusUpdateAction uEffectPlaye = new EffectPlayerTimeAndStatusUpdateAction(d, UpdateTo.TIMELINE, false, 4, null);
             this.c.E().t0(v1);
             this.c.G().pause();
             this.c.E().t0(new EffectEnableAutoPlayToVideoEndAction());
          }
          if (p0.isPlaying()) {
             EffectTimelineViewBinder$c tc = this.c;
             if (tc.d != null) {
                EffectPlayerTimeAndStatusUpdateAction uEffectPlaye1 = new EffectPlayerTimeAndStatusUpdateAction(p1, UpdateTo.TIMELINE, false, 4, null);
                tc.E().t0(v7);
             }else {
                EffectPlayerTimeUpdateAction uEffectPlaye2 = new EffectPlayerTimeUpdateAction(p1, UpdateTo.TIMELINE, 0, 4, null);
                tc.E().t0(v7);
             }
          }
          if (this.c.E().o0().i().e != null) {
             this.c.E().t0(new EffectTimelineRefreshAction(this.c.E().u0().i().b()));
          }
       }
       return;
    }
}
