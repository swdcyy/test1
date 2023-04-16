package com.yxcorp.gifshow.detail.player.panel.smallwindow.presenter.PictureInPictureLockScreenPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.presenter.PictureInPictureLockScreenPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.presenter.PictureInPictureLockScreenPresenter$mBroadcastReceiver$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import java.lang.StringBuilder;
import android.app.Activity;
import q87.c;
import android.content.IntentFilter;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.lang.Throwable;
import android.util.Log;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class PictureInPictureLockScreenPresenter extends PresenterV2	// class@001643
{
    public final BroadcastReceiver p;
    public boolean q;
    public static final PictureInPictureLockScreenPresenter$a r;

    static {
       PictureInPictureLockScreenPresenter.r = new PictureInPictureLockScreenPresenter$a(null);
    }
    public void PictureInPictureLockScreenPresenter(){
       super();
       this.p = new PictureInPictureLockScreenPresenter$mBroadcastReceiver$1(this);
    }
    public void E8(){
       Activity activity;
       if (PatchProxy.applyVoid(null, this, PictureInPictureLockScreenPresenter.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       o.C().w("PipLockScreenPresenter", "onBind: activity: "+this.getActivity(), objArray);
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.intent.action.SCREEN_OFF");
       if (this.getActivity() == null) {
          Object[] objArray1 = new Object[i];
          o.C().w("PipLockScreenPresenter", "register receiver fail: activity is null", objArray1);
          return;
       }else {
          activity = this.getActivity();
          a.m(activity);
          UniversalReceiver.e(activity, this.p, intentFilter);
          this.q = true;
          objArray = new Object[i];
          o.C().w("PipLockScreenPresenter", "register receiver success£ºactivity "+this.getActivity(), objArray);
          return;
       }
    }
    public void J8(){
       Activity activity;
       if (PatchProxy.applyVoid(null, this, PictureInPictureLockScreenPresenter.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("PipLockScreenPresenter", "onUnbind: activity: "+this.getActivity(), objArray);
       if (this.q != null) {
          this.q = false;
          activity = this.getActivity();
          a.m(activity);
          UniversalReceiver.f(activity, this.p);
       }
       return;
    }
}
