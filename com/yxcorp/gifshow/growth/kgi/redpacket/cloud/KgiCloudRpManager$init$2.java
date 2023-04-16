package com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$init$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import eda.l;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;

public final class KgiCloudRpManager$init$2 extends FunctionReferenceImpl implements l	// class@0013ef
{

    public void KgiCloudRpManager$init$2(KgiCloudRpManager p0){
       super(1, p0, KgiCloudRpManager.class, "onLogin", "onLogin\(Lcom/yxcorp/gifshow/events/LoginEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KgiCloudRpManager$init$2.class, "1")) {
          return;
       }
       this.receiver.onLogin(p0);
       return;
    }
}
