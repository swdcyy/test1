package eq8.a;
import java.util.HashMap;
import java.lang.Object;
import eq8.a$c;
import com.tachikoma.core.component.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.tachikoma.core.bridge.d;
import java.lang.Throwable;
import wp8.a;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import iq8.o;
import java.lang.ref.WeakReference;
import eq8.a$a;
import java.lang.Runnable;

public class a	// class@00222c
{
    public static Executor a;
    public static Map b;

    static {
       a.b = new HashMap();
    }
    public void a(){
       super();
    }
    public static void a(a$c p0,e p1,Class p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "2")) {
          return;
       }
       if (p0.b() < 4) {
          View view = p1.prepareViewInstance();
          if (view != null) {
             _monitor_enter(p2);
             p0.a(view);
             _monitor_exit(p2);
             if (p0.b() < 4) {
                a.a(p0, p1, p2);
             }
          }
       }
       return;
    }
    public static Object b(e p0){
       Class obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getClass();
       Map b = a.b;
       _monitor_enter(b);
       a$c uoc = a.b.get(obj);
       if (uoc == null) {
          a.d(p0);
          _monitor_exit(b);
          return null;
       }else {
          _monitor_exit(b);
          _monitor_enter(obj);
          a.d(p0);
          _monitor_exit(obj);
          return uoc.q();
       }
    }
    public static Executor c(){
       a uoa = a.class;
       Object obj = PatchProxy.apply(null, null, uoa, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a == null) {
          _monitor_enter(uoa);
          if (a.a == null) {
             a.a = o.c("tk-new-component-thread", 1);
          }
          _monitor_exit(uoa);
       }
       return a.a;
    }
    public static void d(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "1")) {
          return;
       }
       if (p0.supportAsyncPrepareView()) {
          a.c().execute(new a$a(0, p0, new WeakReference(p0)));
       }
       return;
    }
}
