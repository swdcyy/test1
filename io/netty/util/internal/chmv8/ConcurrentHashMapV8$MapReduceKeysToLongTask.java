package io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceKeysToLongTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$x;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$p;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Object;
import java.lang.Long;

public final class ConcurrentHashMapV8$MapReduceKeysToLongTask extends ConcurrentHashMapV8$BulkTask	// class@001138
{
    public final long basis;
    public ConcurrentHashMapV8$MapReduceKeysToLongTask nextRight;
    public final ConcurrentHashMapV8$p reducer;
    public long result;
    public ConcurrentHashMapV8$MapReduceKeysToLongTask rights;
    public final ConcurrentHashMapV8$x transformer;

    public void ConcurrentHashMapV8$MapReduceKeysToLongTask(ConcurrentHashMapV8$BulkTask p0,int p1,int p2,int p3,ConcurrentHashMapV8$r[] p4,ConcurrentHashMapV8$MapReduceKeysToLongTask p5,ConcurrentHashMapV8$x p6,long p7,ConcurrentHashMapV8$p p8){
       super(p0, p1, p2, p3, p4);
       this.nextRight = p5;
       this.transformer = p6;
       this.basis = p7;
       this.reducer = p8;
    }
    public final void compute(){
       ConcurrentHashMapV8$MapReduceKeysToLongTask mapReduceKey = this;
       ConcurrentHashMapV8$MapReduceKeysToLongTask transformer = mapReduceKey.transformer;
       if (transformer != null) {
          ConcurrentHashMapV8$MapReduceKeysToLongTask reducer = mapReduceKey.reducer;
          if (reducer != null) {
             ConcurrentHashMapV8$MapReduceKeysToLongTask basis = mapReduceKey.basis;
             ConcurrentHashMapV8$BulkTask baseIndex = mapReduceKey.baseIndex;
             while (mapReduceKey.batch > null) {
                ConcurrentHashMapV8$BulkTask baseLimit = mapReduceKey.baseLimit;
                int i = baseLimit + baseIndex;
                int i1 = 1;
                int i2 = i >> 1;
                if (i2 > baseIndex) {
                   mapReduceKey.addToPendingCount(i1);
                   int i3 = mapReduceKey.batch >> 1;
                   mapReduceKey.batch = i3;
                   mapReduceKey.baseLimit = i2;
                   ConcurrentHashMapV8$MapReduceKeysToLongTask mapReduceKey1 = v8;
                   transformer = v8;
                   mapReduceKey1 = new ConcurrentHashMapV8$MapReduceKeysToLongTask(this, i3, i2, baseLimit, mapReduceKey.tab, mapReduceKey.rights, transformer, basis, reducer);
                   mapReduceKey.rights = transformer;
                   transformer.fork();
                   transformer = transformer;
                   baseIndex = baseIndex;
                }else {
                   break ;
                }
             }
             ConcurrentHashMapV8$MapReduceKeysToLongTask mapReduceKey2 = transformer;
             ConcurrentHashMapV8$r or = this.advance();
             while (or != null) {
                basis = reducer.a(basis, mapReduceKey2.apply(or.c));
             }
             mapReduceKey.result = basis;
             for (CountedCompleter uCountedComp = this.firstComplete(); uCountedComp != null; uCountedComp = uCountedComp.nextComplete()) {
                CountedCompleter uCountedComp1 = uCountedComp;
                ConcurrentHashMapV8$MapReduceKeysToLongTask rights = uCountedComp1.rights;
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
