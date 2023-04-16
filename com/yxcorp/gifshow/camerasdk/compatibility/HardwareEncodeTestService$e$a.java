package com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$e$a;
import java.lang.Thread;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$e;
import java.lang.String;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qi9.q1;
import java.lang.Throwable;
import q87.c;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$a;

public class HardwareEncodeTestService$e$a extends Thread	// class@00100d
{
    public final HardwareEncodeTestService b;
    public final HardwareEncodeTestService$e c;

    public void HardwareEncodeTestService$e$a(HardwareEncodeTestService$e p0,String p1,HardwareEncodeTestService p2){
       this.c = p0;
       this.b = p2;
       super(p1);
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HardwareEncodeTestService$e$a.class, "1")) {
          return;
       }
       this.c.b();
       this.c.c();
       this.c.a();
       this.c.a = true;
       this.c.f.interrupt();
       try{
          int i = 5000;
          Thread.sleep(i);
       }catch(java.lang.InterruptedException e0){
          q1.C().e("RecorderCompatibility", "TestCompatibility", e0);
       }
       if (!this.c.g.b() && this.c.c != null) {
          HardwareEncodeTestService$e$a tc = this.c;
          tc.g.b.c(tc);
       }
       return;
    }
}
