package cc5.b;
import ub.a;
import cc5.b$a;
import nsd.u;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.image.network.OkHttpException;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import xp6.k;
import cc5.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.a0;
import cc5.b$b;
import cc5.b$c;
import erd.g;
import crd.b;

public class b extends a	// class@000699
{
    public static boolean b;
    public static boolean c;
    public static final b$a d;

    static {
       b.d = new b$a(null);
    }
    public void b(){
       super();
    }
    public void onFailure(String p0,Throwable p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       a.p(p0, "id");
       if (!b.b && !b.c) {
          b = false;
          b$c uoc = null;
          if (p1 != null) {
             Throwable cause = p1.getCause();
             if (cause != null) {
                if (!cause instanceof OkHttpException) {
                   cause = uoc;
                }
                if (cause != null && cause.code() == 401) {
                label_0047 :
                   b = true;
                label_0048 :
                   if (b) {
                      k.a("IMLogin token getRequest RefreshTokenListener");
                      b.b = true;
                      a.c.d(true, RequestTiming.DEFAULT).R(b$b.b, b$c.b);
                   }
                }
             }
          }
          if (p1 != null) {
             String message = p1.getMessage();
             if (message != null && StringsKt__StringsKt.O2(message, "code=401", b, 2, uoc) == true) {
                goto label_0047 ;
             }else {
                goto label_0048 ;
             }
          }else {
             goto label_0048 ;
          }
       }
    label_0060 :
       return;
    }
}
