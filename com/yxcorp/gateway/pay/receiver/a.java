package com.yxcorp.gateway.pay.receiver.a;
import android.os.ResultReceiver;
import android.os.Handler;
import com.yxcorp.gateway.pay.api.PayCallback;
import java.lang.String;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gateway.pay.receiver.OrderPayReceiver$1;
import androidx.lifecycle.LifecycleObserver;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.StringBuilder;
import lv8.g;
import com.yxcorp.gateway.pay.params.PayResult;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class a extends ResultReceiver	// class@001263
{
    public PayCallback b;
    public final String c;
    public final String d;

    public void a(Handler p0,PayCallback p1,String p2,String p3){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void a(Handler p0,PayCallback p1,String p2,String p3,LifecycleOwner p4){
       super(p0, p1, p2, p3);
       if (p4 != null) {
          p4.getLifecycle().addObserver(new OrderPayReceiver$1(this, p4));
       }
       return;
    }
    public void onReceiveResult(int p0,Bundle p1){
       a tb;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, a.class, "1")) {
          return;
       }
       g.d("OrderPay onReceiveResult, resultCode="+p0);
       super.onReceiveResult(p0, p1);
       if (p1 == null) {
          tb = this.b;
          if (tb != null) {
             tb.onPayFailure(new PayResult("2", this.c, this.d, ""));
             this.b = null;
          }
          return;
       }else {
          PayResult serializable = SerializableHook.getSerializable(p1, "order_pay_result");
          if (p0) {
             if (p0 != 1) {
                if (p0 != 3) {
                   tb = this.b;
                   if (tb != null) {
                      tb.onPayFailure(serializable);
                   label_0077 :
                      this.b = null;
                   }
                }else {
                   tb = this.b;
                   if (tb != null) {
                      tb.onPayCancel(serializable);
                      goto label_0077 ;
                   }
                }
             }else {
                tb = this.b;
                if (tb != null) {
                   tb.onPaySuccess(serializable);
                   goto label_0077 ;
                }
             }
          }else {
             tb = this.b;
             if (tb != null) {
                tb.onPayUnknown(serializable);
                goto label_0077 ;
             }
          }
          return;
       }
    }
}
