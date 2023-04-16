package com.kwai.framework.network.keyconfig.KeyConfigInitModule$execute$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.framework.network.keyconfig.KeyConfigInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import eda.l;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kuaishou.gifshow.network.degrade.RequestTiming;

public final class KeyConfigInitModule$execute$2 extends FunctionReferenceImpl implements l	// class@0017dd
{

    public void KeyConfigInitModule$execute$2(KeyConfigInitModule p0){
       super(1, p0, KeyConfigInitModule.class, "onLoginEventMainThread", "onLoginEventMainThread\(Lcom/yxcorp/gifshow/events/LoginEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KeyConfigInitModule$execute$2.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, KeyConfigInitModule.class, "4")) {
          treceiver.l0(RequestTiming.LOGIN);
       }
       return;
    }
}
