package com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter$b;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import fw8.r;
import fw8.r$a;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.app.Application$ActivityLifecycleCallbacks;
import android.content.IntentFilter;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter$HomeBtnWatcherReceiver;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public final class ThanosAdAutoJumpMonitorPresenter$b extends a	// class@0016c2
{
    public final ThanosAdAutoJumpMonitorPresenter b;

    public void ThanosAdAutoJumpMonitorPresenter$b(ThanosAdAutoJumpMonitorPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, ThanosAdAutoJumpMonitorPresenter$b.class, "2")) {
          return;
       }
       this.b.P8("becomesDetachedOnPageSelected stopMonitor");
       this.b.S8();
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ThanosAdAutoJumpMonitorPresenter$b.class, "1")) {
          return;
       }
       this.b.P8("becomesAttachedOnPageSelected startMonitor");
       ThanosAdAutoJumpMonitorPresenter$b tb = this.b;
       Objects.requireNonNull(tb);
       ThanosAdAutoJumpMonitorPresenter thanosAdAuto = ThanosAdAutoJumpMonitorPresenter.class;
       if (!PatchProxy.applyVoid(objArray, tb, thanosAdAuto, "5")) {
          r.c().a(tb.w);
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          uoc.a().registerActivityLifecycleCallbacks(tb.x);
          if (!PatchProxy.applyVoid(objArray, tb, thanosAdAuto, "7")) {
             IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
             tb.V8();
             tb.u = new ThanosAdAutoJumpMonitorPresenter$HomeBtnWatcherReceiver(tb);
             Activity activity = tb.getActivity();
             if (activity != null) {
                UniversalReceiver.e(activity, tb.u, intentFilter);
             }
          }
          tb.t = false;
          tb.s = false;
       }
       return;
    }
}
