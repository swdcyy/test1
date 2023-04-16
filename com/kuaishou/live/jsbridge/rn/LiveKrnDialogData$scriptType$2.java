package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$scriptType$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.jsbridge.rn.LiveKrnContainerParams;

public final class LiveKrnDialogData$scriptType$2 extends Lambda implements a	// class@001d3d
{
    public final LiveKrnDialogData this$0;

    public void LiveKrnDialogData$scriptType$2(LiveKrnDialogData p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogData$scriptType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.x(LiveKrnContainerParams.SCRIPT_TYPE);
    }
}
