package com.k.a.BService;
import android.app.Service;
import android.os.Messenger;
import android.os.Handler;
import f97.d;
import android.content.Intent;
import android.os.IBinder;
import com.k.a.BSProvider;
import java.util.concurrent.atomic.AtomicBoolean;
import com.k.a.BSProvider$a;
import gx7.k;
import dx7.f;
import com.k.a.BService$a;
import java.lang.Runnable;
import com.k.a.BService$b;

public abstract class BService extends Service	// class@0006ef
{
    public final Messenger b;

    public void BService(){
       super();
       this.b = new Messenger(d.a());
    }
    public abstract void a();
    public IBinder onBind(Intent p0){
       k.a.j();
       f.d.d();
       d.b(new BService$a(this, p0, BSProvider.d.a().getAndSet(false)));
       return this.b.getBinder();
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       k.a.j();
       f.d.d();
       d.b(new BService$b(this, p0, BSProvider.d.a().getAndSet(false)));
       return 2;
    }
}
