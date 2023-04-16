package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSubscribeSwitch$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSubscribeSwitch;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.SubscribeAuthorGuideManager;

public final class OperationSubscribeSwitch$1 extends Lambda implements a	// class@00148d
{
    public final OperationSubscribeSwitch this$0;

    public void OperationSubscribeSwitch$1(OperationSubscribeSwitch p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, OperationSubscribeSwitch$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return SubscribeAuthorGuideManager.a(this.this$0.C);
    }
}
