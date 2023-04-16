package com.yxcorp.gifshow.ad.webview.AdPageJumpCheckPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.webview.AdPageJumpCheckPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.webview.AdPageJumpCheckPresenter$mKCMonitor$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.yxcorp.gifshow.ad.webview.AdPageJumpCheckPresenter$c;
import com.yxcorp.gifshow.ad.webview.AdPageJumpCheckPresenter$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.IntentFilter;
import com.yxcorp.gifshow.ad.webview.AdPageJumpCheckPresenter$HomeBtnWatcherReceiver;
import android.app.Activity;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import sl9.d;
import tyc.k3;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.ad.webview.AdPageJumpCheckPresenter$onBind$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.framework.model.feed.BaseFeed;

public final class AdPageJumpCheckPresenter extends PresenterV2	// class@001894
{
    public BaseFragment p;
    public BaseFeed q;
    public boolean r;
    public boolean s;
    public int t;
    public AdPageJumpCheckPresenter$HomeBtnWatcherReceiver u;
    public final p v;
    public final long w;
    public final k3 x;
    public final a y;
    public static final AdPageJumpCheckPresenter$a z;

    static {
       AdPageJumpCheckPresenter.z = new AdPageJumpCheckPresenter$a(null);
    }
    public void AdPageJumpCheckPresenter(){
       super();
       this.v = s.c(AdPageJumpCheckPresenter$mKCMonitor$2.INSTANCE);
       this.w = a.t().b("adH5JumpExceptionMaxCount", 3);
       this.x = new AdPageJumpCheckPresenter$c(this);
       this.y = new AdPageJumpCheckPresenter$b(this);
    }
    public void E8(){
       AdPageJumpCheckPresenter uAdPageJumpC = AdPageJumpCheckPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAdPageJumpC, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uAdPageJumpC, "7")) {
          IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
          this.P8();
          this.u = new AdPageJumpCheckPresenter$HomeBtnWatcherReceiver(this);
          Activity activity1 = this.getActivity();
          if (activity1 != null) {
             UniversalReceiver.e(activity1, this.u, intentFilter);
          }
       }
       Activity activity = this.getActivity();
       if (!activity instanceof d) {
          activity = objArray;
       }
       if (activity != null) {
          activity.P0(this.x);
       }
       activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          objArray.F2(this.y);
       }
       uAdPageJumpC = this.p;
       if (uAdPageJumpC == null) {
          a.S("mFragment");
       }
       uAdPageJumpC.getLifecycle().addObserver(new AdPageJumpCheckPresenter$onBind$1(this));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdPageJumpCheckPresenter.class, "4")) {
          return;
       }
       this.P8();
       Activity activity = this.getActivity();
       if (!activity instanceof d) {
          activity = objArray;
       }
       if (activity != null) {
          activity.T(this.x);
       }
       activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          objArray.l3(this.y);
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, AdPageJumpCheckPresenter.class, "8")) {
          return;
       }
       if (this.u != null) {
          Activity activity = this.getActivity();
          if (activity != null) {
             UniversalReceiver.f(activity, this.u);
          }
          this.u = null;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AdPageJumpCheckPresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(AdYodaFragment2.class);
       a.o(obj, "inject\(AdYodaFragment2::class.java\)");
       this.p = obj;
       obj = this.q8(BaseFeed.class);
       a.o(obj, "inject\(BaseFeed::class.java\)");
       this.q = obj;
       return;
    }
}
