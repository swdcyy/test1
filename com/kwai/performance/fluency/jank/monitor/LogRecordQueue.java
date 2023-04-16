package com.kwai.performance.fluency.jank.monitor.LogRecordQueue;
import com.kwai.performance.fluency.jank.monitor.LogRecordQueue$a;
import nsd.u;
import java.lang.Object;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import qrd.l1;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.performance.fluency.jank.monitor.LogRecordQueue$PackedRecord;

public final class LogRecordQueue	// class@00108c
{
    public final List a;
    public final ReentrantLock b;
    public final Condition c;
    public final List d;
    public boolean e;
    public static final LogRecordQueue$a f;

    static {
       LogRecordQueue.f = new LogRecordQueue$a(null);
    }
    public void LogRecordQueue(){
       super();
       this.a = new LinkedList();
       ReentrantLock reentrantLoc = new ReentrantLock();
       this.b = reentrantLoc;
       this.c = reentrantLoc.newCondition();
       this.d = new ArrayList();
    }
    public final void a(boolean p0){
       LogRecordQueue tb = this.b;
       tb.lock();
       this.e = p0;
       this.c.signal();
       tb.unlock();
    }
    public final void b(long p0){
       LogRecordQueue tb = this.b;
       tb.lock();
       LogRecordQueue$PackedRecord packedRecord = CollectionsKt___CollectionsKt.e3(this.a);
       if (packedRecord == null) {
          tb.unlock();
          return;
       }else {
          while (true) {
             if (packedRecord.getNow() - p0 < 0) {
                if (this.e != null) {
                   long l = p0 - packedRecord.getNow();
                   if (l - 0x7530 <= 0) {
                      this.c.await();
                      packedRecord = CollectionsKt___CollectionsKt.Y2(this.a);
                   }
                }
                break ;
             }else {
                tb.unlock();
                return;
             }
          }
          tb.unlock();
          return;
       }
    }
}
