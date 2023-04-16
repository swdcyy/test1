package com.yxcorp.gifshow.message_camera.effect.worker.Worker;
import kib.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.message_camera.effect.worker.Worker$handlerThread$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kib.b;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.Long;
import android.os.HandlerThread;
import com.kwai.robust.PatchProxyResult;
import android.os.Looper;

public final class Worker implements a	// class@001dd5
{
    public final p a;
    public Handler b;
    public boolean c;
    public final String d;

    public void Worker(String p0){
       a.p(p0, "name");
       super();
       this.d = p0;
       this.a = s.c(new Worker$handlerThread$2(this));
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Worker.class, "5")) {
          return;
       }
       a.p(p0, "task");
       Worker tb = this.b;
       if (tb != null) {
          tb.removeCallbacks(new b(p0));
       }
       return;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Worker.class, "4")) {
          return;
       }
       a.p(p0, "task");
       Worker tb = this.b;
       if (tb != null) {
          tb.postAtFrontOfQueue(new b(p0));
       }
       return;
    }
    public void c(a p0,Long p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Worker.class, "3")) {
          return;
       }
       a.p(p0, "task");
       Worker tb = this.b;
       if (tb != null) {
          b uob = new b(p0);
          long l = (p1 != null)? p1.longValue(): 0;
          tb.postDelayed(uob, l);
       }
       return;
    }
    public void cancelAll(){
       if (PatchProxy.applyVoid(null, this, Worker.class, "6")) {
          return;
       }
       Worker tb = this.b;
       if (tb != null) {
          tb.removeCallbacksAndMessages(null);
       }
       return;
    }
    public final HandlerThread d(){
       Object obj = PatchProxy.apply(null, this, Worker.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, Worker.class, "2")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       this.c = true;
       this.d().start();
       this.b = new Handler(this.d().getLooper());
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, Worker.class, "7")) {
          return;
       }
       this.d().quit();
       return;
    }
}
