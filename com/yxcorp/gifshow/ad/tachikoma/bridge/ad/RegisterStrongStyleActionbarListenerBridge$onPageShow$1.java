package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterStrongStyleActionbarListenerBridge$onPageShow$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterStrongStyleActionbarListenerBridge;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import a59.g;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import java.util.List;
import java.lang.Integer;
import a59.a;
import a59.a$a;

public final class RegisterStrongStyleActionbarListenerBridge$onPageShow$1 extends FunctionReferenceImpl implements l	// class@00181f
{

    public void RegisterStrongStyleActionbarListenerBridge$onPageShow$1(RegisterStrongStyleActionbarListenerBridge p0){
       super(1, p0, RegisterStrongStyleActionbarListenerBridge.class, "handleElementShowEvent", "handleElementShowEvent\(Lcom/yxcorp/gifshow/ad/tachikoma/bridge/core/TKElementShowEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RegisterStrongStyleActionbarListenerBridge$onPageShow$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, RegisterStrongStyleActionbarListenerBridge.class, "4") && (p0.a().contains(Integer.valueOf(1)) && p0.b())) {
          RegisterStrongStyleActionbarListenerBridge b = treceiver.b;
          if (b != null) {
             a$a.a(b, null, null, 2, null);
          }
       }
       return;
    }
}
