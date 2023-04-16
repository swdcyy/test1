package com.yxcorp.gateway.pay.api.PayManager$2;
import android.os.ResultReceiver;
import com.yxcorp.gateway.pay.api.PayManager;
import android.os.Handler;
import io.reactivex.subjects.PublishSubject;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import lv8.g;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gateway.pay.response.BindResult;
import java.lang.Exception;

public class PayManager$2 extends ResultReceiver	// class@00121b
{
    public final PayManager this$0;
    public final Activity val$activity;
    public final PublishSubject val$publisher;

    public void PayManager$2(PayManager p0,Handler p1,PublishSubject p2,Activity p3){
       this.this$0 = p0;
       this.val$publisher = p2;
       this.val$activity = p3;
       super(p1);
    }
    public void onReceiveResult(int p0,Bundle p1){
       BindResult serializable;
       if (PatchProxy.isSupport(PayManager$2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, PayManager$2.class, "1")) {
          return;
       }
       super.onReceiveResult(p0, p1);
       p0 = 0x7f103b87;
       if (p1 == null) {
          g.d("native bindWithdrawType failed, resultData == null");
          this.val$publisher.onError(new IllegalArgumentException(this.val$activity.getString(p0)));
          return;
       }else {
          try{
             serializable = SerializableHook.getSerializable(p1, "bind_result");
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
             serializable = null;
          }
          if (serializable == null) {
             g.d("native bindWithdrawType failed, bindResult invalid");
             serializable = BindResult.fail(this.val$activity.getString(p0));
          }
          this.val$publisher.onNext(serializable);
          this.val$publisher.onComplete();
          return;
       }
    }
}
