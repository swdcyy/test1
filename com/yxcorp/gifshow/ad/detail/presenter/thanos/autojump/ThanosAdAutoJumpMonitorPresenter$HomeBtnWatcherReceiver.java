package com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter$HomeBtnWatcherReceiver;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class ThanosAdAutoJumpMonitorPresenter$HomeBtnWatcherReceiver extends BroadcastReceiver	// class@0016c0
{
    public final ThanosAdAutoJumpMonitorPresenter a;

    public void ThanosAdAutoJumpMonitorPresenter$HomeBtnWatcherReceiver(ThanosAdAutoJumpMonitorPresenter p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ThanosAdAutoJumpMonitorPresenter$HomeBtnWatcherReceiver.class, "1")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "intent");
       this.a.P8("intent.action "+p1.getAction());
       if (a.g(p1.getAction(), "android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
          this.a.P8("home btn is click");
          p0.s = true;
       }
       return;
    }
}
