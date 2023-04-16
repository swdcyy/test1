package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSubscribeSwitch$mTitleText$2;
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

public final class OperationSubscribeSwitch$mTitleText$2 extends Lambda implements a	// class@001491
{
    public static final OperationSubscribeSwitch$mTitleText$2 INSTANCE;

    static {
       OperationSubscribeSwitch$mTitleText$2.INSTANCE = new OperationSubscribeSwitch$mTitleText$2();
    }
    public void OperationSubscribeSwitch$mTitleText$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       SubscribeAuthorConfig obj = PatchProxy.apply(null, this, OperationSubscribeSwitch$mTitleText$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.t(SubscribeAuthorConfig.class);
       if (obj != null) {
          NegativeFeedbackConfig negativeFeed = obj.a();
          if (negativeFeed != null) {
             negativeFeed = negativeFeed.mTitle;
             if (negativeFeed != null) {
             label_002a :
                return negativeFeed;
             }
          }
       }
       String str = a1.p(R.string.arg_RES_7f104b10);
       goto label_002a ;
    }
}
