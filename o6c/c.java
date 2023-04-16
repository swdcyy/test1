package o6c.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ikc.a;
import com.kwai.android.common.intercept.Interceptor;
import com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor;
import com.kwai.android.dispatcher.KwaiPush;
import dna.a;
import java.lang.Boolean;
import vqa.k;
import pna.k;
import kotlin.jvm.internal.a;

public class c	// class@001fb1
{
    public static boolean a;
    public static boolean b;

    public void c(){
       super();
    }
    public static void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, c.class, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, a.class, "1")) {
          Interceptor[] interceptorA = new Interceptor[]{new DialogPushTypeInterceptor()};
          KwaiPush.addProcessInterceptor(interceptorA);
       }
       return;
    }
    public static void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, c.class, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, a.class, "1")) {
          Boolean tRUE = Boolean.TRUE;
          k b = k.b;
          Boolean fALSE = Boolean.FALSE;
          c.a = a.g(tRUE, b.b("KEY_CANCEL_CHANNEL_LIMIT", fALSE));
          c.b = a.g(tRUE, b.b("KEY_FORCE_REQUSET_CHANNEL_CONFIG", fALSE));
       }
       return;
    }
}
