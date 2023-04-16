package io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceKeysToDoubleTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$v;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$h;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Object;
import java.lang.Double;

public final class ConcurrentHashMapV8$MapReduceKeysToDoubleTask extends ConcurrentHashMapV8$BulkTask	// class@001136
{
    public final double basis;
    public ConcurrentHashMapV8$MapReduceKeysToDoubleTask nextRight;
    public final ConcurrentHashMapV8$h reducer;
    public double result;
    public ConcurrentHashMapV8$MapReduceKeysToDoubleTask rights;
    public final ConcurrentHashMapV8$v transformer;

    public void ConcurrentHashMapV8$MapReduceKeysToDoubleTask(ConcurrentHashMapV8$BulkTask p0,int p1,int p2,int p3,ConcurrentHashMapV8$r[] p4,ConcurrentHashMapV8$MapReduceKeysToDoubleTask p5,ConcurrentHashMapV8$v p6,double p7,ConcurrentHashMapV8$h p8){
       super(p0, p1, p2, p3, p4);
       this.nextRight = p5;
       this.transformer = p6;
       this.basis = p7;
       this.reducer = p8;
    }
    public final void compute(){
       ConcurrentHashMapV8$MapReduceKeysToDoubleTask mapReduceKey = this;
       ConcurrentHashMapV8$MapReduceKeysToDoubleTask transformer = mapReduceKey.transformer;
       if (transformer != null) {
          ConcurrentHashMapV8$MapReduceKeysToDoubleTask reducer = mapReduceKey.reducer;
          if (reducer != null) {
             ConcurrentHashMapV8$MapReduceKeysToDoubleTask basis = mapReduceKey.basis;
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
                   ConcurrentHashMapV8$MapReduceKeysToDoubleTask mapReduceKey1 = v8;
                   transformer = v8;
                   mapReduceKey1 = new ConcurrentHashMapV8$MapReduceKeysToDoubleTask(this, i3, i2, baseLimit, mapReduceKey.tab, mapReduceKey.rights, transformer, basis, reducer);
                   mapReduceKey.rights = transformer;
                   transformer.fork();
                   transformer = transformer;
                   baseIndex = baseIndex;
                }else {
                   break ;
                }
             }
             ConcurrentHashMapV8$MapReduceKeysToDoubleTask mapReduceKey2 = transformer;
             ConcurrentHashMapV8$r or = this.advance();
             while (or != null) {
                basis = reducer.a(basis, mapReduceKey2.apply(or.c));
             }
             mapReduceKey.result = basis;
             for (CountedCompleter uCountedComp = this.firstComplete(); uCountedComp != null; uCountedComp = uCountedComp.nextComplete()) {
                CountedCompleter uCountedComp1 = uCountedComp;
                ConcurrentHashMapV8$MapReduceKeysToDoubleTask rights = uCountedComp1.rights;
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
