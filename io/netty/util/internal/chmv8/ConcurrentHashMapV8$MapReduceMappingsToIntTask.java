package io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceMappingsToIntTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$t;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$m;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Object;
import java.lang.Integer;

public final class ConcurrentHashMapV8$MapReduceMappingsToIntTask extends ConcurrentHashMapV8$BulkTask	// class@00113b
{
    public final int basis;
    public ConcurrentHashMapV8$MapReduceMappingsToIntTask nextRight;
    public final ConcurrentHashMapV8$m reducer;
    public int result;
    public ConcurrentHashMapV8$MapReduceMappingsToIntTask rights;
    public final ConcurrentHashMapV8$t transformer;

    public void ConcurrentHashMapV8$MapReduceMappingsToIntTask(ConcurrentHashMapV8$BulkTask p0,int p1,int p2,int p3,ConcurrentHashMapV8$r[] p4,ConcurrentHashMapV8$MapReduceMappingsToIntTask p5,ConcurrentHashMapV8$t p6,int p7,ConcurrentHashMapV8$m p8){
       super(p0, p1, p2, p3, p4);
       this.nextRight = p5;
       this.transformer = p6;
       this.basis = p7;
       this.reducer = p8;
    }
    public final void compute(){
       ConcurrentHashMapV8$MapReduceMappingsToIntTask ttransformer = this.transformer;
       if (ttransformer != null) {
          ConcurrentHashMapV8$MapReduceMappingsToIntTask treducer = this.reducer;
          if (treducer != null) {
             ConcurrentHashMapV8$MapReduceMappingsToIntTask tbasis = this.basis;
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
                   ConcurrentHashMapV8$MapReduceMappingsToIntTask mapReduceMap = new ConcurrentHashMapV8$MapReduceMappingsToIntTask(this, i3, i2, tbaseLimit, this.tab, this.rights, ttransformer, tbasis, treducer);
                   this.rights = v14;
                   v14.fork();
                }else {
                   break ;
                }
             }
             ConcurrentHashMapV8$r or = this.advance();
             while (or != null) {
                tbasis = treducer.a(tbasis, ttransformer.a(or.c, or.d));
             }
             this.result = tbasis;
             for (CountedCompleter uCountedComp = this.firstComplete(); uCountedComp != null; uCountedComp = uCountedComp.nextComplete()) {
                CountedCompleter uCountedComp1 = uCountedComp;
                ConcurrentHashMapV8$MapReduceMappingsToIntTask rights = uCountedComp1.rights;
                while (rights != null) {
                   uCountedComp1.result = treducer.a(uCountedComp1.result, rights.result);
                   rights = rights.nextRight;
                   uCountedComp1.rights = rights;
                }
             }
          }
       }
       return;
    }
    public final Integer getRawResult(){
       return Integer.valueOf(this.result);
    }
    public Object getRawResult(){
       return this.getRawResult();
    }
}
