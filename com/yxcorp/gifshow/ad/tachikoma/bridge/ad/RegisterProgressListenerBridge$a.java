package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterProgressListenerBridge$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterProgressListenerBridge;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class RegisterProgressListenerBridge$a implements Runnable	// class@00181a
{
    public final RegisterProgressListenerBridge b;

    public void RegisterProgressListenerBridge$a(RegisterProgressListenerBridge p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, RegisterProgressListenerBridge$a.class, "1")) {
          return;
       }
       this.b.j();
       return;
    }
}
