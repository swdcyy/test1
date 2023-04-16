package com.kuaishou.live.common.core.component.trigger.LiveActionTrigger$b;
import erd.r;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import py1.b;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class LiveActionTrigger$b implements r	// class@0017b7
{
    public final LiveActionTrigger b;
    public final b c;

    public void LiveActionTrigger$b(LiveActionTrigger p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActionTrigger$b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = this.c.a(this.b.a);
       }
       return b;
    }
}
