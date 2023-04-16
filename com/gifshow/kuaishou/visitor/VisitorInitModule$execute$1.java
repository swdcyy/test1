package com.gifshow.kuaishou.visitor.VisitorInitModule$execute$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.gifshow.kuaishou.visitor.VisitorInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import zh5.b;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class VisitorInitModule$execute$1 extends FunctionReferenceImpl implements l	// class@0015d6
{

    public void VisitorInitModule$execute$1(VisitorInitModule p0){
       super(1, p0, VisitorInitModule.class, "onVisitorModeEvent", "onVisitorModeEvent\(Lcom/kwai/component/uiconfig/visitor/VisitorModeEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorInitModule$execute$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onVisitorModeEvent(p0);
       return;
    }
}
