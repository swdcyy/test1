package com.kwai.sdk.eve.internal.common.scheduler.internal.PriorityBlockingQueue2$cost$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.common.scheduler.internal.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public final class PriorityBlockingQueue2$cost$1 extends Lambda implements q	// class@00148d
{
    public static final PriorityBlockingQueue2$cost$1 INSTANCE;

    static {
       PriorityBlockingQueue2$cost$1.INSTANCE = new PriorityBlockingQueue2$cost$1();
    }
    public void PriorityBlockingQueue2$cost$1(){
       super(3);
    }
    public final long invoke(a$a p0,int p1,long p2){
       if (PatchProxy.isSupport(PriorityBlockingQueue2$cost$1.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Long.valueOf(p2), this, PriorityBlockingQueue2$cost$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       a.p(p0, "node");
       p2 = p2 - p0.a();
       if (p2 >= 0) {
          return (p2 * (long)p1);
       }else {
          throw new IllegalStateException("wait cost < 0 for item "+p0);
       }
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return Long.valueOf(this.invoke(p0, p1.intValue(), p2.longValue()));
    }
}
