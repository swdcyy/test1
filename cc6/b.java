package cc6.b;
import com.yxcorp.utility.SystemUtil;
import o56.a;
import android.content.Context;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pkd.a;
import mi5.a;
import java.lang.Boolean;
import java.lang.reflect.Method;
import t45.c;
import java.io.File;
import android.app.Application;
import ukd.a;
import android.os.Looper;
import java.lang.Long;
import java.lang.Exception;
import androidx.recyclerview.widget.RecyclerView;
import qkd.b;

public class b	// class@0003b0
{
    public static final boolean a;
    public static File b;

    static {
       boolean b = (SystemUtil.P() && SystemUtil.L(a.B))? true: false;
       b.a = b;
    }
    public void b(){
       super();
    }
    public static void a(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, uob, "2")) {
          return;
       }
       if (!a.i || (a.d == 0x1869f && !PatchProxy.applyVoid(objArray, objArray, a.class, "1"))) {
          Class[] uClassArray = new Class[]{Boolean.TYPE};
          Object[] objArray2 = new Object[]{Boolean.TRUE};
          Class.forName("android.os.Trace").getDeclaredMethod("setAppTracingAllowed", uClassArray).invoke(objArray, objArray2);
       }
    label_0045 :
       if (!b.a) {
          return;
       }else {
          c.j = false;
          try{
             String str = "com.yxcorp.gifshow.apm.TraceUtils";
             Object[] objArray1 = new Object[2];
             Object obj = PatchProxy.apply(objArray, objArray, uob, "3");
             b = (obj != patchProxyRe)? obj.booleanValue(): new File(a.b().getExternalFilesDir(objArray), "performance/startup/closeksaop").exists();
             b = (!b)? true: false;
             objArray1[0] = Boolean.valueOf(b);
             Object[] obj1 = PatchProxy.apply(objArray, objArray, uob, "4");
             boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): new File(a.b().getExternalFilesDir(objArray), "performance/startup/ksaopchecker").exists();
             objArray1[1] = Boolean.valueOf(b1);
             a.b(str, "updateTraceEnabled", objArray1);
             obj1 = new Object[]{Boolean.TRUE};
             a.b("android.os.Trace", "setAppTracingAllowed", obj1);
             objArray = new Object[]{Long.valueOf(8)};
             a.a(Looper.getMainLooper(), "setTraceTag", objArray);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          a.p(RecyclerView.class, "VERBOSE_TRACING", Boolean.TRUE);
          return;
       }
    }
    public static File b(){
       File obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.a && b.b == null) {
          obj = new File(a.B.getExternalCacheDir(), "trace");
          b.b = obj;
          if (obj.exists()) {
             b.b(b.b);
          }else {
             b.b.mkdirs();
          }
       }
       return b.b;
    }
}
