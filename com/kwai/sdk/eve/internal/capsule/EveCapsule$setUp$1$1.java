package com.kwai.sdk.eve.internal.capsule.EveCapsule$setUp$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import android.os.SystemClock;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.capsule.EveCapsule$setUp$1$1$1;
import msd.a;

public final class EveCapsule$setUp$1$1 extends Lambda implements l	// class@00146b
{
    public final String $taskId;

    public void EveCapsule$setUp$1$1(String p0){
       this.$taskId = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveCapsule$setUp$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       p0 = this.$taskId+String.valueOf(SystemClock.elapsedRealtimeNanos());
       EveLog.INSTANCE.i(new EveCapsule$setUp$1$1$1(p0));
       return p0;
    }
}
