package com.kuaishou.live.lite.framework.root.LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import hb3.c;

public final class LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$3 extends Lambda implements a	// class@000975
{
    public final LiveLiteRootViewController this$0;

    public void LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$3(LiveLiteRootViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoidWithListener(null, this, LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$3.class, "1")) {
          return;
       }
       this.this$0.q.f = SystemClock.elapsedRealtime();
       PatchProxy.onMethodExit(LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$3.class, "1");
       return;
    }
}
