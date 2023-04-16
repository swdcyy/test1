package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.CallAdBridge$a$a;
import java.lang.Runnable;
import a59.a;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.CallAdBridge$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class CallAdBridge$a$a implements Runnable	// class@00180b
{
    public final a b;
    public final CallAdBridge$a c;
    public final Object d;

    public void CallAdBridge$a$a(a p0,CallAdBridge$a p1,Object p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, CallAdBridge$a$a.class, "1")) {
          return;
       }
       this.b.a(this.d, this.c.c);
       PatchProxy.onMethodExit(CallAdBridge$a$a.class, "1");
       return;
    }
}
