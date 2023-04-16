package com.kuaishou.growth.pendant.realtime.price.core.PrtpWatcher$init$8;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import we0.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import jsa.e;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;

public final class PrtpWatcher$init$8 extends FunctionReferenceImpl implements l	// class@0006b9
{

    public void PrtpWatcher$init$8(q p0){
       super(1, p0, q.class, "onPhotoPLayEvent", "onPhotoPLayEvent\(Lcom/yxcorp/gifshow/homepage/event/GlobalPhotoPlayEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrtpWatcher$init$8.class, "1")) {
          return;
       }
       this.receiver.onPhotoPLayEvent(p0);
       return;
    }
}
