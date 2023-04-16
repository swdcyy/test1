package com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$b;
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

public class HardwareEncodeTestService$b extends HardwareEncodeTestService$f	// class@00100a
{
    public final HardwareEncodeTestService i;

    public void HardwareEncodeTestService$b(HardwareEncodeTestService p0,String p1){
       this.i = p0;
       super(p0, p1);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, HardwareEncodeTestService$b.class, "1")) {
          return;
       }
       System.currentTimeMillis();
       Object[] objArray = new Object[0];
       q1.C().w("RecorderCompatibility", "start GLEncodeTest 360p", objArray);
       long l = MediaCodecAvailabilityChecker.a(368, 640);
       if (this.b == null) {
          this.e(l);
       }
    label_0044 :
       return;
    }
    public int h(){
       return 360;
    }
}
