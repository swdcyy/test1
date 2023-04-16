package com.vivo.push.q;
import java.lang.Object;
import android.os.HandlerThread;
import java.lang.Class;
import java.lang.String;
import com.vivo.push.q$a;
import android.os.Looper;
import android.content.Context;
import android.os.Message;
import java.lang.StringBuilder;
import java.lang.Thread;
import com.vivo.push.util.p;
import android.os.Handler;

public abstract class q	// class@001092
{
    public Context a;
    public Handler b;
    public final Object c;

    public void q(){
       super();
       this.c = new Object();
       HandlerThread handlerThrea = new HandlerThread(this.getClass().getSimpleName(), 1);
       handlerThrea.start();
       this.b = new q$a(this, handlerThrea.getLooper());
    }
    public final void a(Context p0){
       this.a = p0;
    }
    public final void a(Message p0){
       q tc = this.c;
       _monitor_enter(tc);
       q tb = this.b;
       if (tb == null) {
          p.e(this.getClass().getSimpleName(), "Dead worker dropping a message: "+p0.what+" \(Thread "+Thread.currentThread().getId()+"\)");
       }else {
          tb.sendMessage(p0);
       }
       _monitor_exit(tc);
       return;
    }
    public abstract void b(Message p0);
}
