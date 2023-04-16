package com.kwai.statechart.StateChart$sendOrPostEvent$2$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import ut7.e;
import java.lang.Object;
import ut7.k;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import ut7.b;
import com.kwai.statechart.a;

public final class StateChart$sendOrPostEvent$2$1 extends Lambda implements l	// class@0018f1
{
    public final e $event;

    public void StateChart$sendOrPostEvent$2$1(e p0){
       this.$event = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(k p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StateChart$sendOrPostEvent$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return "can\'t send or post event:["+b.a(this.$event)+"] when state:["+p0.e().b()+"] exiting";
    }
}
