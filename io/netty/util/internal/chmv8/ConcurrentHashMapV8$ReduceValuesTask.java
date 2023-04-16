package io.netty.util.internal.chmv8.ConcurrentHashMapV8$ReduceValuesTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$e;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Object;

public final class ConcurrentHashMapV8$ReduceValuesTask extends ConcurrentHashMapV8$BulkTask	// class@001143
{
    public ConcurrentHashMapV8$ReduceValuesTask nextRight;
    public final ConcurrentHashMapV8$e reducer;
    public Object result;
    public ConcurrentHashMapV8$ReduceValuesTask rights;

    public void ConcurrentHashMapV8$ReduceValuesTask(ConcurrentHashMapV8$BulkTask p0,int p1,int p2,int p3,ConcurrentHashMapV8$r[] p4,ConcurrentHashMapV8$ReduceValuesTask p5,ConcurrentHashMapV8$e p6){
       super(p0, p1, p2, p3, p4);
       this.nextRight = p5;
       this.reducer = p6;
    }
    public final void compute(){
       ConcurrentHashMapV8$ReduceValuesTask treducer = this.reducer;
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
                ConcurrentHashMapV8$ReduceValuesTask reduceValues = new ConcurrentHashMapV8$ReduceValuesTask(this, i3, i2, tbaseLimit, this.tab, this.rights, treducer);
                this.rights = v10;
                v10.fork();
             }else {
                break ;
             }
          }
          ConcurrentHashMapV8$r or = null;
          ConcurrentHashMapV8$r or1 = this.advance();
          while (or1 != null) {
             or1 = or1.d;
             if (or == null) {
                or = or1;
             }else {
                or = treducer.a(or, or1);
             }
          }
          this.result = or;
          for (CountedCompleter uCountedComp = this.firstComplete(); uCountedComp != null; uCountedComp = uCountedComp.nextComplete()) {
             CountedCompleter uCountedComp1 = uCountedComp;
             ConcurrentHashMapV8$ReduceValuesTask rights = uCountedComp1.rights;
             while (rights != null) {
                ConcurrentHashMapV8$ReduceValuesTask result = rights.result;
                if (result != null) {
                   ConcurrentHashMapV8$ReduceValuesTask result1 = uCountedComp1.result;
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
