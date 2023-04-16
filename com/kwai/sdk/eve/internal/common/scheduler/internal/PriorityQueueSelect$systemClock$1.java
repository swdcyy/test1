package com.kwai.sdk.eve.internal.common.scheduler.internal.PriorityQueueSelect$systemClock$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.SystemClock;
import java.lang.Long;

public final class PriorityQueueSelect$systemClock$1 extends Lambda implements a	// class@00148f
{
    public static final PriorityQueueSelect$systemClock$1 INSTANCE;

    static {
       PriorityQueueSelect$systemClock$1.INSTANCE = new PriorityQueueSelect$systemClock$1();
    }
    public void PriorityQueueSelect$systemClock$1(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, PriorityQueueSelect$systemClock$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return SystemClock.elapsedRealtime();
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
