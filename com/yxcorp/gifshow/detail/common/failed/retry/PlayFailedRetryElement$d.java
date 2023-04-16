package com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement$d;
import com.kwai.framework.player.multisource.e;
import com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement;
import java.lang.Object;
import oc6.a;
import com.kwai.framework.player.multisource.PlaySourceSwitcher$a;
import oc6.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import j9a.d;
import java.lang.System;
import java.lang.Long;
import java.util.List;
import java.lang.Boolean;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import bf5.v;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import e0a.j;
import com.kwai.sdk.switchconfig.a;
import wnc.a;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import ok.x;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;

public class PlayFailedRetryElement$d implements e	// class@001406
{
    public final PlayFailedRetryElement a;

    public void PlayFailedRetryElement$d(PlayFailedRetryElement p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       a.a(this, p0);
    }
    public void b(PlaySourceSwitcher$a p0){
    }
    public void c(int p0){
       a.b(this, p0);
    }
    public void d(b p0){
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PlayFailedRetryElement playFailedRe = PlayFailedRetryElement.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayFailedRetryElement$d.class, str)) {
          return;
       }
       this.a.r0("onSwitchedFailed");
       PlayFailedRetryElement$d ta = this.a;
       ta.G = false;
       Objects.requireNonNull(ta);
       d uod = d.class;
       if (!PatchProxy.applyVoid(null, ta, playFailedRe, str)) {
          long l = System.currentTimeMillis();
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), null, uod, "15")) {
             d.j.add(Long.valueOf(l));
          }
          Object obj1 = PatchProxy.apply(null, null, uod, "17");
          if (obj1 != patchProxyRe) {
             b2 = obj1.booleanValue();
          }else if(d.j.size() == 2){
             b2 = true;
          }else {
             b2 = false;
          }
          if (b2) {
             ta.N.V.onNext(new v(ta.C, "scene_play_failed"));
             if (!PatchProxy.applyVoid(null, null, uod, "16")) {
                d.j.clear();
             }
          }
       }
    label_0086 :
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, playFailedRe, "6")) {
          if (ta.F != null && ta.H().B()) {
             Object obj = PatchProxy.apply(null, null, j.class, "18");
             boolean b = (obj != patchProxyRe)? obj.booleanValue(): a.t().d("enableAutoRetry4ErrorPlayer", false);
             if (b && (a.a() && (SystemClock.elapsedRealtime() - ta.J) - 300 > 0)) {
                PlayFailedRetryElement b1 = ta.B;
                if (b1 != null && (b1.isAdded() && ta.B.isResumed())) {
                   ta.r0("onPlayFailed, do RetryPlay");
                   ta.p0(1000);
                   if (ta.M.get() != null) {
                      ta.M.get().setAutoRetryCnt((ta.M.get().getAutoRetryCnt() + 1));
                   }
                }
             }
          }
       label_0114 :
          ta.r0("onPlayFailed, disable RetryPlay");
          ta.o0(p0);
       }
       return;
    }
}
