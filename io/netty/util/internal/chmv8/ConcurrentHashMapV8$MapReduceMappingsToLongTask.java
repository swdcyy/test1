package io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceMappingsToLongTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$u;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$p;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Object;
import java.lang.Long;

public final class ConcurrentHashMapV8$MapReduceMappingsToLongTask extends ConcurrentHashMapV8$BulkTask	// class@00113c
{
    public final long basis;
    public ConcurrentHashMapV8$MapReduceMappingsToLongTask nextRight;
    public final ConcurrentHashMapV8$p reducer;
    public long result;
    public ConcurrentHashMapV8$MapReduceMappingsToLongTask rights;
    public final ConcurrentHashMapV8$u transformer;

    public void ConcurrentHashMapV8$MapReduceMappingsToLongTask(ConcurrentHashMapV8$BulkTask p0,int p1,int p2,int p3,ConcurrentHashMapV8$r[] p4,ConcurrentHashMapV8$MapReduceMappingsToLongTask p5,ConcurrentHashMapV8$u p6,long p7,ConcurrentHashMapV8$p p8){
       super(p0, p1, p2, p3, p4);
       this.nextRight = p5;
       this.transformer = p6;
       this.basis = p7;
       this.reducer = p8;
    }
    public final void compute(){
       ConcurrentHashMapV8$MapReduceMappingsToLongTask mapReduceMap = this;
       ConcurrentHashMapV8$MapReduceMappingsToLongTask transformer = mapReduceMap.transformer;
       if (transformer != null) {
          ConcurrentHashMapV8$MapReduceMappingsToLongTask reducer = mapReduceMap.reducer;
          if (reducer != null) {
             ConcurrentHashMapV8$MapReduceMappingsToLongTask basis = mapReduceMap.basis;
             ConcurrentHashMapV8$BulkTask baseIndex = mapReduceMap.baseIndex;
             while (mapReduceMap.batch > null) {
                ConcurrentHashMapV8$BulkTask baseLimit = mapReduceMap.baseLimit;
                int i = baseLimit + baseIndex;
                int i1 = 1;
                int i2 = i >> 1;
                if (i2 > baseIndex) {
                   mapReduceMap.addToPendingCount(i1);
                   int i3 = mapReduceMap.batch >> 1;
                   mapReduceMap.batch = i3;
                   mapReduceMap.baseLimit = i2;
                   ConcurrentHashMapV8$MapReduceMappingsToLongTask mapReduceMap1 = v8;
                   transformer = v8;
                   mapReduceMap1 = new ConcurrentHashMapV8$MapReduceMappingsToLongTask(this, i3, i2, baseLimit, mapReduceMap.tab, mapReduceMap.rights, transformer, basis, reducer);
                   mapReduceMap.rights = transformer;
                   transformer.fork();
                   transformer = transformer;
                   baseIndex = baseIndex;
                }else {
                   break ;
                }
             }
             ConcurrentHashMapV8$MapReduceMappingsToLongTask mapReduceMap2 = transformer;
             ConcurrentHashMapV8$r or = this.advance();
             while (or != null) {
                basis = reducer.a(basis, mapReduceMap2.a(or.c, or.d));
             }
             mapReduceMap.result = basis;
             for (CountedCompleter uCountedComp = this.firstComplete(); uCountedComp != null; uCountedComp = uCountedComp.nextComplete()) {
                CountedCompleter uCountedComp1 = uCountedComp;
                ConcurrentHashMapV8$MapReduceMappingsToLongTask rights = uCountedComp1.rights;
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