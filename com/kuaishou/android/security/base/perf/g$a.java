package com.kuaishou.android.security.base.perf.g$a;
import com.kuaishou.android.security.base.perf.g;
import com.kuaishou.android.security.base.perf.a$a;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.security.base.perf.g$a$a;
import java.lang.Runnable;
import com.kuaishou.android.security.base.thread.a;
import java.lang.Long;
import org.json.JSONObject;
import com.kuaishou.android.security.base.perf.e$b;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import com.kuaishou.android.security.base.perf.e;
import org.json.JSONException;

public class g$a	// class@000f02
{
    public AtomicInteger a;
    public long b;
    public a$a c;
    public int d;
    public ReentrantLock e;
    public Condition f;
    public final g g;

    public void g$a(g p0,a$a p1){
       this.g = p0;
       super();
       this.a = new AtomicInteger(0);
       this.d = 0;
       ReentrantLock reentrantLoc = new ReentrantLock();
       this.e = reentrantLoc;
       this.f = reentrantLoc.newCondition();
       this.b = 0;
       this.c = p1;
       this.a();
    }
    public static long a(g$a p0,long p1){
       p0.b = p1;
       return p1;
    }
    public static ReentrantLock a(g$a p0){
       return p0.e;
    }
    public static Condition b(g$a p0){
       return p0.f;
    }
    public static a$a c(g$a p0){
       return p0.c;
    }
    public static AtomicInteger d(g$a p0){
       return p0.a;
    }
    public static long e(g$a p0){
       return p0.b;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "1")) {
          return;
       }
       a.a(new g$a$a(this));
       return;
    }
    public void a(long p0){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.b = this.b + p0;
       this.a.incrementAndGet();
       if (!(this.a.get() % this.c.a())) {
          this.e.lock();
          this.f.signal();
          this.e.unlock();
       }
       return;
    }
    public void a(a$a p0,AtomicInteger p1,long p2){
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, g$a.class, "3")) {
          return;
       }
       JSONObject jSONObject = new JSONObject();
       try{
          String str = "function";
          jSONObject.put(str, p0.b());
          jSONObject.put("count", p1.get());
          jSONObject.put("elapsedTimeInMillis", p2);
          jSONObject.put("avg", (double)((float)p2 / (float)p1.get()));
          e.a(e$b.e, b.i().j(), "stopwatch", 0, jSONObject);
       }catch(org.json.JSONException e8){
          e8.printStackTrace();
       }
       return;
    }
}
