package io.netty.util.internal.chmv8.ConcurrentHashMapV8$SearchEntriesTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$l;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ForkJoinTask;

public final class ConcurrentHashMapV8$SearchEntriesTask extends ConcurrentHashMapV8$BulkTask	// class@001144
{
    public final AtomicReference result;
    public final ConcurrentHashMapV8$l searchFunction;

    public void ConcurrentHashMapV8$SearchEntriesTask(ConcurrentHashMapV8$BulkTask p0,int p1,int p2,int p3,ConcurrentHashMapV8$r[] p4,ConcurrentHashMapV8$l p5,AtomicReference p6){
       super(p0, p1, p2, p3, p4);
       this.searchFunction = p5;
       this.result = p6;
    }
    public final void compute(){
       ConcurrentHashMapV8$SearchEntriesTask tsearchFunct = this.searchFunction;
       if (tsearchFunct != null) {
          ConcurrentHashMapV8$SearchEntriesTask tresult = this.result;
          if (tresult != null) {
             ConcurrentHashMapV8$BulkTask tbaseIndex = this.baseIndex;
             while (true) {
                if (this.batch > null) {
                   ConcurrentHashMapV8$BulkTask tbaseLimit = this.baseLimit;
                   int i = tbaseLimit + tbaseIndex;
                   int i1 = 1;
                   int i2 = i >> 1;
                   if (i2 > tbaseIndex) {
                      if (tresult.get() != null) {
                         return;
                      }else {
                         this.addToPendingCount(i1);
                         int i3 = this.batch >> 1;
                         this.batch = i3;
                         this.baseLimit = i2;
                         ConcurrentHashMapV8$SearchEntriesTask searchEntrie = new ConcurrentHashMapV8$SearchEntriesTask(this, i3, i2, tbaseLimit, this.tab, tsearchFunct, tresult);
                         v11.fork();
                      }
                   }else {
                      while (tresult.get() == null) {
                         ConcurrentHashMapV8$r or = this.advance();
                         if (or == null) {
                            this.propagateCompletion();
                            break ;
                         }
                         Object obj = tsearchFunct.apply(or);
                      }
                   }
                }else {
                   continue ;
                }
             }
          }
       }
       return;
    }
    public final Object getRawResult(){
       return this.result.get();
    }
}
