package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$componentName$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.jsbridge.rn.LiveKrnContainerParams;

public final class LiveKrnDialogData$componentName$2 extends Lambda implements a	// class@001d2e
{
    public final LiveKrnDialogData this$0;

    public void LiveKrnDialogData$componentName$2(LiveKrnDialogData p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String obj = PatchProxy.apply(null, this, LiveKrnDialogData$componentName$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.x(LiveKrnContainerParams.COMPONENT_NAME);
       if (obj == null) {
          obj = "";
       }
       return obj;
    }
}
