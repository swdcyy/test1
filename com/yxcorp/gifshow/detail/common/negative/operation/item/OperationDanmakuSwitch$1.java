package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class OperationDanmakuSwitch$1 extends Lambda implements a	// class@001474
{
    public final OperationDanmakuSwitch this$0;

    public void OperationDanmakuSwitch$1(OperationDanmakuSwitch p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, OperationDanmakuSwitch$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.this$0.E() && this.this$0.Y())? true: false;
       return b;
    }
}
