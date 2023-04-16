package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$interceptBackKey$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.jsbridge.rn.LiveKrnContainerParams;
import java.lang.Integer;
import zsd.t;

public final class LiveKrnDialogData$interceptBackKey$2 extends Lambda implements a	// class@001d33
{
    public final LiveKrnDialogData this$0;

    public void LiveKrnDialogData$interceptBackKey$2(LiveKrnDialogData p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       String obj = PatchProxy.apply(null, this, LiveKrnDialogData$interceptBackKey$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.this$0.x(LiveKrnContainerParams.INTERCEPT_KEY_BACK);
       boolean b = false;
       if (obj != null) {
          Integer integer = t.X0(obj);
          if (integer == null || integer.intValue()) {
             b = true;
          }
       }
       return b;
    }
}
