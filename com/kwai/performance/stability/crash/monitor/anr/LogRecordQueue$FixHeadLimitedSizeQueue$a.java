package com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$FixHeadLimitedSizeQueue$a;
import java.util.Iterator;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$FixHeadLimitedSizeQueue;
import java.lang.Object;

public class LogRecordQueue$FixHeadLimitedSizeQueue$a implements Iterator	// class@00119b
{
    public int b;
    public Iterator c;
    public final LogRecordQueue$FixHeadLimitedSizeQueue d;

    public void LogRecordQueue$FixHeadLimitedSizeQueue$a(LogRecordQueue$FixHeadLimitedSizeQueue p0){
       this.d = p0;
       super();
       this.b = 0;
    }
    public boolean hasNext(){
       LogRecordQueue$FixHeadLimitedSizeQueue$a td = this.d;
       if (this.b < td.mHeader.length) {
          return true;
       }
       if (this.c == null) {
          this.c = LogRecordQueue$FixHeadLimitedSizeQueue.access$1301(td);
       }
       return this.c.hasNext();
    }
    public Object next(){
       LogRecordQueue$FixHeadLimitedSizeQueue$a tb = this.b;
       LogRecordQueue$FixHeadLimitedSizeQueue mHeader = this.d.mHeader;
       if (tb >= mHeader.length) {
          return this.c.next();
       }
       this.b = tb + 1;
       return mHeader[tb];
    }
}
