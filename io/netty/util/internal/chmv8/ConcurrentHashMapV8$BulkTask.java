package io.netty.util.internal.chmv8.ConcurrentHashMapV8$BulkTask;
import io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$k;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$a0;

public abstract class ConcurrentHashMapV8$BulkTask extends CountedCompleter	// class@001125
{
    public int baseIndex;
    public int baseLimit;
    public final int baseSize;
    public int batch;
    public int index;
    public ConcurrentHashMapV8$r next;
    public ConcurrentHashMapV8$r[] tab;

    public void ConcurrentHashMapV8$BulkTask(ConcurrentHashMapV8$BulkTask p0,int p1,int p2,int p3,ConcurrentHashMapV8$r[] p4){
       super(p0);
       this.batch = p1;
       this.baseIndex = p2;
       this.index = p2;
       this.tab = p4;
       if (p4 == null) {
          this.baseLimit = 0;
          this.baseSize = 0;
       }else if(p0 == null){
          int len = p4.length;
          this.baseLimit = len;
          this.baseSize = len;
       }else {
          this.baseLimit = p3;
          this.baseSize = p0.baseSize;
       }
       return;
    }
    public final ConcurrentHashMapV8$r advance(){
       ConcurrentHashMapV8$BulkTask tnext = this.next;
       if (tnext != null) {
          tnext = tnext.e;
       }
       while (true) {
          if (tnext != null) {
             this.next = tnext;
             return tnext;
          }else if(this.baseIndex < this.baseLimit){
             tnext = this.tab;
             if (tnext != null) {
                int len = tnext.length;
                ConcurrentHashMapV8$BulkTask tindex = this.index;
                if (len > tindex && tindex >= null) {
                   tnext = ConcurrentHashMapV8.tabAt(tnext, tindex);
                   if (tnext != null && tnext.b < null) {
                      if (tnext instanceof ConcurrentHashMapV8$k) {
                         this.tab = tnext.f;
                         tnext = null;
                      }else if(tnext instanceof ConcurrentHashMapV8$a0){
                         tnext = tnext.g;
                      }else {
                         tnext = null;
                      }
                   }
                   int i = this.index + this.baseSize;
                   this.index = i;
                   if (i >= len) {
                      len = this.baseIndex + 1;
                      this.baseIndex = len;
                      this.index = len;
                   }
                }
             }
          }
          break ;
       }
       this.next = null;
       return null;
    }
}
