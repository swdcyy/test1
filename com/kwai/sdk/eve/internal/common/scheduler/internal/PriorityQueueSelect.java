package com.kwai.sdk.eve.internal.common.scheduler.internal.PriorityQueueSelect;
import com.kwai.sdk.eve.internal.common.scheduler.internal.PriorityQueueSelect$systemClock$1;
import java.lang.Object;
import java.util.concurrent.BlockingQueue;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.eve.internal.common.scheduler.internal.SimpleLabeledBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import com.kwai.sdk.eve.internal.common.scheduler.internal.a;
import msd.a;
import nsd.u;

public final class PriorityQueueSelect	// class@001490
{
    public static final a a;
    public static final PriorityQueueSelect b;

    static {
       PriorityQueueSelect.b = new PriorityQueueSelect();
       PriorityQueueSelect.a = PriorityQueueSelect$systemClock$1.INSTANCE;
    }
    public void PriorityQueueSelect(){
       super();
    }
    public final BlockingQueue a(int p0){
       a obj;
       SimpleLabeledBlockingQueue simpleLabele;
       PriorityQueueSelect priorityQueu = PriorityQueueSelect.class;
       if (PatchProxy.isSupport(priorityQueu)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, priorityQueu, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != 1) {
          simpleLabele = (p0 != 2)? new SimpleLabeledBlockingQueue(): new LinkedBlockingQueue();
       }else {
          obj = new a(PriorityQueueSelect.a, 0, 0, 6, null);
       }
       return simpleLabele;
    }
}
