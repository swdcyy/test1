package com.kuaishou.growth.pendant.realtime.price.core.PrtpWatcher$init$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import we0.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.yxcorp.gifshow.event.CommentsEvent;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;

public final class PrtpWatcher$init$2 extends FunctionReferenceImpl implements l	// class@0006b3
{

    public void PrtpWatcher$init$2(q p0){
       super(1, p0, q.class, "onComments", "onComments\(Lcom/yxcorp/gifshow/event/CommentsEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(CommentsEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrtpWatcher$init$2.class, "1")) {
          return;
       }
       this.receiver.onComments(p0);
       return;
    }
}
