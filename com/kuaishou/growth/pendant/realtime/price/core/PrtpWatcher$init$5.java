package com.kuaishou.growth.pendant.realtime.price.core.PrtpWatcher$init$5;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import we0.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import qt5.c;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;

public final class PrtpWatcher$init$5 extends FunctionReferenceImpl implements l	// class@0006b6
{

    public void PrtpWatcher$init$5(q p0){
       super(1, p0, q.class, "onSlide", "onSlide\(Lcom/kwai/feature/api/pendant/activity/event/PendantMilanoSlideEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrtpWatcher$init$5.class, "1")) {
          return;
       }
       this.receiver.onSlide(p0);
       return;
    }
}
