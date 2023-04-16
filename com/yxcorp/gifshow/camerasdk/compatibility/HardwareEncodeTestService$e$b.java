package com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$e$b;
import java.lang.Thread;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$e;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$a;

public class HardwareEncodeTestService$e$b extends Thread	// class@00100e
{
    public final HardwareEncodeTestService$e b;

    public void HardwareEncodeTestService$e$b(HardwareEncodeTestService$e p0,String p1){
       this.b = p0;
       super(p1);
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HardwareEncodeTestService$e$b.class, "1")) {
          return;
       }
       long l = 0x3a98;
       try{
          Thread.sleep(l);
       }catch(java.lang.InterruptedException e0){
       }
       if (this.b.a == null) {
          this.b.b = true;
          this.b.f(e0);
          if (this.b.c != null) {
             HardwareEncodeTestService$e$b tb = this.b;
             tb.g.b.c(tb);
          }
       }
       return;
    }
}
