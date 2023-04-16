package com.kuaishou.tuna_core.krn.native_module.TunaFollowNotificationModule;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import crd.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import java.lang.Class;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.tuna_core.krn.native_module.TunaFollowNotificationModule$a;
import com.facebook.react.bridge.ReactContext;
import erd.g;
import crd.b;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.BaseJavaModule;
import lnc.b9;

public class TunaFollowNotificationModule extends KrnBridge	// class@0010dd
{
    public final a mDisposable;

    public void TunaFollowNotificationModule(ReactApplicationContext p0){
       super(p0);
       a uoa = new a();
       this.mDisposable = uoa;
       uoa.c(RxBus.f.f(n.class).observeOn(d.a).subscribe(new TunaFollowNotificationModule$a(p0)));
    }
    public String getName(){
       return "KRNTunaFollowNotification";
    }
    public void onCatalystInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, TunaFollowNotificationModule.class, "1")) {
          return;
       }
       super.onCatalystInstanceDestroy();
       b9.a(this.mDisposable);
       return;
    }
}
