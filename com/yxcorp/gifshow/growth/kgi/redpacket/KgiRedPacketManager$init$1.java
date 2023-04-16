package com.yxcorp.gifshow.growth.kgi.redpacket.KgiRedPacketManager$init$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import loa.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import jsa.e;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;

public final class KgiRedPacketManager$init$1 extends FunctionReferenceImpl implements l	// class@0013de
{

    public void KgiRedPacketManager$init$1(b p0){
       super(1, p0, b.class, "onPhotoPLayEvent", "onPhotoPLayEvent\(Lcom/yxcorp/gifshow/homepage/event/GlobalPhotoPlayEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KgiRedPacketManager$init$1.class, "1")) {
          return;
       }
       this.receiver.onPhotoPLayEvent(p0);
       return;
    }
}
