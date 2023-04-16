package com.kuaishou.growth.pendant.realtime.price.core.PrtpWatcher$init$6;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import we0.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import eda.l;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;

public final class PrtpWatcher$init$6 extends FunctionReferenceImpl implements l	// class@0006b7
{

    public void PrtpWatcher$init$6(q p0){
       super(1, p0, q.class, "onLogin", "onLogin\(Lcom/yxcorp/gifshow/events/LoginEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrtpWatcher$init$6.class, "1")) {
          return;
       }
       this.receiver.onLogin(p0);
       return;
    }
}
