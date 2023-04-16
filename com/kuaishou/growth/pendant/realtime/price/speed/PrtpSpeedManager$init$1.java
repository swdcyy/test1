package com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager$init$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.edge.reco.afk.model.AFKData;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;

public final class PrtpSpeedManager$init$1 extends FunctionReferenceImpl implements l	// class@0006c8
{

    public void PrtpSpeedManager$init$1(PrtpSpeedManager p0){
       super(1, p0, PrtpSpeedManager.class, "onAfkEvent", "onAfkEvent\(Lcom/kwai/edge/reco/afk/model/AFKData;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(AFKData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrtpSpeedManager$init$1.class, "1")) {
          return;
       }
       this.receiver.onAfkEvent(p0);
       return;
    }
}
