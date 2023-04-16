package com.kuaishou.merchant.live.screenshot.LiveMerchantScreenShotPageEventManager;
import java.lang.Object;
import com.kuaishou.merchant.live.screenshot.LiveMerchantScreenShotPageEventManager$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import e06.b;
import brd.t;
import t45.d;
import brd.z;
import j74.e;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle$Event;
import z1.a;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import lnc.b9;

public class LiveMerchantScreenShotPageEventManager	// class@001ad1
{
    public Lifecycle$Event a;
    public a b;
    public GifshowActivity c;
    public b d;
    public DefaultLifecycleObserver e;

    public void LiveMerchantScreenShotPageEventManager(){
       super();
       this.e = new LiveMerchantScreenShotPageEventManager$1(this);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantScreenShotPageEventManager.class, "3")) {
          return;
       }
       this.d = RxBus.f.f(b.class).observeOn(d.a).subscribe(new e(this));
       return;
    }
    public void b(GifshowActivity p0,Lifecycle$Event p1,a p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, LiveMerchantScreenShotPageEventManager.class, "1")) {
          return;
       }
       this.c = p0;
       this.a = p1;
       this.b = p2;
       p0.getLifecycle().addObserver(this.e);
       PatchProxy.onMethodExit(LiveMerchantScreenShotPageEventManager.class, "1");
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantScreenShotPageEventManager.class, "2")) {
          return;
       }
       this.a = null;
       this.d();
       LiveMerchantScreenShotPageEventManager tc = this.c;
       if (tc != null) {
          tc.getLifecycle().removeObserver(this.e);
          this.c = null;
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantScreenShotPageEventManager.class, "4")) {
          return;
       }
       b9.a(this.d);
       return;
    }
}
