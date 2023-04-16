package com.kuaishou.merchant.live.screenshot.LiveMerchantScreenShotPageEventManager$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.merchant.live.screenshot.LiveMerchantScreenShotPageEventManager;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle$Event;

public class LiveMerchantScreenShotPageEventManager$1 implements DefaultLifecycleObserver	// class@001ad0
{
    public final LiveMerchantScreenShotPageEventManager b;

    public void LiveMerchantScreenShotPageEventManager$1(LiveMerchantScreenShotPageEventManager p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantScreenShotPageEventManager$1.class, "1")) {
          return;
       }
       LiveMerchantScreenShotPageEventManager$1 tb = this.b;
       LiveMerchantScreenShotPageEventManager a = tb.a;
       if (a != null && a == Lifecycle$Event.ON_CREATE) {
          tb.a();
       }
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantScreenShotPageEventManager$1.class, "6")) {
          return;
       }
       LiveMerchantScreenShotPageEventManager$1 tb = this.b;
       LiveMerchantScreenShotPageEventManager a = tb.a;
       if (a != null && a == Lifecycle$Event.ON_CREATE) {
          tb.c();
       }
       return;
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantScreenShotPageEventManager$1.class, "4")) {
          return;
       }
       LiveMerchantScreenShotPageEventManager$1 tb = this.b;
       LiveMerchantScreenShotPageEventManager a = tb.a;
       if (a != null && a == Lifecycle$Event.ON_RESUME) {
          tb.d();
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantScreenShotPageEventManager$1.class, "3")) {
          return;
       }
       LiveMerchantScreenShotPageEventManager$1 tb = this.b;
       LiveMerchantScreenShotPageEventManager a = tb.a;
       if (a != null && a == Lifecycle$Event.ON_RESUME) {
          tb.a();
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantScreenShotPageEventManager$1.class, "2")) {
          return;
       }
       LiveMerchantScreenShotPageEventManager$1 tb = this.b;
       LiveMerchantScreenShotPageEventManager a = tb.a;
       if (a != null && a == Lifecycle$Event.ON_START) {
          tb.a();
       }
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantScreenShotPageEventManager$1.class, "5")) {
          return;
       }
       LiveMerchantScreenShotPageEventManager$1 tb = this.b;
       LiveMerchantScreenShotPageEventManager a = tb.a;
       if (a != null && a == Lifecycle$Event.ON_START) {
          tb.d();
       }
       return;
    }
}
