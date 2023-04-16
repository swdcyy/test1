package com.kwai.nearby.local.detail.label.LocalSimpleLabelElement$onBind$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.nearby.local.detail.label.LocalSimpleLabelElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Boolean;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import zc7.d;
import java.lang.Runnable;
import android.os.Handler;

public final class LocalSimpleLabelElement$onBind$3 extends FunctionReferenceImpl implements l	// class@000f8e
{

    public void LocalSimpleLabelElement$onBind$3(LocalSimpleLabelElement p0){
       super(1, p0, LocalSimpleLabelElement.class, "onGuideShowing", "onGuideShowing\(Z\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(LocalSimpleLabelElement$onBind$3.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LocalSimpleLabelElement$onBind$3.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       LocalSimpleLabelElement localSimpleL = LocalSimpleLabelElement.class;
       if (!PatchProxy.isSupport(localSimpleL) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), treceiver, localSimpleL, "16")) {
          treceiver.x.postDelayed(new d(treceiver), 3000);
       }
       return;
    }
}
