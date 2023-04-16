package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$enableCloseBtnOnErrorInHalf$2;
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

public final class LiveKrnDialogData$enableCloseBtnOnErrorInHalf$2 extends Lambda implements a	// class@001d31
{
    public final LiveKrnDialogData this$0;

    public void LiveKrnDialogData$enableCloseBtnOnErrorInHalf$2(LiveKrnDialogData p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       String obj = PatchProxy.apply(null, this, LiveKrnDialogData$enableCloseBtnOnErrorInHalf$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.this$0.x(LiveKrnContainerParams.ENABLE_CLOSE_BTN_ON_ERROR);
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
