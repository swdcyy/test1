package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSoundEffect$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i3a.b;

public final class OperationSoundEffect$1 extends Lambda implements a	// class@001485
{
    public static final OperationSoundEffect$1 INSTANCE;

    static {
       OperationSoundEffect$1.INSTANCE = new OperationSoundEffect$1();
    }
    public void OperationSoundEffect$1(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, OperationSoundEffect$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.g();
    }
}
