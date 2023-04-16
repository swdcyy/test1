package com.alipay.android.phone.mrpc.core.m;
import java.util.concurrent.FutureTask;
import com.alipay.android.phone.mrpc.core.l;
import java.util.concurrent.Callable;
import com.alipay.android.phone.mrpc.core.q;
import com.alipay.android.phone.mrpc.core.o;
import com.alipay.android.phone.mrpc.core.ac;
import com.alipay.android.phone.mrpc.core.t;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import com.alipay.android.phone.mrpc.core.HttpException;

public final class m extends FutureTask	// class@000e53
{
    public final q a;
    public final l b;

    public void m(l p0,Callable p1,q p2){
       this.b = p0;
       this.a = p2;
       super(p1);
    }
    public final void done(){
       o oo = this.a.a();
       if (oo.f() == null) {
          super.done();
          return;
       }else {
          try{
             this.get();
             if (this.isCancelled() || oo.h()) {
                oo.g();
                if (!this.isCancelled() || !this.isDone()) {
                   this.cancel(false);
                }
             }
             return;
          }catch(java.lang.InterruptedException e0){
             e0.toString();
             return;
          }catch(java.util.concurrent.ExecutionException e0){
             if (e0.getCause() != null && e0.getCause() instanceof HttpException) {
                HttpException cause = e0.getCause();
                cause.getCode();
                cause.getMsg();
                return;
             }else {
                e0.toString();
                return;
             }
          }catch(java.util.concurrent.CancellationException e0){
             e0.g();
             return;
          }
       }
    }
}
