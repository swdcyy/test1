package com.kwai.plugin.dva.hook.component.service.ProxyService$a$a;
import java.lang.Runnable;
import com.kwai.plugin.dva.hook.component.service.ProxyService$a;
import android.os.IBinder;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ProxyService$a$a implements Runnable	// class@001337
{
    public final IBinder[] b;
    public final int c;
    public final Intent d;
    public final CountDownLatch e;
    public final ProxyService$a f;

    public void ProxyService$a$a(ProxyService$a p0,IBinder[] p1,int p2,Intent p3,CountDownLatch p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ProxyService$a$a.class, "1")) {
          return;
       }
       this.b[0] = this.f.M1(this.c, this.d);
       this.e.countDown();
       return;
    }
}
