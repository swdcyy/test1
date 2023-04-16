package com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxPaymentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import z1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxPaymentManager$a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import pp.c;
import com.kuaishou.android.live.log.b;
import ad5.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxPaymentManager$b;
import sfc.a;
import erd.g;
import crd.b;
import n2.a;
import wkd.b;
import com.yxcorp.gifshow.autoplay.state.NetworkState;
import com.yxcorp.gifshow.autoplay.state.NetworkState$a;

public final class LiveGiftBoxPaymentManager implements DefaultLifecycleObserver	// class@001200
{
    public boolean b;
    public boolean c;
    public final NetworkState$a d;
    public final LifecycleOwner e;
    public final k f;
    public final k g;

    public void LiveGiftBoxPaymentManager(LifecycleOwner p0,k p1,k p2){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "paymentManager");
       a.p(p2, "currentUser");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.d = new LiveGiftBoxPaymentManager$a(this);
       p0.getLifecycle().addObserver(this);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxPaymentManager.class, "7")) {
          return;
       }
       Object obj = this.g.get();
       a.o(obj, "currentUser.get\(\)");
       b.Z(LiveLogTag.GIFT_BOX, "login:"+obj.isLogined()+','+"hasWalletConfigAndEncryptKeyLoaded:"+this.c+','+"hasWalletLoaded:"+this.b);
       Object obj1 = this.g.get();
       a.o(obj1, "currentUser.get\(\)");
       if (obj1.isLogined() && this.c == null) {
          this.f.get().e(RequestTiming.DEFAULT);
          this.f.get().s();
          this.c = true;
       }
       obj1 = this.g.get();
       a.o(obj1, "currentUser.get\(\)");
       if (obj1.isLogined() && this.b == null) {
          obj1 = this.f.get();
          a.o(obj1, "paymentManager.get\(\)");
          obj1.a().subscribe(new LiveGiftBoxPaymentManager$b(this), new a());
       }
       return;
    }
    public void onCreate(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxPaymentManager.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       a.a(this, p0);
       b.a(0x43d75a86).a(this.d);
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxPaymentManager.class, "3")) {
          return;
       }
       a.p(p0, "owner");
       a.b(this, p0);
       b.a(0x43d75a86).c(this.d);
       this.b = false;
       this.c = false;
       this.e.getLifecycle().removeObserver(this);
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxPaymentManager.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       this.a();
       return;
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
