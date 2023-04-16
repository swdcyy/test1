package com.oplus.ocs.base.common.api.c;
import com.oplus.ocs.base.common.a;
import android.os.Looper;
import com.oplus.ocs.base.common.api.BaseClient;
import android.os.HandlerThread;
import java.lang.StringBuilder;
import java.lang.String;
import android.os.Message;
import com.oplus.ocs.base.utils.a;
import java.util.Queue;
import java.lang.Object;
import com.oplus.ocs.base.common.api.TaskListenerHolder;
import com.oplus.ocs.base.common.api.e;
import com.oplus.ocs.base.common.CapabilityInfo;
import com.oplus.ocs.base.common.api.i;
import com.oplus.ocs.base.common.api.j;
import android.os.Handler;

public class c extends a	// class@000ade
{
    public final String b;
    public BaseClient c;
    public static int a;

    public void c(Looper p0,BaseClient p1){
       super(p0);
       this.b = "c";
       this.c = p1;
    }
    public static synchronized c a(BaseClient p0){
       _monitor_enter(c.class);
       int a = c.a;
       c.a = a + 1;
       HandlerThread handlerThrea = new HandlerThread("base_client_"+a);
       handlerThrea.start();
       if (handlerThrea.getLooper() != null) {
          _monitor_exit(c.class);
          return new c(handlerThrea.getLooper(), p0);
       }else {
          _monitor_exit(c.class);
          return new c(Looper.getMainLooper(), p0);
       }
    }
    public void handleMessage(Message p0){
       c tc1;
       String a;
       Message what = p0.what;
       a.a(this.b, ("base client handler what ").concat(String.valueOf(what)));
       int i = 1;
       if (what != i) {
          if (what != 2) {
             if (what != 3) {
                if (what == 5) {
                   c tc = this.c;
                   while (tc.d.size() > 0) {
                      a.a(BaseClient.a, "handleQue");
                      tc.a(tc.d.poll());
                   }
                   a.a(BaseClient.a, "task queue is end");
                }
                return;
             }else {
                this.c.h.d();
                return;
             }
          }else {
             tc1 = this.c;
             p0 = p0.arg1;
             tc1.b = 4;
             tc1.disconnect();
             CapabilityInfo uCapabilityI = BaseClient.b(p0);
             tc1.c = uCapabilityI;
             BaseClient f = tc1.f;
             if (f != null) {
                f.a(uCapabilityI);
             }
             a.a(BaseClient.a, ("connect failed , error code is ").concat(String.valueOf(p0)));
             tc1.a(p0);
             BaseClient e = tc1.e;
             if (e != null) {
                e.a();
             }
             return;
          }
       }else {
          tc1 = this.c;
          p0 = p0.obj;
          a = BaseClient.a;
          a.b(a, "onAuthenticateSucceed");
          tc1.b = i;
          tc1.c = p0;
          BaseClient f1 = tc1.f;
          if (f1 != null) {
             f1.a(p0);
          }
          a.a(a, "handleAuthenticateSuccess");
          if (tc1.g == null) {
             tc1.a(null);
          }
          p0 = Message.obtain();
          p0.what = 100;
          tc1.g.sendMessage(p0);
          tc1.disconnect();
          return;
       }
    }
}
