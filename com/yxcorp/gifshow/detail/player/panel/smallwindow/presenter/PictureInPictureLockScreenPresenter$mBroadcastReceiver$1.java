package com.yxcorp.gifshow.detail.player.panel.smallwindow.presenter.PictureInPictureLockScreenPresenter$mBroadcastReceiver$1;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.presenter.PictureInPictureLockScreenPresenter;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import tkd.b;
import tkd.d;
import fp5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uw9.o;
import q87.c;

public final class PictureInPictureLockScreenPresenter$mBroadcastReceiver$1 extends BroadcastReceiver	// class@001642
{
    public final PictureInPictureLockScreenPresenter a;

    public void PictureInPictureLockScreenPresenter$mBroadcastReceiver$1(PictureInPictureLockScreenPresenter p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PictureInPictureLockScreenPresenter$mBroadcastReceiver$1.class, "1")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "intent");
       boolean b = false;
       if (a.t().d("disablePipScreenReceiver", b)) {
          return;
       }
       if (a.g("android.intent.action.SCREEN_OFF", p1.getAction())) {
          int i = 0x31a55ac8;
          if (d.a(i).s0(this.a.getActivity())) {
             Object[] objArray = new Object[b];
             o.C().w("PipLockScreenPresenter", "moveTaskToBack", objArray);
             d.a(i).Nd(this.a.getActivity());
          }
       }
       return;
    }
}
