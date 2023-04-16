package com.kuaishou.growth.pendant.core.common.PendantView$onTouchEvent$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.growth.pendant.core.common.PendantView;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PendantView$onTouchEvent$1 extends Lambda implements l	// class@000637
{
    public final PendantView this$0;

    public void PendantView$onTouchEvent$1(PendantView p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PendantView$onTouchEvent$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       return PendantView.c(this.this$0, p0);
    }
}
