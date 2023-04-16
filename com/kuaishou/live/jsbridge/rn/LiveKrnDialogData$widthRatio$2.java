package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$widthRatio$2;
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

public final class LiveKrnDialogData$widthRatio$2 extends Lambda implements a	// class@001d41
{
    public final LiveKrnDialogData this$0;

    public void LiveKrnDialogData$widthRatio$2(LiveKrnDialogData p0){
       this.this$0 = p0;
       super(0);
    }
    public final float invoke(){
       float f;
       String obj = PatchProxy.apply(null, this, LiveKrnDialogData$widthRatio$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.this$0.x(LiveKrnContainerParams.WIDTH_RATIO);
       if (obj != null) {
          Float uFloat = s.J0(obj);
          if (uFloat != null) {
             f = uFloat.floatValue();
          label_002b :
             return f;
          }
       }
       f = 0x3f800000;
       goto label_002b ;
    }
    public Object invoke(){
       return Float.valueOf(this.invoke());
    }
}
