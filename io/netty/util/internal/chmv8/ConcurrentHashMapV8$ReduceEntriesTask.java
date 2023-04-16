package io.netty.util.internal.chmv8.ConcurrentHashMapV8$ReduceEntriesTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$e;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Object;
import java.util.Map$Entry;

public final class ConcurrentHashMapV8$ReduceEntriesTask extends ConcurrentHashMapV8$BulkTask	// class@001141
{
    public ConcurrentHashMapV8$ReduceEntriesTask nextRight;
    public final ConcurrentHashMapV8$e reducer;
    public Map$Entry result;
    public ConcurrentHashMapV8$ReduceEntriesTask rights;

    public void ConcurrentHashMapV8$ReduceEntriesTask(ConcurrentHashMapV8$BulkTask p0,int p1,int p2,int p3,ConcurrentHashMapV8$r[] p4,ConcurrentHashMapV8$ReduceEntriesTask p5,ConcurrentHashMapV8$e p6){
       super(p0, p1, p2, p3, p4);
       this.nextRight = p5;
       this.reducer = p6;
    }
    public final void compute(){
       ConcurrentHashMapV8$ReduceEntriesTask treducer = this.reducer;
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
                ConcurrentHashMapV8$ReduceEntriesTask reduceEntrie = new ConcurrentHashMapV8$ReduceEntriesTask(this, i3, i2, tbaseLimit, this.tab, this.rights, treducer);
                this.rights = v10;
                v10.fork();
             }else {
                break ;
             }
          }
          ConcurrentHashMapV8$r or = null;
          ConcurrentHashMapV8$r or1 = this.advance();
          while (or1 != null) {
             if (or == null) {
                or = or1;
             }else {
                or = treducer.a(or, or1);
             }
          }
          this.result = or;
          for (CountedCompleter uCountedComp = this.firstComplete(); uCountedComp != null; uCountedComp = uCountedComp.nextComplete()) {
             CountedCompleter uCountedComp1 = uCountedComp;
             ConcurrentHashMapV8$ReduceEntriesTask rights = uCountedComp1.rights;
             while (rights != null) {
                ConcurrentHashMapV8$ReduceEntriesTask result = rights.result;
                if (result != null) {
                   ConcurrentHashMapV8$ReduceEntriesTask result1 = uCountedComp1.result;
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
    public Object getRawResult(){
       return this.getRawResult();
    }
    public final Map$Entry getRawResult(){
       return this.result;
    }
}
