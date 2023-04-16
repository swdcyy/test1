package com.yxcorp.gifshow.detail.util.ViewAbortClickUtils$isViewHasAborted$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.view.View;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Objects;
import zsd.u;

public final class ViewAbortClickUtils$isViewHasAborted$1 extends Lambda implements l	// class@001a2a
{
    public static final ViewAbortClickUtils$isViewHasAborted$1 INSTANCE;

    static {
       ViewAbortClickUtils$isViewHasAborted$1.INSTANCE = new ViewAbortClickUtils$isViewHasAborted$1();
    }
    public void ViewAbortClickUtils$isViewHasAborted$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ViewAbortClickUtils$isViewHasAborted$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       boolean b = false;
       if (p0.getTag() instanceof String) {
          p0 = p0.getTag();
          Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.String");
          b = u.q2(p0, "VIEW_ABORT_CLICK", b, 2, null);
       }
       return b;
    }
}
