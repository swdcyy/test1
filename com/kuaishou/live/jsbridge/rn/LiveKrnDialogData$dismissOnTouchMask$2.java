package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$dismissOnTouchMask$2;
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

public final class LiveKrnDialogData$dismissOnTouchMask$2 extends Lambda implements a	// class@001d30
{
    public final LiveKrnDialogData this$0;

    public void LiveKrnDialogData$dismissOnTouchMask$2(LiveKrnDialogData p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       String obj = PatchProxy.apply(null, this, LiveKrnDialogData$dismissOnTouchMask$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.this$0.x(LiveKrnContainerParams.DISMISS_ON_TOUCH_MASK);
       boolean b = true;
       if (obj != null) {
          Integer integer = t.X0(obj);
          if (integer != null && !integer.intValue()) {
             b = false;
          }
       }
       return b;
    }
}
