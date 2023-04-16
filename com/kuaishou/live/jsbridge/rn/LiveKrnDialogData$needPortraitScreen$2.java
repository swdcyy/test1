package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$needPortraitScreen$2;
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
import kotlin.jvm.internal.a;

public final class LiveKrnDialogData$needPortraitScreen$2 extends Lambda implements a	// class@001d36
{
    public final LiveKrnDialogData this$0;

    public void LiveKrnDialogData$needPortraitScreen$2(LiveKrnDialogData p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogData$needPortraitScreen$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.g("1", this.this$0.x(LiveKrnContainerParams.NEED_PORTRAIT_SCREEN));
    }
}
