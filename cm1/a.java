package cm1.a;
import em1.a0;
import java.lang.Object;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import em1.b;
import android.graphics.Bitmap;
import java.util.List;
import java.lang.Number;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;

public class a	// class@0004e6
{
    public static final b a;

    static {
       a.a = new a0();
    }
    public void a(){
       super();
    }
    public static Gift a(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a.a.s(p0);
    }
    public static Bitmap b(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a.a.u(p0, "getGiftIcon");
    }
    public static Bitmap c(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.h(p0, "getGiftIcon");
    }
    public static long d(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoa, "9");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return a.a.t(p0);
    }
    public static void e(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "11")) {
          return;
       }
       a.a.i(p0);
       return;
    }
    public static void f(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "1")) {
          return;
       }
       a.a.f(p0);
       return;
    }
    public t g(String p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a.a.o(p0, p1);
    }
}
