package com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import o6b.b;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class DialogPushTypeInterceptor$1 extends FunctionReferenceImpl implements l	// class@001212
{

    public void DialogPushTypeInterceptor$1(DialogPushTypeInterceptor p0){
       super(1, p0, DialogPushTypeInterceptor.class, "onEvent", "onEvent\(Lcom/yxcorp/gifshow/matrix/dialog/event/ShowNormalEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogPushTypeInterceptor$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onEvent(p0);
       return;
    }
}
