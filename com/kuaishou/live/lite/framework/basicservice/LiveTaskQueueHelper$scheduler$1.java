package com.kuaishou.live.lite.framework.basicservice.LiveTaskQueueHelper$scheduler$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.basicservice.LiveTaskQueueHelper;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveTaskQueueHelper$scheduler$1 extends Lambda implements a	// class@000909
{
    public final LiveTaskQueueHelper this$0;

    public void LiveTaskQueueHelper$scheduler$1(LiveTaskQueueHelper p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveTaskQueueHelper$scheduler$1.class, "1")) {
          return;
       }
       b.Z(LiveLiteLogTag.LIVE_LITE_TASK, "execute MainThread task complete");
       this.this$0.d = true;
       return;
    }
}
