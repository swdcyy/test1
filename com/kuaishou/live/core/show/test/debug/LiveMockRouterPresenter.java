package com.kuaishou.live.core.show.test.debug.LiveMockRouterPresenter;
import k51.c;
import com.kuaishou.live.core.show.test.debug.LiveMockRouterPresenter$a;
import nsd.u;
import com.kuaishou.live.core.show.test.debug.LiveMockRouterPresenter$localBroadCastReceiver$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f12.d;
import f12.c;
import android.content.Context;
import q2.a;
import android.content.IntentFilter;
import qrd.l1;
import android.content.BroadcastReceiver;
import android.view.View;
import com.kuaishou.live.core.show.test.debug.LiveMockRouterPresenter$b;
import java.lang.Runnable;
import vq5.d;
import lp3.e;

public final class LiveMockRouterPresenter extends c	// class@00119e
{
    public d p;
    public d q;
    public e r;
    public float s;
    public float t;
    public final BroadcastReceiver u;
    public static String sLivePresenterClassName = "LiveMockRouterPresenter";
    public static final LiveMockRouterPresenter$a v;

    static {
       LiveMockRouterPresenter.v = new LiveMockRouterPresenter$a(null);
    }
    public void LiveMockRouterPresenter(){
       super();
       this.u = new LiveMockRouterPresenter$localBroadCastReceiver$1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveMockRouterPresenter.class, "3")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          this.q = c.b(activity);
          IntentFilter intentFilter = new IntentFilter();
          intentFilter.addAction("com.live.router.scheme");
          a.b(activity).c(this.u, intentFilter);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveMockRouterPresenter.class, "9")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          a.b(activity).e(this.u);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMockRouterPresenter.class, "2")) {
          return;
       }
       this.m8();
       this.m8().post(new LiveMockRouterPresenter$b(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveMockRouterPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_ROUTER_SERVICE");
       this.r = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
