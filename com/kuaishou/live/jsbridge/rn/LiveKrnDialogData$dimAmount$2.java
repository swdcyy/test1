package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$dimAmount$2;
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
import java.lang.Float;
import zsd.s;

public final class LiveKrnDialogData$dimAmount$2 extends Lambda implements a	// class@001d2f
{
    public final LiveKrnDialogData this$0;

    public void LiveKrnDialogData$dimAmount$2(LiveKrnDialogData p0){
       this.this$0 = p0;
       super(0);
    }
    public final float invoke(){
       String obj = PatchProxy.apply(null, this, LiveKrnDialogData$dimAmount$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.this$0.x(LiveKrnContainerParams.DIM_AMOUNT);
       float f = 0;
       if (obj != null) {
          Float uFloat = s.J0(obj);
          float f1 = (uFloat != null)? uFloat.floatValue(): 0;
          if (f1 - f >= 0) {
             if (f1 - 0x3f800000 > 0) {
                f = 0x3f800000;
             }else {
                f = f1;
             }
          }
       }
       return f;
    }
    public Object invoke(){
       return Float.valueOf(this.invoke());
    }
}
