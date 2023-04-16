package com.kwaishou.merchant.daccore.PendantEnvReadyLatch;
import java.util.concurrent.CountDownLatch;
import com.kwaishou.merchant.daccore.PendantEnvReadyLatch$a;
import nsd.u;
import com.kwaishou.merchant.daccore.PendantEnvReadyLatch$hasCountDownType$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwaishou.merchant.daccore.PendantEnvReadyLatch$singleThreadPoolExecutor$2;
import f08.f;
import f08.f$a;
import java.lang.String;
import java.lang.Object;
import t45.e;
import java.util.concurrent.ThreadPoolExecutor;
import f08.b;
import f08.b$a;
import java.lang.Throwable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import brd.t;
import com.kwaishou.merchant.daccore.PendantEnvReadyLatch$b;
import io.reactivex.g;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import t45.d;

public final class PendantEnvReadyLatch extends CountDownLatch	// class@001303
{
    public final p a;
    public boolean b;
    public String c;
    public final p d;
    public static final PendantEnvReadyLatch$a e;

    static {
       PendantEnvReadyLatch.e = new PendantEnvReadyLatch$a(null);
    }
    public void PendantEnvReadyLatch(int p0){
       super(p0);
       this.a = s.c(PendantEnvReadyLatch$hasCountDownType$2.INSTANCE);
       this.d = s.c(PendantEnvReadyLatch$singleThreadPoolExecutor$2.INSTANCE);
    }
    public final void a(){
       boolean b = true;
       try{
          this.b = b;
          long l = 0;
          if (this.getCount() - l > 0) {
             long count = this.getCount();
             while (l - count < 0) {
                this.countDown();
                l = l + 1;
             }
             f$a.g(f.a, this.c, "env actively cancel waiting", false, false, 12, null);
          }
          this.e().shutdown();
       }catch(java.lang.Exception e0){
          b$a.b(b.a, "cancelWait error", e0, null, 4, null);
       }
       return;
    }
    public synchronized final void b(String p0){
       if (this.c().contains(p0)) {
          return;
       }
       this.countDown();
       this.c().add(p0);
       return;
    }
    public final Set c(){
       return this.a.getValue();
    }
    public final String d(){
       return this.c;
    }
    public final e e(){
       return this.d.getValue();
    }
    public final boolean f(){
       boolean b1;
       BlockingQueue queue;
       boolean b = false;
       if (this.b != null) {
          return b;
       }
       int i = 1;
       try{
          e uoe = this.e();
          if (uoe != null) {
             queue = uoe.getQueue();
             if (queue != null) {
                b1 = queue.isEmpty();
             }else {
             label_0018 :
                b1 = true;
             }
          }else {
             goto label_0018 ;
          }
       }catch(java.lang.Exception e2){
          f.a.h(this.c, "singleThreadPoolExecutor queue get size error", e2, b);
          b1 = false;
       }
       if (this.getCount() <= 0 && b1) {
          b = true;
       }
       return b;
    }
    public final t g(Object p0){
       if (this.f()) {
          return t.just(p0);
       }
       return t.create(new PendantEnvReadyLatch$b(this, p0)).subscribeOn(b.b(this.e())).observeOn(d.a);
    }
}
