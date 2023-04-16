package com.kuaishou.growth.pendant.realtime.price.core.PrtpWatcher$init$4;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import we0.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import eda.r;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;

public final class PrtpWatcher$init$4 extends FunctionReferenceImpl implements l	// class@0006b5
{

    public void PrtpWatcher$init$4(q p0){
       super(1, p0, q.class, "onProfileEnter", "onProfileEnter\(Lcom/yxcorp/gifshow/events/ProfileEnterEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrtpWatcher$init$4.class, "1")) {
          return;
       }
       this.receiver.onProfileEnter(p0);
       return;
    }
}
