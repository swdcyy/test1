package com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantViewFlipper$b;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantViewFlipper;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import msd.a;

public final class TempPlayPendantViewFlipper$b extends GestureDetector$SimpleOnGestureListener	// class@0016da
{
    public final TempPlayPendantViewFlipper b;

    public void TempPlayPendantViewFlipper$b(TempPlayPendantViewFlipper p0){
       this.b = p0;
       super();
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TempPlayPendantViewFlipper$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       this.b.getOnPendantClickListener().invoke();
       return false;
    }
}
