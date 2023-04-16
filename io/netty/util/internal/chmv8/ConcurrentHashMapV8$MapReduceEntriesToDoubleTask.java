package io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceEntriesToDoubleTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$v;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$h;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Object;
import java.lang.Double;

public final class ConcurrentHashMapV8$MapReduceEntriesToDoubleTask extends ConcurrentHashMapV8$BulkTask	// class@001132
{
    public final double basis;
    public ConcurrentHashMapV8$MapReduceEntriesToDoubleTask nextRight;
    public final ConcurrentHashMapV8$h reducer;
    public double result;
    public ConcurrentHashMapV8$MapReduceEntriesToDoubleTask rights;
    public final ConcurrentHashMapV8$v transformer;

    public void ConcurrentHashMapV8$MapReduceEntriesToDoubleTask(ConcurrentHashMapV8$BulkTask p0,int p1,int p2,int p3,ConcurrentHashMapV8$r[] p4,ConcurrentHashMapV8$MapReduceEntriesToDoubleTask p5,ConcurrentHashMapV8$v p6,double p7,ConcurrentHashMapV8$h p8){
       super(p0, p1, p2, p3, p4);
       this.nextRight = p5;
       this.transformer = p6;
       this.basis = p7;
       this.reducer = p8;
    }
    public final void compute(){
       ConcurrentHashMapV8$MapReduceEntriesToDoubleTask mapReduceEnt = this;
       ConcurrentHashMapV8$MapReduceEntriesToDoubleTask transformer = mapReduceEnt.transformer;
       if (transformer != null) {
          ConcurrentHashMapV8$MapReduceEntriesToDoubleTask reducer = mapReduceEnt.reducer;
          if (reducer != null) {
             ConcurrentHashMapV8$MapReduceEntriesToDoubleTask basis = mapReduceEnt.basis;
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
                   ConcurrentHashMapV8$MapReduceEntriesToDoubleTask mapReduceEnt1 = v8;
                   transformer = v8;
                   mapReduceEnt1 = new ConcurrentHashMapV8$MapReduceEntriesToDoubleTask(this, i3, i2, baseLimit, mapReduceEnt.tab, mapReduceEnt.rights, transformer, basis, reducer);
                   mapReduceEnt.rights = transformer;
                   transformer.fork();
                   transformer = transformer;
                   baseIndex = baseIndex;
                }else {
                   break ;
                }
             }
             ConcurrentHashMapV8$MapReduceEntriesToDoubleTask mapReduceEnt2 = transformer;
             ConcurrentHashMapV8$r or = this.advance();
             while (or != null) {
                basis = reducer.a(basis, mapReduceEnt2.apply(or));
             }
             mapReduceEnt.result = basis;
             for (CountedCompleter uCountedComp = this.firstComplete(); uCountedComp != null; uCountedComp = uCountedComp.nextComplete()) {
                CountedCompleter uCountedComp1 = uCountedComp;
                ConcurrentHashMapV8$MapReduceEntriesToDoubleTask rights = uCountedComp1.rights;
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
