package io.netty.util.internal.chmv8.ConcurrentHashMapV8$MapReduceMappingsTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$e;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Object;

public final class ConcurrentHashMapV8$MapReduceMappingsTask extends ConcurrentHashMapV8$BulkTask	// class@001139
{
    public ConcurrentHashMapV8$MapReduceMappingsTask nextRight;
    public final ConcurrentHashMapV8$e reducer;
    public Object result;
    public ConcurrentHashMapV8$MapReduceMappingsTask rights;
    public final ConcurrentHashMapV8$e transformer;

    public void ConcurrentHashMapV8$MapReduceMappingsTask(ConcurrentHashMapV8$BulkTask p0,int p1,int p2,int p3,ConcurrentHashMapV8$r[] p4,ConcurrentHashMapV8$MapReduceMappingsTask p5,ConcurrentHashMapV8$e p6,ConcurrentHashMapV8$e p7){
       super(p0, p1, p2, p3, p4);
       this.nextRight = p5;
       this.transformer = p6;
       this.reducer = p7;
    }
    public final void compute(){
       CountedCompleter obj1;
       ConcurrentHashMapV8$MapReduceMappingsTask ttransformer = this.transformer;
       if (ttransformer != null) {
          ConcurrentHashMapV8$MapReduceMappingsTask treducer = this.reducer;
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
                   ConcurrentHashMapV8$MapReduceMappingsTask mapReduceMap = new ConcurrentHashMapV8$MapReduceMappingsTask(this, i3, i2, tbaseLimit, this.tab, this.rights, ttransformer, treducer);
                   this.rights = v12;
                   v12.fork();
                }else {
                   break ;
                }
             }
             CountedCompleter obj = null;
             ConcurrentHashMapV8$r or = this.advance();
             while (or != null) {
                obj1 = ttransformer.a(or.c, or.d);
                if (obj1 != null) {
                   if (obj != null) {
                      obj1 = treducer.a(obj, obj1);
                   }
                   obj = obj1;
                }
             }
             this.result = obj;
             for (obj = this.firstComplete(); obj != null; obj = obj.nextComplete()) {
                obj1 = obj;
                ConcurrentHashMapV8$MapReduceMappingsTask rights = obj1.rights;
                while (rights != null) {
                   ConcurrentHashMapV8$MapReduceMappingsTask result = rights.result;
                   if (result != null) {
                      ConcurrentHashMapV8$MapReduceMappingsTask result1 = obj1.result;
                      if (result1 != null) {
                         result = treducer.a(result1, result);
                      }
                      obj1.result = result;
                   }
                   rights = rights.nextRight;
                   obj1.rights = rights;
                }
             }
          }
       }
       return;
    }
    public final Object getRawResult(){
       return this.result;
    }
}
