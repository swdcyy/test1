package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$bundleDialogLimitation$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.jsbridge.rn.LiveKrnContainerParams;
import java.lang.Integer;
import zsd.t;

public final class LiveKrnDialogData$bundleDialogLimitation$2 extends Lambda implements a	// class@001d2c
{
    public final LiveKrnDialogData this$0;

    public void LiveKrnDialogData$bundleDialogLimitation$2(LiveKrnDialogData p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       String obj = PatchProxy.apply(null, this, LiveKrnDialogData$bundleDialogLimitation$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.this$0.x(LiveKrnContainerParams.BUNDLE_DIALOG_LIMITATION);
       int i = 0;
       if (obj != null) {
          Integer integer = t.X0(obj);
          int i1 = (integer != null)? integer.intValue(): 0;
          if (i1 >= 0) {
             i = i1;
          }
       }
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
