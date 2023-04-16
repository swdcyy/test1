package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class OperationDanmakuSwitch$2 extends Lambda implements a	// class@001475
{
    public final OperationDanmakuSwitch this$0;

    public void OperationDanmakuSwitch$2(OperationDanmakuSwitch p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, OperationDanmakuSwitch$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.this$0.Y();
    }
}
