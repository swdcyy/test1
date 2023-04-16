package com.facebook.react.modules.core.b$e;
import com.facebook.react.modules.core.a$a;
import com.facebook.react.modules.core.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.PriorityQueue;
import com.facebook.react.modules.core.b$d;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import android.util.SparseArray;
import je.b;
import com.facebook.react.modules.core.ReactChoreographer$CallbackType;
import com.facebook.react.modules.core.ReactChoreographer;

public class b$e extends a$a	// class@00129f
{
    public WritableArray c;
    public final b d;

    public void b$e(b p0){
       this.d = p0;
       super();
       this.c = null;
    }
    public void a(long p0){
       b$e uoe = b$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoe, "1")) {
          return;
       }
       if (this.d.i.get() && !this.d.j.get()) {
          return;
       }
       p0 = p0 / 0xf4240;
       b e = this.d.e;
       _monitor_enter(e);
       while (!this.d.g.isEmpty() && this.d.g.peek().d - p0 < 0) {
          b$d uod = this.d.g.poll();
          if (this.c == null) {
             this.c = Arguments.createArray();
          }
          this.c.pushInt(uod.a);
          if (uod.b != null) {
             long l = (long)uod.c + p0;
             uod.d = l;
             this.d.g.add(uod);
          }else {
             this.d.h.remove(uod.a);
          }
       }
       _monitor_exit(e);
       b$e tc = this.c;
       if (tc != null) {
          this.d.b.callTimers(tc);
          this.c = null;
       }
       this.d.c.d(ReactChoreographer$CallbackType.TIMERS_EVENTS, this);
       return;
    }
}
