package com.kuaishou.growth.pendant.realtime.price.core.PrtpWatcher$init$7;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import we0.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import eda.n;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;

public final class PrtpWatcher$init$7 extends FunctionReferenceImpl implements l	// class@0006b8
{

    public void PrtpWatcher$init$7(q p0){
       super(1, p0, q.class, "onLogout", "onLogout\(Lcom/yxcorp/gifshow/events/LogoutEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrtpWatcher$init$7.class, "1")) {
          return;
       }
       this.receiver.onLogout(p0);
       return;
    }
}
