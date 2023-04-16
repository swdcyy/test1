package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSubscribeSwitch$mToastContent$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.model.SubscribeAuthorConfig;
import java.lang.reflect.Type;
import uw9.c;
import com.yxcorp.gifshow.detail.model.NegativeFeedbackConfig;
import lnc.a1;

public final class OperationSubscribeSwitch$mToastContent$2 extends Lambda implements a	// class@001492
{
    public static final OperationSubscribeSwitch$mToastContent$2 INSTANCE;

    static {
       OperationSubscribeSwitch$mToastContent$2.INSTANCE = new OperationSubscribeSwitch$mToastContent$2();
    }
    public void OperationSubscribeSwitch$mToastContent$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       SubscribeAuthorConfig obj = PatchProxy.apply(null, this, OperationSubscribeSwitch$mToastContent$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.t(SubscribeAuthorConfig.class);
       if (obj != null) {
          NegativeFeedbackConfig negativeFeed = obj.a();
          if (negativeFeed != null) {
             negativeFeed = negativeFeed.mToast;
             if (negativeFeed != null) {
             label_002a :
                return negativeFeed;
             }
          }
       }
       String str = a1.p(R.string.arg_RES_7f104b0e);
       goto label_002a ;
    }
}
