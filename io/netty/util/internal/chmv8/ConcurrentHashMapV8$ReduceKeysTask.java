package io.netty.util.internal.chmv8.ConcurrentHashMapV8$ReduceKeysTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$e;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Object;

public final class ConcurrentHashMapV8$ReduceKeysTask extends ConcurrentHashMapV8$BulkTask	// class@001142
{
    public ConcurrentHashMapV8$ReduceKeysTask nextRight;
    public final ConcurrentHashMapV8$e reducer;
    public Object result;
    public ConcurrentHashMapV8$ReduceKeysTask rights;

    public void ConcurrentHashMapV8$ReduceKeysTask(ConcurrentHashMapV8$BulkTask p0,int p1,int p2,int p3,ConcurrentHashMapV8$r[] p4,ConcurrentHashMapV8$ReduceKeysTask p5,ConcurrentHashMapV8$e p6){
       super(p0, p1, p2, p3, p4);
       this.nextRight = p5;
       this.reducer = p6;
    }
    public final void compute(){
       ConcurrentHashMapV8$ReduceKeysTask treducer = this.reducer;
       if (treducer != null) {
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
                ConcurrentHashMapV8$ReduceKeysTask reduceKeysTa = new ConcurrentHashMapV8$ReduceKeysTask(this, i3, i2, tbaseLimit, this.tab, this.rights, treducer);
                this.rights = v10;
                v10.fork();
             }else {
                break ;
             }
          }
          ConcurrentHashMapV8$r or = null;
          ConcurrentHashMapV8$r or1 = this.advance();
          while (or1 != null) {
             or1 = or1.c;
             if (or == null) {
                or = or1;
             }else if(or1 == null){
                continue ;
             }else {
                or = treducer.a(or, or1);
             }
          }
          this.result = or;
          for (CountedCompleter uCountedComp = this.firstComplete(); uCountedComp != null; uCountedComp = uCountedComp.nextComplete()) {
             CountedCompleter uCountedComp1 = uCountedComp;
             ConcurrentHashMapV8$ReduceKeysTask rights = uCountedComp1.rights;
             while (rights != null) {
                ConcurrentHashMapV8$ReduceKeysTask result = rights.result;
                if (result != null) {
                   ConcurrentHashMapV8$ReduceKeysTask result1 = uCountedComp1.result;
                   if (result1 != null) {
                      result = treducer.a(result1, result);
                   }
                   uCountedComp1.result = result;
                }
                rights = rights.nextRight;
                uCountedComp1.rights = rights;
             }
          }
       }
       return;
    }
    public final Object getRawResult(){
       return this.result;
    }
}
