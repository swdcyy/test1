package com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import mrd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger$UserAction;
import java.util.List;
import py1.b;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger$b;
import erd.r;

public final class LiveActionTrigger	// class@0017b8
{
    public final List a;
    public final a b;
    public static final LiveActionTrigger$a c;

    static {
       LiveActionTrigger.c = new LiveActionTrigger$a(null);
    }
    public void LiveActionTrigger(){
       super();
       this.a = new ArrayList();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<Int>\(\)");
       this.b = uoa;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveActionTrigger.class, "4")) {
          return;
       }
       this.b.onNext(Integer.valueOf(1));
       return;
    }
    public final void b(LiveActionTrigger$UserAction p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActionTrigger.class, "1")) {
          return;
       }
       a.p(p0, "action");
       this.a.add(p0);
       this.a();
       return;
    }
    public final t c(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActionTrigger.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "threshold");
       t ot = this.b.hide().observeOn(a.c()).filter(new LiveActionTrigger$b(this, p0)).take(1);
       a.o(ot, "userActionSubject\n      ¡­s\) }\n            .take\(1\)");
       return ot;
    }
}
