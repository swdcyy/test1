package com.kuaishou.live.core.basic.activity.q0$a;
import com.kuaishou.live.core.basic.activity.a;
import com.kuaishou.live.core.basic.activity.q0;
import java.lang.Object;
import com.kuaishou.live.core.basic.activity.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.c;
import com.kuaishou.android.live.log.b;
import m02.y1;
import java.lang.Iterable;
import ok.o;
import qk.y;
import com.kuaishou.live.core.basic.activity.q0$b;
import java.util.LinkedList;

public class q0$a implements a	// class@00184d
{
    public final q0 a;

    public void q0$a(q0 p0){
       this.a = p0;
       super();
    }
    public void a(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q0$a.class, "2")) {
          return;
       }
       b.d0(q0.e, "addTask", "removeTask", p0.z1(), "liveStreamId", this.a.b);
       y.q(this.a.c, new y1(p0));
       return;
    }
    public void b(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q0$a.class, "1")) {
          return;
       }
       b.d0(q0.e, "addTask", "taskName", p0.z1(), "liveStreamId", this.a.b);
       this.a.c.add(new q0$b(p0));
       return;
    }
}
