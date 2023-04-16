package df.c;
import com.facebook.react.bridge.LifecycleEventListener;
import df.c$a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import android.util.LongSparseArray;
import java.util.HashMap;
import vd.d;
import df.c$b;
import java.util.ArrayList;
import df.c$c;
import java.util.concurrent.atomic.AtomicInteger;
import df.b;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.ReactEventEmitter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Arrays;
import df.f;
import od.a;
import java.util.Iterator;
import java.lang.Integer;
import java.lang.Short;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Map;
import java.util.Objects;
import df.e;
import java.lang.Runnable;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.bridge.UiThreadUtil;

public class c implements LifecycleEventListener	// class@001e4f
{
    public final Object b;
    public final Object c;
    public final ReactApplicationContext d;
    public final LongSparseArray e;
    public final Map f;
    public final c$b g;
    public final ArrayList h;
    public final ArrayList i;
    public final List j;
    public final c$c k;
    public final AtomicInteger l;
    public b[] m;
    public int n;
    public ReactEventEmitter o;
    public short p;
    public boolean q;
    public static final Comparator r;

    static {
       c.r = new c$a();
    }
    public void c(ReactApplicationContext p0){
       super();
       this.b = new Object();
       this.c = new Object();
       this.e = new LongSparseArray();
       this.f = d.b();
       this.g = new c$b(this);
       this.h = new ArrayList();
       this.i = new ArrayList();
       this.j = new ArrayList();
       this.k = new c$c(this);
       this.l = new AtomicInteger();
       b[] uobArray = new b[16];
       this.m = uobArray;
       this.n = 0;
       this.p = 0;
       this.q = false;
       this.d = p0;
       p0.addLifecycleEventListener(this);
       this.o = new ReactEventEmitter(p0);
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "17")) {
          return;
       }
       c tm = this.m;
       if (this.n == tm.length) {
          this.m = Arrays.copyOf(tm, (tm.length * 2));
       }
       tm = this.n;
       this.n = tm + 1;
       this.m[tm] = p0;
       return;
    }
    public void b(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.i.add(p0);
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.b(p0.i(), "Dispatched event hasn\'t been initialized");
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().onEventDispatch(p0);
       }
       c tb = this.b;
       _monitor_enter(tb);
       this.h.add(p0);
       p0.e();
       _monitor_exit(tb);
       this.e();
       return;
    }
    public final long d(int p0,String p1,short p2){
       Short obj;
       short s;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Short.valueOf(p2), this, c.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       obj = this.f.get(p1);
       if (obj != null) {
          s = obj.shortValue();
       }else {
          c tp = this.p;
          this.p = (short)(tp + 1);
          this.f.put(p1, Short.valueOf(tp));
          s = tp;
       }
       return (((((long)s & 0xffff) << 32) | (long)p0) | (((long)p2 & 0xffff) << 48));
    }
    public final void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "3")) {
          return;
       }
       if (this.o != null) {
          c tk = this.k;
          Objects.requireNonNull(tk);
          if (!PatchProxy.applyVoid(objArray, tk, c$c.class, "4") && tk.c == null) {
             if (tk.e.d.isOnUiQueueThread()) {
                tk.c();
             }else {
                tk.e.d.runOnUiQueueThread(new e(tk));
             }
          }
       }
       return;
    }
    public void f(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, c.class, "13")) {
          return;
       }
       c tb = this.b;
       _monitor_enter(tb);
       c tc = this.c;
       _monitor_enter(tc);
       int i = 0;
       while (i < this.h.size()) {
          b uob = this.h.get(i);
          if (!uob.a()) {
             this.a(uob);
          }else {
             long l = this.d(uob.g(), uob.e(), uob.d());
             Integer integer = this.e.get(l);
             if (integer == null) {
                this.e.put(l, Integer.valueOf(this.n));
                objArray = null;
             }else {
                objArray = this.m[integer.intValue()];
                b uob1 = PatchProxy.applyOneRefs(objArray, uob, b.class, "2");
                if (uob1 != PatchProxyResult.class) {
                }else if(uob.f() - objArray.f() >= 0){
                   uob1 = uob;
                }else {
                   uob1 = objArray;
                }
                if (uob1 != objArray) {
                   this.e.put(l, Integer.valueOf(this.n));
                   this.m[integer.intValue()] = null;
                   uob = uob1;
                }else {
                   objArray = uob;
                   uob = null;
                }
             }
             if (uob != null) {
                this.a(uob);
             }
             if (objArray != null) {
                objArray.c();
             }
          }
          i = i + 1;
       }
       _monitor_exit(tc);
       this.h.clear();
       _monitor_exit(tb);
       return;
    }
    public void g(int p0,RCTEventEmitter p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "15")) {
          return;
       }
       this.o.register(p0, p1);
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, c.class, "12")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.k.d = true;
       return;
    }
    public void onHostDestroy(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       this.h();
       return;
    }
    public void onHostPause(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       this.h();
       return;
    }
    public void onHostResume(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       this.e();
       return;
    }
}
