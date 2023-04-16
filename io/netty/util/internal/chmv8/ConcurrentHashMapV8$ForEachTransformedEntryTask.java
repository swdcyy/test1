package io.netty.util.internal.chmv8.ConcurrentHashMapV8$ForEachTransformedEntryTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$l;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$b;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Object;

public final class ConcurrentHashMapV8$ForEachTransformedEntryTask extends ConcurrentHashMapV8$BulkTask	// class@00112b
{
    public final ConcurrentHashMapV8$b action;
    public final ConcurrentHashMapV8$l transformer;

    public void ConcurrentHashMapV8$ForEachTransformedEntryTask(ConcurrentHashMapV8$BulkTask p0,int p1,int p2,int p3,ConcurrentHashMapV8$r[] p4,ConcurrentHashMapV8$l p5,ConcurrentHashMapV8$b p6){
       super(p0, p1, p2, p3, p4);
       this.transformer = p5;
       this.action = p6;
    }
    public final void compute(){
       ConcurrentHashMapV8$ForEachTransformedEntryTask ttransformer = this.transformer;
       if (ttransformer != null) {
          ConcurrentHashMapV8$ForEachTransformedEntryTask taction = this.action;
          if (taction != null) {
             ConcurrentHashMapV8$BulkTask tbaseIndex = this.baseIndex;
             while (this.batch > null) {
                ConcurrentHashMapV8$BulkTask tbaseLimit = this.baseLimit;
                int i = tbaseLimit + tbaseIndex;
                int i1 = 1;
                int i2 = i >> 1;
                if (i2 > tbaseIndex) {
                   this.addToPendingCount(i1);
                   int i3 = this.batch >> 1;
                   this.batch = i3;
                   this.baseLimit = i2;
                   ConcurrentHashMapV8$ForEachTransformedEntryTask uForEachTran = new ConcurrentHashMapV8$ForEachTransformedEntryTask(this, i3, i2, tbaseLimit, this.tab, ttransformer, taction);
                   v11.fork();
                }else {
                   break ;
                }
             }
             ConcurrentHashMapV8$r or = this.advance();
             while (or != null) {
                Object obj = ttransformer.apply(or);
                if (obj != null) {
                   taction.apply(obj);
                }
             }
             this.propagateCompletion();
          }
       }
       return;
    }
}
