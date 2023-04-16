package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterProgressListenerBridge$c;
import java.lang.Runnable;
import a59.a;
import t59.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fg6.a;
import com.google.gson.Gson;
import a59.a$a;

public final class RegisterProgressListenerBridge$c implements Runnable	// class@00181c
{
    public final a b;
    public final b c;

    public void RegisterProgressListenerBridge$c(a p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, RegisterProgressListenerBridge$c.class, "1")) {
          return;
       }
       a$a.a(this.b, a.a.q(this.c), null, 2, null);
       return;
    }
}
