package com.yxcorp.gateway.pay.api.PayManager$1;
import android.os.ResultReceiver;
import com.yxcorp.gateway.pay.api.PayManager;
import android.os.Handler;
import io.reactivex.subjects.PublishSubject;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gateway.pay.params.result.AuthThirdResult;
import java.lang.Exception;

public class PayManager$1 extends ResultReceiver	// class@00121a
{
    public final PayManager this$0;
    public final PublishSubject val$publisher;

    public void PayManager$1(PayManager p0,Handler p1,PublishSubject p2){
       this.this$0 = p0;
       this.val$publisher = p2;
       super(p1);
    }
    public void onReceiveResult(int p0,Bundle p1){
       AuthThirdResult serializable;
       if (PatchProxy.isSupport(PayManager$1.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, PayManager$1.class, "1")) {
          return;
       }
       super.onReceiveResult(p0, p1);
       if (p1 == null) {
          this.val$publisher.onError(new IllegalArgumentException("Èý·½ÊÚÈ¨Ê§°Ü"));
          return;
       }else {
          String str = null;
          try{
             serializable = SerializableHook.getSerializable(p1, "auth_third_result");
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
             serializable = str;
          }
          if (serializable == null) {
             serializable = AuthThirdResult.fail(str, "");
          }
          this.val$publisher.onNext(serializable);
          this.val$publisher.onComplete();
          return;
       }
    }
}
