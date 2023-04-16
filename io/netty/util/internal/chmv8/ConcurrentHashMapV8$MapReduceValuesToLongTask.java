package io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceValuesToLongTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$x;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$p;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Object;
import java.lang.Long;

public final class ConcurrentHashMapV8$MapReduceValuesToLongTask extends ConcurrentHashMapV8$BulkTask	// class@001140
{
    public final long basis;
    public ConcurrentHashMapV8$MapReduceValuesToLongTask nextRight;
    public final ConcurrentHashMapV8$p reducer;
    public long result;
    public ConcurrentHashMapV8$MapReduceValuesToLongTask rights;
    public final ConcurrentHashMapV8$x transformer;

    public void ConcurrentHashMapV8$MapReduceValuesToLongTask(ConcurrentHashMapV8$BulkTask p0,int p1,int p2,int p3,ConcurrentHashMapV8$r[] p4,ConcurrentHashMapV8$MapReduceValuesToLongTask p5,ConcurrentHashMapV8$x p6,long p7,ConcurrentHashMapV8$p p8){
       super(p0, p1, p2, p3, p4);
       this.nextRight = p5;
       this.transformer = p6;
       this.basis = p7;
       this.reducer = p8;
    }
    public final void compute(){
       ConcurrentHashMapV8$MapReduceValuesToLongTask mapReduceVal = this;
       ConcurrentHashMapV8$MapReduceValuesToLongTask transformer = mapReduceVal.transformer;
       if (transformer != null) {
          ConcurrentHashMapV8$MapReduceValuesToLongTask reducer = mapReduceVal.reducer;
          if (reducer != null) {
             ConcurrentHashMapV8$MapReduceValuesToLongTask basis = mapReduceVal.basis;
             ConcurrentHashMapV8$BulkTask baseIndex = mapReduceVal.baseIndex;
             while (mapReduceVal.batch > null) {
                ConcurrentHashMapV8$BulkTask baseLimit = mapReduceVal.baseLimit;
                int i = baseLimit + baseIndex;
                int i1 = 1;
                int i2 = i >> 1;
                if (i2 > baseIndex) {
                   mapReduceVal.addToPendingCount(i1);
                   int i3 = mapReduceVal.batch >> 1;
                   mapReduceVal.batch = i3;
                   mapReduceVal.baseLimit = i2;
                   ConcurrentHashMapV8$MapReduceValuesToLongTask mapReduceVal1 = v8;
                   transformer = v8;
                   mapReduceVal1 = new ConcurrentHashMapV8$MapReduceValuesToLongTask(this, i3, i2, baseLimit, mapReduceVal.tab, mapReduceVal.rights, transformer, basis, reducer);
                   mapReduceVal.rights = transformer;
                   transformer.fork();
                   transformer = transformer;
                   baseIndex = baseIndex;
                }else {
                   break ;
                }
             }
             ConcurrentHashMapV8$MapReduceValuesToLongTask mapReduceVal2 = transformer;
             ConcurrentHashMapV8$r or = this.advance();
             while (or != null) {
                basis = reducer.a(basis, mapReduceVal2.apply(or.d));
             }
             mapReduceVal.result = basis;
             for (CountedCompleter uCountedComp = this.firstComplete(); uCountedComp != null; uCountedComp = uCountedComp.nextComplete()) {
                CountedCompleter uCountedComp1 = uCountedComp;
                ConcurrentHashMapV8$MapReduceValuesToLongTask rights = uCountedComp1.rights;
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
