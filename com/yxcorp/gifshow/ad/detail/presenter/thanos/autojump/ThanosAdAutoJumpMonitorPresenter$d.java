package com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter$d;
import fw8.b;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Runnable;
import ekd.k1;

public final class ThanosAdAutoJumpMonitorPresenter$d extends b	// class@0016c4
{
    public final ThanosAdAutoJumpMonitorPresenter b;

    public void ThanosAdAutoJumpMonitorPresenter$d(ThanosAdAutoJumpMonitorPresenter p0){
       this.b = p0;
       super();
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdAutoJumpMonitorPresenter$d.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       this.b.P8("onActivityPaused activity "+p0+" getActivity "+this.b.getActivity());
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdAutoJumpMonitorPresenter$d.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       this.b.P8("onActivityResumed activity "+p0+" getActivity "+this.b.getActivity());
       return;
    }
    public void onActivityStopped(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdAutoJumpMonitorPresenter$d.class, "3")) {
          return;
       }
       a.p(p0, "activity");
       this.b.P8("onActivityStopped activity "+p0+" getActivity "+this.b.getActivity());
       if (a.g(p0, this.b.getActivity()) ^ 0x01) {
          return;
       }
       this.b.P8("page onStop, mIsStopByUser is "+this.b.s+", "+"mHasTouchedView is "+this.b.t);
       ThanosAdAutoJumpMonitorPresenter$d tb = this.b;
       if (tb.s != null || tb.t != null) {
          tb.P8("page not auto jump");
          return;
       }else {
          tb.P8("page auto jump");
          k1.r(this.b.z, 2000);
          return;
       }
    }
}
