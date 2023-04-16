package ee.c;
import java.util.WeakHashMap;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import ee.e;
import java.util.Set;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.String;
import od.a;
import java.util.Map;
import ee.c$a;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import ee.a;
import com.facebook.react.common.LifecycleState;
import java.lang.IllegalStateException;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.lang.Class;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableMap;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.facebook.react.bridge.ReactSoftException;
import ee.d;
import java.util.Iterator;

public class c	// class@001f40
{
    public final WeakReference a;
    public final Set b;
    public final AtomicInteger c;
    public final Handler d;
    public final Set e;
    public final Map f;
    public final SparseArray g;
    public static final WeakHashMap h;

    static {
       c.h = new WeakHashMap();
    }
    public void c(ReactContext p0){
       super();
       this.b = new CopyOnWriteArraySet();
       this.c = new AtomicInteger(0);
       this.d = new Handler();
       this.e = new CopyOnWriteArraySet();
       this.f = new ConcurrentHashMap();
       this.g = new SparseArray();
       this.a = new WeakReference(p0);
    }
    public static c c(ReactContext p0){
       WeakHashMap h = c.h;
       c uoc = h.get(p0);
       if (uoc == null) {
          uoc = new c(p0);
          h.put(p0, uoc);
       }
       return uoc;
    }
    public void a(e p0){
       this.b.add(p0);
    }
    public synchronized void b(int p0){
       a.b(this.e.remove(Integer.valueOf(p0)), "Tried to finish non-existent task with id "+p0+".");
       boolean b = (this.f.remove(Integer.valueOf(p0)) != null)? true: false;
       a.b(b, "Tried to remove non-existent task config with id "+p0+".");
       this.g(p0);
       UiThreadUtil.runOnUiThread(new c$a(this, p0));
       return;
    }
    public boolean d(){
       boolean b = (this.e.size() > 0)? true: false;
       return b;
    }
    public synchronized boolean e(int p0){
       return this.e.contains(Integer.valueOf(p0));
    }
    public void f(e p0){
       this.b.remove(p0);
    }
    public final void g(int p0){
       Runnable runnable = this.g.get(p0);
       if (runnable != null) {
          this.d.removeCallbacks(runnable);
          this.g.remove(p0);
       }
       return;
    }
    public synchronized void h(a p0,int p1){
       UiThreadUtil.assertOnUiThread();
       Object obj = this.a.get();
       a.d(obj, "Tried to start a task on a react context that has already been destroyed");
       if (obj.getLifecycleState() == LifecycleState.RESUMED && !p0.d()) {
          throw new IllegalStateException("Tried to start task "+p0.b()+" while in foreground, but this is not allowed.");
       }
       this.e.add(Integer.valueOf(p1));
       this.f.put(Integer.valueOf(p1), new a(p0));
       if (obj.hasActiveCatalystInstance()) {
          obj.getJSModule(AppRegistry.class).startHeadlessTask(p1, p0.b(), p0.a());
       }else {
          ReactSoftException.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
       }
       if (p0.c() - null > 0) {
          d uod = new d(this, p1);
          this.g.append(p1, uod);
          this.d.postDelayed(uod, p0.c());
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().onHeadlessJsTaskStart(p1);
       }
       return;
    }
}
