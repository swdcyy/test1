package r87.p$a;
import java.lang.Thread;
import r87.p;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.util.concurrent.BlockingQueue;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import r87.m;
import java.io.File;
import r87.g;
import java.util.Iterator;
import q87.d;
import r87.w;
import r87.c;
import r87.z$a;
import android.os.Handler;
import android.os.Message;

public class p$a extends Thread	// class@002327
{
    public final p b;

    public void p$a(p p0){
       this.b = p0;
       super();
    }
    public void run(){
       LinkedList linkedList;
       while (true) {
          int i = 0;
          break ;
       }
       try{
          linkedList = this.b.i.poll(1000, TimeUnit.MILLISECONDS);
       }catch(java.lang.InterruptedException e0){
       }
       if (e0 == null) {
          this.b.h.lock();
          p g = this.b.g;
          if (g != null && g.size() > 0) {
             p$a tb = this.b;
             g = tb.g;
             tb.g = m.a().b();
             linkedList = g;
          }
          this.b.h.unlock();
          if (this.b.k != null) {
             return;
          }
       }
       if (linkedList != null) {
          p$a tb1 = this.b;
          boolean b = false;
          if (tb1.o != null) {
             tb1.l.h();
             this.b.o = b;
          }
          Iterator iterator = linkedList.iterator();
          while (iterator.hasNext()) {
             d uod = iterator.next();
             p c = this.b.c;
             byte[] uobyteArray = c.i.a(uod);
             c.f(uobyteArray, uobyteArray.length, uod.d);
          }
          tb1 = this.b;
          if (tb1.p != null) {
             p e = tb1.e;
             if (e != null) {
                tb1.e.sendMessage(Message.obtain(e, 13, tb1.c.c()));
             }
             this.b.p = b;
          }
          linkedList.clear();
          m om = m.a();
          m a = om.a;
          _monitor_enter(a);
          if (om.a.size() >= 10) {
             _monitor_exit(a);
          }else {
             om.a.add(linkedList);
             _monitor_exit(a);
             goto label_0000 ;
          }
       }else {
          goto label_0000 ;
       }
    }
}
