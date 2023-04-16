package af7.c;
import af7.a;
import com.kwai.performance.fluency.jank.monitor.LogRecordQueue;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.SystemClock;
import java.util.Objects;
import java.lang.System;
import com.kwai.performance.fluency.jank.monitor.LogRecordQueue$PackedRecord;
import java.util.concurrent.locks.Lock;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.performance.fluency.jank.monitor.LogRecordQueue$b;
import java.util.concurrent.locks.Condition;
import qrd.l1;

public final class c extends a	// class@0000b8
{
    public final LogRecordQueue b;
    public final int c;
    public boolean d;
    public long e;
    public long f;
    public long g;
    public long h;

    public void c(LogRecordQueue p0,int p1){
       a.p(p0, "mLogQueue");
       super();
       this.b = p0;
       this.c = p1;
       this.e = SystemClock.currentThreadTimeMillis();
       this.f = SystemClock.elapsedRealtime();
       this.g = -1;
       this.h = -1;
    }
    public void a(long p0,long p1,long p2,String p3){
       c uoc = this;
       long l = p1;
       long l1 = p2;
       String str = p3;
       if (!str) {
          return;
       }
       int i = 0;
       boolean b = true;
       if (str.charAt(i) == '>') {
          uoc.d = b;
       }else if(str.charAt(i) == '<'){
          uoc.d = i;
       }
       if (uoc.d != null) {
          uoc.f = l;
          uoc.e = l1;
       }else {
          uoc.h = l;
          uoc.g = l1;
          c b1 = uoc.b;
          long l2 = l - uoc.f;
          long l3 = l1 - uoc.e;
          int i1 = (uoc.c & 0x02)? 1: 0;
          Objects.requireNonNull(b1);
          LogRecordQueue$PackedRecord packedRecord = new LogRecordQueue$PackedRecord();
          long l4 = System.currentTimeMillis();
          int i2 = packedRecord.logTypeFlag(p3, l2, 0, i1);
          int i3 = 0xffff0000 & i2;
          i2 = i2 & 0xffff;
          boolean b2 = ((0x40000000 & i3) || i1)? true: false;
          long l5 = (i3 & Integer.MIN_VALUE)? 1: 0;
          if (l5) {
             packedRecord = new LogRecordQueue$PackedRecord();
          }
          LogRecordQueue$PackedRecord packedRecord1 = packedRecord;
          if (i1) {
             i2 = i2 | 0x02;
          }
          packedRecord1.setNow(l4);
          LogRecordQueue$PackedRecord packedRecord2 = packedRecord1;
          packedRecord1.addRecord(l2, l3, p3, b2, i2);
          LogRecordQueue b3 = b1.b;
          b3.lock();
          b1.a.add(packedRecord2);
          while (b1.a.size() >= 100) {
             b1.a.remove(0);
          }
          Iterator iterator = b1.d.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(packedRecord2);
          }
          b1.c.signal();
          b3.unlock();
       }
       return;
    }
    public String b(){
       String str = (this.c & 0x02)? "JankIdlePrinter-Global": "JankMessagesPrinter-Global";
       return str;
    }
    public int c(){
       return this.c;
    }
}
