package com.vivo.push.m;
import android.os.Handler;
import android.os.Looper;
import android.os.HandlerThread;
import java.lang.String;
import com.vivo.push.n;
import com.vivo.push.l;
import com.vivo.push.util.p;
import android.os.Message;
import java.lang.Runnable;

public final class m	// class@001087
{
    public static final Handler a;
    public static final HandlerThread b;
    public static final Handler c;

    static {
       m.a = new Handler(Looper.getMainLooper());
       HandlerThread handlerThrea = new HandlerThread("push_client_thread");
       m.b = handlerThrea;
       handlerThrea.start();
       m.c = new n(handlerThrea.getLooper());
    }
    public static void a(l p0){
       if (p0 == null) {
          p.a("PushClientThread", "client thread error, task is null!");
          return;
       }else {
          Message message = new Message();
          message.what = p0.a();
          message.obj = p0;
          m.c.sendMessageDelayed(message, 0);
          return;
       }
    }
    public static void a(Runnable p0){
       Handler c = m.c;
       c.removeCallbacks(p0);
       c.postDelayed(p0, 0x3a98);
    }
    public static void b(Runnable p0){
       m.a.post(p0);
    }
    public static void c(Runnable p0){
       Handler c = m.c;
       if (c != null) {
          c.post(p0);
       }
       return;
    }
}
