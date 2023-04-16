package com.yxcorp.plugin.payment.activity.PaymentLifecycleWatcher;
import fw8.b;
import com.yxcorp.plugin.payment.activity.PaymentLifecycleWatcher$State;
import org.greenrobot.eventbus.a;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.net.Uri;
import ekd.p0;
import java.lang.CharSequence;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import m56.f;

public class PaymentLifecycleWatcher extends b	// class@0013ac
{
    public PaymentLifecycleWatcher$State b;

    public void PaymentLifecycleWatcher(){
       super();
       this.b = PaymentLifecycleWatcher$State.NONE;
       if (!a.d().i(this)) {
          a.d().p(this);
       }
       return;
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PaymentLifecycleWatcher.class, "1")) {
          return;
       }
       Intent intent = p0.getIntent();
       if (!PatchProxy.applyVoidOneRefs(intent, this, PaymentLifecycleWatcher.class, "2") && (intent != null && (intent.getData() != null && ("kwai").equals(intent.getData().getScheme())))) {
          try{
             str = p0.c(intent.getData().toString());
          }catch(java.lang.Exception e0){
             str = "";
          }
          if (str.contains("wechat") && !PatchProxy.applyVoid(null, this, PaymentLifecycleWatcher.class, "3")) {
             this.b = PaymentLifecycleWatcher$State.WECHAT;
             d.a(0x630bc993).d1().e(RequestTiming.DEFAULT);
          }
       }
    label_006b :
       return;
    }
    public void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PaymentLifecycleWatcher.class, "4")) {
          return;
       }
       if (this.b == PaymentLifecycleWatcher$State.WECHAT) {
          this.b = PaymentLifecycleWatcher$State.NONE;
          d.a(0x630bc993).d1().e(RequestTiming.ON_BACKGROUND);
       }
       this.b = PaymentLifecycleWatcher$State.NONE;
       return;
    }
}
