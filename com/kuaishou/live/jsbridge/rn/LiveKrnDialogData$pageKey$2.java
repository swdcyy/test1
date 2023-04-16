package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$pageKey$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.jsbridge.rn.LiveKrnContainerParams;
import com.kuaishou.live.jsbridge.LiveKrnPageKey$a;

public final class LiveKrnDialogData$pageKey$2 extends Lambda implements a	// class@001d39
{
    public final LiveKrnDialogData this$0;

    public void LiveKrnDialogData$pageKey$2(LiveKrnDialogData p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveKrnPageKey invoke(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, LiveKrnDialogData$pageKey$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.x(LiveKrnContainerParams.PAGE_KEY);
       if (obj != null) {
          objArray = LiveKrnPageKey.Companion.a(obj);
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
