package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationAutoPlaySwitch$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i3a.b;

public final class OperationAutoPlaySwitch$1 extends Lambda implements a	// class@001471
{
    public static final OperationAutoPlaySwitch$1 INSTANCE;

    static {
       OperationAutoPlaySwitch$1.INSTANCE = new OperationAutoPlaySwitch$1();
    }
    public void OperationAutoPlaySwitch$1(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, OperationAutoPlaySwitch$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.f();
    }
}
