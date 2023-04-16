package io.netty.util.internal.chmv8.ConcurrentHashMapV8$ForEachEntryTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$b;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Object;

public final class ConcurrentHashMapV8$ForEachEntryTask extends ConcurrentHashMapV8$BulkTask	// class@001128
{
    public final ConcurrentHashMapV8$b action;

    public void ConcurrentHashMapV8$ForEachEntryTask(ConcurrentHashMapV8$BulkTask p0,int p1,int p2,int p3,ConcurrentHashMapV8$r[] p4,ConcurrentHashMapV8$b p5){
       super(p0, p1, p2, p3, p4);
       this.action = p5;
    }
    public final void compute(){
       ConcurrentHashMapV8$ForEachEntryTask taction = this.action;
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
                ConcurrentHashMapV8$ForEachEntryTask uForEachEntr = new ConcurrentHashMapV8$ForEachEntryTask(this, i3, i2, tbaseLimit, this.tab, taction);
                v9.fork();
             }else {
                break ;
             }
          }
          ConcurrentHashMapV8$r or = this.advance();
          while (or != null) {
             taction.apply(or);
          }
          this.propagateCompletion();
       }
       return;
    }
}
