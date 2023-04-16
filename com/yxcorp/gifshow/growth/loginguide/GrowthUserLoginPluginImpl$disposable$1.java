package com.yxcorp.gifshow.growth.loginguide.GrowthUserLoginPluginImpl$disposable$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.growth.loginguide.GrowthUserLoginPluginImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import zca.b;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;

public final class GrowthUserLoginPluginImpl$disposable$1 extends FunctionReferenceImpl implements l	// class@001426
{

    public void GrowthUserLoginPluginImpl$disposable$1(GrowthUserLoginPluginImpl p0){
       super(1, p0, GrowthUserLoginPluginImpl.class, "handleChildLockDialogEvent", "handleChildLockDialogEvent\(Lcom/yxcorp/gifshow/event/ChildLockDialogEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthUserLoginPluginImpl$disposable$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, GrowthUserLoginPluginImpl.class, "15")) {
          a.p(p0, "event");
          treceiver.j = p0.a;
       }
       return;
    }
}
