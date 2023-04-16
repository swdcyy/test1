package com.kwaishou.merchant.daccore.PendantEnvReadyLatch$b;
import io.reactivex.g;
import com.kwaishou.merchant.daccore.PendantEnvReadyLatch;
import java.lang.Object;
import brd.v;
import f08.f;
import java.lang.String;
import f08.f$a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;
import java.lang.Throwable;
import brd.g;

public final class PendantEnvReadyLatch$b implements g	// class@001300
{
    public final PendantEnvReadyLatch b;
    public final Object c;

    public void PendantEnvReadyLatch$b(PendantEnvReadyLatch p0,Object p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       try{
          f$a a = f.a;
          f$a.g(a, this.b.d(), "DAC wait for env ready", false, false, 12, null);
          boolean b = this.b.await(150, TimeUnit.SECONDS);
          if (this.b.b != null) {
             f$a.g(a, this.b.d(), "env is cancelWait", false, false, 12, null);
             return;
          }else if(!b){
             a.h(this.b.d(), "DAC env wait timeOut", null, true);
             return;
          }else {
             f$a.g(a, this.b.d(), "DAC env is ready", true, false, 8, null);
             PendantEnvReadyLatch$b tc = this.c;
             if (tc != null) {
                p0.onNext(tc);
             }
          }
       }catch(java.lang.InterruptedException e0){
          f$a.g(f.a, this.b.d(), "DAC waitForEnvReady interrupted", false, true, 4, null);
       }
       return;
    }
}
