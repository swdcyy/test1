package com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$c;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$f;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import qi9.q1;
import q87.c;
import com.kwai.camerasdk.encoder.MediaCodecAvailabilityChecker;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$e;
import java.lang.Throwable;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$b;

public class HardwareEncodeTestService$c extends HardwareEncodeTestService$f	// class@00100b
{
    public final HardwareEncodeTestService i;

    public void HardwareEncodeTestService$c(HardwareEncodeTestService p0,String p1){
       this.i = p0;
       super(p0, p1);
    }
    public void c(){
       int i;
       String str = "RecorderCompatibility";
       if (PatchProxy.applyVoid(null, this, HardwareEncodeTestService$c.class, "1")) {
          return;
       }
       System.currentTimeMillis();
       try{
          i = 0;
          Object[] objArray = new Object[i];
          q1.C().w(str, "start GLEncodeTest 540p", objArray);
          long l = MediaCodecAvailabilityChecker.a(544, 960);
          if (this.b == null) {
             this.e(l);
          }
       }catch(com.kwai.camerasdk.encoder.MediaCodecAvailabilityChecker$EncodeTooSlowException e1){
          Object[] objArray1 = new Object[i];
          q1.C().u(str, e1, objArray1);
          new HardwareEncodeTestService$b(this.i, "hardware-encode-360p-test").g();
          this.c = i;
       }
       return;
    }
    public int h(){
       return 540;
    }
}
