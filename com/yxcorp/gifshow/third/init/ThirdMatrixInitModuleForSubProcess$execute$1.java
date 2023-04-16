package com.yxcorp.gifshow.third.init.ThirdMatrixInitModuleForSubProcess$execute$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.third.init.ThirdMatrixInitModuleForSubProcess;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import o6b.a;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class ThirdMatrixInitModuleForSubProcess$execute$1 extends FunctionReferenceImpl implements l	// class@001327
{

    public void ThirdMatrixInitModuleForSubProcess$execute$1(ThirdMatrixInitModuleForSubProcess p0){
       super(1, p0, ThirdMatrixInitModuleForSubProcess.class, "onEvent", "onEvent\(Lcom/yxcorp/gifshow/matrix/dialog/event/ShowDialogEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThirdMatrixInitModuleForSubProcess$execute$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onEvent(p0);
       return;
    }
}
