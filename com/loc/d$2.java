package com.loc.d$2;
import android.content.ServiceConnection;
import com.loc.d;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import android.os.Messenger;
import java.lang.Throwable;
import java.lang.String;
import com.loc.fj;

public final class d$2 implements ServiceConnection	// class@0013d4
{
    public final d a;

    public void d$2(d p0){
       this.a = p0;
       super();
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       p0.k = new Messenger(p1);
       d.a(this.a, true);
       p0.t = true;
    }
    public final void onServiceDisconnected(ComponentName p0){
       d$2 ta = this.a;
       ta.k = null;
       d.a(ta, false);
    }
}
