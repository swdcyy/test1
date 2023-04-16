package com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter$b;
import androidx.fragment.app.c$b;
import com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tj3.i;
import ck2.i;
import com.kuaishou.live.core.show.statistics.logreporter.c;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Integer;
import tj3.e;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;
import tj3.d;
import com.kuaishou.android.live.model.LiveFloatingWindowType;
import k2b.e0;
import tj3.k;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.player.IMediaPlayer;

public class LiveLogReporterBasePresenter$b extends c$b	// class@00109e
{
    public final LiveLogReporterBasePresenter a;

    public void LiveLogReporterBasePresenter$b(LiveLogReporterBasePresenter p0){
       this.a = p0;
       super();
    }
    public void f(c p0,Fragment p1){
       LiveLogReporterBasePresenter x;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLogReporterBasePresenter$b.class, "2")) {
          return;
       }
       if (this.a.R8()) {
          x = this.a.x;
          x.k(false);
          x.p(1);
          x.G(k0.a(this.a.P8(), c.a).or(Integer.valueOf(7)).intValue());
          if (this.a.S8()) {
             this.a.p.j();
          }else {
             this.a.p.v(false);
          }
          if (!e.s(this.a.getActivity())) {
             this.a.x.p(1);
          }
          x.A = true;
       }
       x.z = true;
       return;
    }
    public void i(c p0,Fragment p1){
       LiveLogReporterBasePresenter x;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLogReporterBasePresenter$b.class, "1")) {
          return;
       }
       int i = 1;
       this.a.x.q(i);
       LiveFloatingWindowType liveFloating = null;
       this.a.p.b().d(liveFloating);
       if (p1 instanceof e0) {
          liveFloating = p1;
       }
       this.a.x.g(liveFloating);
       this.a.w.J(liveFloating);
       if (!e.s(this.a.getActivity())) {
          this.a.x.p(i);
       }
       if (this.a.R8()) {
          LiveLogReporterBasePresenter$b ta = this.a;
          if (ta.z != null) {
             if (ta.r.getLiveMediaPlayer() != null && this.a.r.getLiveMediaPlayer().isPlaying()) {
                x = this.a.x;
                x.k(i);
                x.G(8);
                x.p(2);
                this.a.p.v(false);
                this.a.p.i();
                x.z = false;
             }else {
                this.a.p.h().j();
             }
          }
       }
       x.A = false;
       return;
    }
}
