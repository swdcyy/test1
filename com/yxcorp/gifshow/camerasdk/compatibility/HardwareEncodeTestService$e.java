package com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$e;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$e$b;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$e$a;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Thread;

public abstract class HardwareEncodeTestService$e	// class@00100f
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final Thread e;
    public final Thread f;
    public final HardwareEncodeTestService g;

    public void HardwareEncodeTestService$e(HardwareEncodeTestService p0,String p1){
       this.g = p0;
       super();
       this.c = true;
       this.f = new HardwareEncodeTestService$e$b(this, "time-out-thread");
       this.e = new HardwareEncodeTestService$e$a(this, p1, p0);
    }
    public void a(){
    }
    public void b(){
    }
    public abstract void c();
    public abstract void d(Throwable p0,long p1);
    public abstract void e(long p0);
    public abstract void f(long p0);
    public synchronized void g(){
       if (PatchProxy.applyVoid(null, this, HardwareEncodeTestService$e.class, "1")) {
          return;
       }
       if (this.d != null) {
          return;
       }
       this.d = true;
       this.f.start();
       this.e.start();
       return;
    }
}
