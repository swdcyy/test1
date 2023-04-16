package com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController$registerSignal$1$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Boolean;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;

public final class LiveLiteConversionTaskController$registerSignal$1$1 extends FunctionReferenceImpl implements l	// class@00094a
{

    public void LiveLiteConversionTaskController$registerSignal$1$1(LiveLiteConversionTaskController p0){
       super(1, p0, LiveLiteConversionTaskController.class, "refreshBellStatus", "refreshBellStatus\(Z\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(LiveLiteConversionTaskController$registerSignal$1$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveLiteConversionTaskController$registerSignal$1$1.class, "1")) {
          return;
       }
       this.receiver.X2(p0);
       return;
    }
}
