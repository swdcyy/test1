package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSpeedSetting$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSpeedSetting;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class OperationSpeedSetting$1 extends Lambda implements a	// class@00148a
{
    public final OperationSpeedSetting this$0;

    public void OperationSpeedSetting$1(OperationSpeedSetting p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, OperationSpeedSetting$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.this$0.W() - 0x3f800000)? true: false;
       return b;
    }
}
