package com.loc.f;
import android.content.Context;
import java.lang.Object;
import com.loc.e;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Handler;
import com.loc.fq;
import java.lang.Throwable;
import java.lang.String;
import com.loc.fj;

public final class f	// class@001423
{
    public e a;
    public Context b;
    public Messenger c;

    public void f(Context p0){
       super();
       this.a = null;
       this.b = null;
       this.c = null;
       p0 = p0.getApplicationContext();
       this.b = p0;
       this.a = new e(p0);
    }
    public final IBinder a(Intent p0){
       this.a.b(p0);
       this.a.a(p0);
       Messenger messenger = new Messenger(this.a.b());
       this.c = messenger;
       return messenger.getBinder();
    }
    public final void a(){
       e.d();
       this.a.j = fq.b();
       this.a.k = fq.a();
       this.a.a();
    }
    public final void b(){
       f ta = this.a;
       if (ta != null) {
          ta.b().sendEmptyMessage(11);
       }
       return;
    }
}
