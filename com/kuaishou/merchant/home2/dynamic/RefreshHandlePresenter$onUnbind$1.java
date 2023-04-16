package com.kuaishou.merchant.home2.dynamic.RefreshHandlePresenter$onUnbind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.merchant.home2.dynamic.RefreshHandlePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Number;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import kotlin.jvm.internal.CallableReference;

public final class RefreshHandlePresenter$onUnbind$1 extends FunctionReferenceImpl implements l	// class@001717
{

    public void RefreshHandlePresenter$onUnbind$1(RefreshHandlePresenter p0){
       super(1, p0, RefreshHandlePresenter.class, "pullProgressInner", "pullProgressInner\(F\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.floatValue());
       return l1.a;
    }
    public final void invoke(float p0){
       if (PatchProxy.isSupport(RefreshHandlePresenter$onUnbind$1.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RefreshHandlePresenter$onUnbind$1.class, "1")) {
          return;
       }
       this.receiver.P8(p0);
       return;
    }
}
