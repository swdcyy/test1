package io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceEntriesToLongTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$x;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$p;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Object;
import java.lang.Long;

public final class ConcurrentHashMapV8$MapReduceEntriesToLongTask extends ConcurrentHashMapV8$BulkTask	// class@001134
{
    public final long basis;
    public ConcurrentHashMapV8$MapReduceEntriesToLongTask nextRight;
    public final ConcurrentHashMapV8$p reducer;
    public long result;
    public ConcurrentHashMapV8$MapReduceEntriesToLongTask rights;
    public final ConcurrentHashMapV8$x transformer;

    public void ConcurrentHashMapV8$MapReduceEntriesToLongTask(ConcurrentHashMapV8$BulkTask p0,int p1,int p2,int p3,ConcurrentHashMapV8$r[] p4,ConcurrentHashMapV8$MapReduceEntriesToLongTask p5,ConcurrentHashMapV8$x p6,long p7,ConcurrentHashMapV8$p p8){
       super(p0, p1, p2, p3, p4);
       this.nextRight = p5;
       this.transformer = p6;
       this.basis = p7;
       this.reducer = p8;
    }
    public final void compute(){
       ConcurrentHashMapV8$MapReduceEntriesToLongTask mapReduceEnt = this;
       ConcurrentHashMapV8$MapReduceEntriesToLongTask transformer = mapReduceEnt.transformer;
       if (transformer != null) {
          ConcurrentHashMapV8$MapReduceEntriesToLongTask reducer = mapReduceEnt.reducer;
          if (reducer != null) {
             ConcurrentHashMapV8$MapReduceEntriesToLongTask basis = mapReduceEnt.basis;
             ConcurrentHashMapV8$BulkTask baseIndex = mapReduceEnt.baseIndex;
             while (mapReduceEnt.batch > null) {
                ConcurrentHashMapV8$BulkTask baseLimit = mapReduceEnt.baseLimit;
                int i = baseLimit + baseIndex;
                int i1 = 1;
                int i2 = i >> 1;
                if (i2 > baseIndex) {
                   mapReduceEnt.addToPendingCount(i1);
                   int i3 = mapReduceEnt.batch >> 1;
                   mapReduceEnt.batch = i3;
                   mapReduceEnt.baseLimit = i2;
                   ConcurrentHashMapV8$MapReduceEntriesToLongTask mapReduceEnt1 = v8;
                   transformer = v8;
                   mapReduceEnt1 = new ConcurrentHashMapV8$MapReduceEntriesToLongTask(this, i3, i2, baseLimit, mapReduceEnt.tab, mapReduceEnt.rights, transformer, basis, reducer);
                   mapReduceEnt.rights = transformer;
                   transformer.fork();
                   transformer = transformer;
                   baseIndex = baseIndex;
                }else {
                   break ;
                }
             }
             ConcurrentHashMapV8$MapReduceEntriesToLongTask mapReduceEnt2 = transformer;
             ConcurrentHashMapV8$r or = this.advance();
             while (or != null) {
                basis = reducer.a(basis, mapReduceEnt2.apply(or));
             }
             mapReduceEnt.result = basis;
             for (CountedCompleter uCountedComp = this.firstComplete(); uCountedComp != null; uCountedComp = uCountedComp.nextComplete()) {
                CountedCompleter uCountedComp1 = uCountedComp;
                ConcurrentHashMapV8$MapReduceEntriesToLongTask rights = uCountedComp1.rights;
                while (rights != null) {
                   uCountedComp1.result = reducer.a(uCountedComp1.result, rights.result);
                   rights = rights.nextRight;
                   uCountedComp1.rights = rights;
                }
             }
          }
       }
       return;
    }
    public final Long getRawResult(){
       return Long.valueOf(this.result);
    }
    public Object getRawResult(){
       return this.getRawResult();
    }
}
