package io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceMappingsToDoubleTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$s;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$h;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Object;
import java.lang.Double;

public final class ConcurrentHashMapV8$MapReduceMappingsToDoubleTask extends ConcurrentHashMapV8$BulkTask	// class@00113a
{
    public final double basis;
    public ConcurrentHashMapV8$MapReduceMappingsToDoubleTask nextRight;
    public final ConcurrentHashMapV8$h reducer;
    public double result;
    public ConcurrentHashMapV8$MapReduceMappingsToDoubleTask rights;
    public final ConcurrentHashMapV8$s transformer;

    public void ConcurrentHashMapV8$MapReduceMappingsToDoubleTask(ConcurrentHashMapV8$BulkTask p0,int p1,int p2,int p3,ConcurrentHashMapV8$r[] p4,ConcurrentHashMapV8$MapReduceMappingsToDoubleTask p5,ConcurrentHashMapV8$s p6,double p7,ConcurrentHashMapV8$h p8){
       super(p0, p1, p2, p3, p4);
       this.nextRight = p5;
       this.transformer = p6;
       this.basis = p7;
       this.reducer = p8;
    }
    public final void compute(){
       ConcurrentHashMapV8$MapReduceMappingsToDoubleTask mapReduceMap = this;
       ConcurrentHashMapV8$MapReduceMappingsToDoubleTask transformer = mapReduceMap.transformer;
       if (transformer != null) {
          ConcurrentHashMapV8$MapReduceMappingsToDoubleTask reducer = mapReduceMap.reducer;
          if (reducer != null) {
             ConcurrentHashMapV8$MapReduceMappingsToDoubleTask basis = mapReduceMap.basis;
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
                   ConcurrentHashMapV8$MapReduceMappingsToDoubleTask mapReduceMap1 = v8;
                   transformer = v8;
                   mapReduceMap1 = new ConcurrentHashMapV8$MapReduceMappingsToDoubleTask(this, i3, i2, baseLimit, mapReduceMap.tab, mapReduceMap.rights, transformer, basis, reducer);
                   mapReduceMap.rights = transformer;
                   transformer.fork();
                   transformer = transformer;
                   baseIndex = baseIndex;
                }else {
                   break ;
                }
             }
             ConcurrentHashMapV8$MapReduceMappingsToDoubleTask mapReduceMap2 = transformer;
             ConcurrentHashMapV8$r or = this.advance();
             while (or != null) {
                basis = reducer.a(basis, mapReduceMap2.a(or.c, or.d));
             }
             mapReduceMap.result = basis;
             for (CountedCompleter uCountedComp = this.firstComplete(); uCountedComp != null; uCountedComp = uCountedComp.nextComplete()) {
                CountedCompleter uCountedComp1 = uCountedComp;
                ConcurrentHashMapV8$MapReduceMappingsToDoubleTask rights = uCountedComp1.rights;
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
    public final Double getRawResult(){
       return Double.valueOf(this.result);
    }
    public Object getRawResult(){
       return this.getRawResult();
    }
}
