package com.kwai.nearby.local.detail.label.LocalSimpleLabelElement$disposeShowGuideType$1$2$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.nearby.local.detail.label.LocalSimpleLabelElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import rd5.e;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class LocalSimpleLabelElement$disposeShowGuideType$1$2$1 extends FunctionReferenceImpl implements l	// class@000f8a
{

    public void LocalSimpleLabelElement$disposeShowGuideType$1$2$1(LocalSimpleLabelElement p0){
       super(1, p0, LocalSimpleLabelElement.class, "onReceiveProgressEvent", "onReceiveProgressEvent\(Lcom/kwai/component/photo/detail/core/event/MediaPlayProgressEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalSimpleLabelElement$disposeShowGuideType$1$2$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onReceiveProgressEvent(p0);
       return;
    }
}
