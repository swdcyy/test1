package com.kuaishou.android.security.base.perf.g$a$a;
import java.lang.Runnable;
import com.kuaishou.android.security.base.perf.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import com.kuaishou.android.security.base.perf.a$a;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Exception;
import com.kuaishou.android.security.base.perf.e$b;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import com.kuaishou.android.security.base.perf.e;
import java.lang.InterruptedException;
import java.lang.Thread;

public class g$a$a implements Runnable	// class@000f01
{
    public final g$a a;

    public void g$a$a(g$a p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, g$a$a.class, "1")) {
          return;
       }
       int i = 100;
       int i1 = i - 1;
       while (i > 0) {
          i = 0;
          try{
             g$a.a(this.a).lock();
             g$a.b(this.a).await();
             g$a$a ta = this.a;
             ta.a(g$a.c(ta), g$a.d(this.a), g$a.e(this.a));
             g$a.d(this.a).set(i);
             g$a.a(this.a, 0);
             g$a.a(this.a).unlock();
             i = i1;
          }catch(java.lang.InterruptedException e0){
             e0.printStackTrace();
             Thread.currentThread().interrupt();
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
             e.a(e$b.f, b.i().j(), e1.getMessage(), i);
          }
       }
    }
}
