package d61.m;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import fg6.a;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import s66.a;
import com.google.gson.Gson;
import o56.a;
import k2b.u1;
import java.lang.RuntimeException;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.live.basic.utils.LiveBasicLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import retrofit2.HttpException;

public class m	// class@001f33
{

    public void m(){
       super();
    }
    public static void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, m.class, "2")) {
          return;
       }
       ClientEvent$ExceptionEvent uExceptionEv = new ClientEvent$ExceptionEvent();
       uExceptionEv.message = a.a.q(a.b(p0));
       uExceptionEv.type = 2;
       uExceptionEv.androidPatchBaseVersion = a.r;
       uExceptionEv.androidPatchVersion = a.o;
       u1.d0(uExceptionEv);
       return;
    }
    public static void b(RuntimeException p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, m.class, "1")) {
          return;
       }
       if (a.d()) {
          throw p0;
       }
       m.a(p0);
       return;
    }
    public static void c(Context p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, m.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (m.d(p1)) {
          ExceptionHandler.handleException(p0, p1);
       }else {
          b.I(LiveBasicLogTag.LIVE_EXCEPTION, "HttpException", p1);
       }
       return;
    }
    public static boolean d(Throwable p0){
       return (p0 instanceof HttpException ^ 0x01);
    }
}
