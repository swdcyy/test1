package com.facebook.react.modules.core.b$c;
import com.facebook.react.modules.core.a$a;
import com.facebook.react.modules.core.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.concurrent.atomic.AtomicBoolean;
import com.facebook.react.modules.core.b$b;
import java.lang.Runnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ReactChoreographer$CallbackType;
import com.facebook.react.modules.core.ReactChoreographer;

public class b$c extends a$a	// class@00129d
{
    public final b c;

    public void b$c(b p0){
       this.c = p0;
       super();
    }
    public void a(long p0){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (this.c.i.get() && !this.c.j.get()) {
          return;
       }
       b m = this.c.m;
       if (m != null) {
          m.b = true;
       }
       uoc = this.c;
       b$b uob = new b$b(uoc, p0);
       uoc.m = uob;
       uoc.a.runOnJSQueueThread(uob);
       this.c.c.d(ReactChoreographer$CallbackType.IDLE_EVENT, this);
       return;
    }
}
