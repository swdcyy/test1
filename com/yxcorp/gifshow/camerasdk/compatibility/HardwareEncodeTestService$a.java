package com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$a;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$e;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$f;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$g;
import java.util.Objects;
import qi9.q1;
import q87.c;
import android.app.Service;
import android.os.Process;
import java.lang.System;

public class HardwareEncodeTestService$a	// class@001009
{
    public boolean a;
    public boolean b;
    public final HardwareEncodeTestService c;

    public void HardwareEncodeTestService$a(HardwareEncodeTestService p0){
       this.c = p0;
       super();
       this.a = false;
       this.b = false;
    }
    public synchronized void a(){
       if (PatchProxy.applyVoid(null, this, HardwareEncodeTestService$a.class, "2")) {
          return;
       }
       this.a = true;
       this.d();
       return;
    }
    public synchronized void b(){
       if (PatchProxy.applyVoid(null, this, HardwareEncodeTestService$a.class, "3")) {
          return;
       }
       this.b = true;
       this.d();
       return;
    }
    public synchronized void c(HardwareEncodeTestService$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HardwareEncodeTestService$a.class, "4")) {
          return;
       }
       if (p0 instanceof HardwareEncodeTestService$f) {
          this.a();
       }
       if (p0 instanceof HardwareEncodeTestService$g) {
          this.b();
       }
       return;
    }
    public final void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HardwareEncodeTestService$a.class, "1")) {
          return;
       }
       if (this.a != null && this.b != null) {
          HardwareEncodeTestService$a tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(objArray, tc, HardwareEncodeTestService.class, "6")) {
             Object[] objArray1 = new Object[0];
             q1.C().w("RecorderCompatibility", "stopSelf", objArray1);
             tc.stopSelf();
             Process.killProcess(Process.myPid());
             System.exit(0);
          }
       }
       return;
    }
}
