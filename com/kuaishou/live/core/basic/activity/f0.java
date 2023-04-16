package com.kuaishou.live.core.basic.activity.f0;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import java.lang.Object;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kuaishou.live.core.basic.activity.q0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.LinkedList;
import com.kuaishou.live.core.basic.activity.q0$b;
import xj3.d;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$Stage;
import m02.x1;
import en8.a;

public final class f0 implements Runnable	// class@001837
{
    public final LivePlayLoader b;

    public void f0(LivePlayLoader p0){
       this.b = p0;
    }
    public final void run(){
       f0 tb = this.b;
       if (tb.p != null) {
       }else {
          String str = "liveStreamId";
          b.c0(tb.a, "loadWillShowComponent", str, tb.j);
          LivePlayLoader e = tb.e;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoid(null, e, q0.class, "1")) {
             b.c0(q0.e, "onContainerWillShow loadTasks", str, e.b);
             Iterator iterator = e.c.iterator();
             while (iterator.hasNext()) {
                q0$b uob = iterator.next();
                Objects.requireNonNull(uob);
                d uod = new d(300, null, LivePlayLoader$Stage.WILL_SHOW, new x1(uob));
                q0 a = e.a;
                if (a != null) {
                   a.f(uod);
                }else {
                   uod.run();
                }
             }
          }
       }
       return;
    }
}
