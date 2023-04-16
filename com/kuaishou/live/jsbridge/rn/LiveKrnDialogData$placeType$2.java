package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$placeType$2;
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

public final class LiveKrnDialogData$placeType$2 extends Lambda implements a	// class@001d3b
{
    public final LiveKrnDialogData this$0;

    public void LiveKrnDialogData$placeType$2(LiveKrnDialogData p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       int i;
       String obj = PatchProxy.apply(null, this, LiveKrnDialogData$placeType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.this$0.x(LiveKrnContainerParams.PLACE);
       if (obj != null) {
          Integer integer = t.X0(obj);
          if (integer != null) {
             i = integer.intValue();
          label_002a :
             return i;
          }
       }
       i = 1;
       goto label_002a ;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
