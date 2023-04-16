package com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter$c;
import java.lang.Runnable;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Long;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;
import trd.j;
import com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter;
import trd.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.AbstractList;
import eh5.q;
import eh5.v;
import eh5.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import usd.q;
import java.util.Collection;
import android.os.Handler;
import qrd.l1;

public final class SlideStageScatter$c implements Runnable	// class@000b9c
{
    public final SlideStageScatter b;
    public final long c;

    public void SlideStageScatter$c(SlideStageScatter p0,long p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       int i1;
       long l;
       if (PatchProxy.applyVoid(null, this, SlideStageScatter$c.class, "1")) {
          return;
       }
       SlideStageScatter$c tb = this.b;
       SlideStageScatter$c tc = this.c;
       Objects.requireNonNull(tb);
       SlideStageScatter slideStageSc = SlideStageScatter.class;
       if (!PatchProxy.isSupport(slideStageSc) || !PatchProxy.applyVoidOneRefs(Long.valueOf(tc), tb, slideStageSc, "10")) {
          DispatchLogger.d.j("slideStageScatter", "cancelStageTaskByBatchId before: "+tb.o().size());
          j oj = tb.o();
          _monitor_enter(oj);
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = tb.o().iterator();
          int i = 0;
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             Object obj1 = obj;
             if (!obj1.b() - tc && obj1.g() instanceof l) {
                i = 1;
             }
             if (i) {
                uArrayList.add(obj);
             }
          }
          _monitor_exit(oj);
          j obj2 = PatchProxy.applyOneRefs(uArrayList, tb, slideStageSc, "11");
          boolean b = Integer.MAX_VALUE;
          if (obj2 != PatchProxyResult.class) {
             i1 = obj2.intValue();
          }else {
             Iterator iterator2 = uArrayList.iterator();
             int i2 = Integer.MAX_VALUE;
             while (iterator2.hasNext()) {
                v ov1 = iterator2.next().g();
                Objects.requireNonNull(ov1, "null cannot be cast to non-null type com.kwai.component.taskdispatcher.Periodical");
                int stage = ov1.getStage();
                if (stage > 0) {
                   i2 = q.u(i2, stage);
                }
             }
             i1 = i2;
          }
          if (i1 != b) {
             Iterator iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                v ov = iterator1.next().g();
                Objects.requireNonNull(ov, "null cannot be cast to non-null type com.kwai.component.taskdispatcher.Periodical");
                b = (ov.b(i1) < 0)? true: false;
                if (b) {
                   iterator1.remove();
                }
             }
             obj2 = tb.o();
             _monitor_enter(obj2);
             tb.o().removeAll(uArrayList);
             iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                q oq = iterator1.next();
                l = oq.d();
                long l1 = l >> 32;
                l = l ^ l1;
                tb.n().removeMessages((int)l);
                oq.h();
             }
             _monitor_exit(obj2);
          }
          DispatchLogger.d.j("slideStageScatter", "cancelStageTaskByBatchId after: "+tb.o().size());
       }
       return;
    }
}
