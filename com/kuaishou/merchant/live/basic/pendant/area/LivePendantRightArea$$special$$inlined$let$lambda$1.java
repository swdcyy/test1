package com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$$special$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea;
import java.lang.Object;
import android.view.MotionEvent;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;

public final class LivePendantRightArea$$special$$inlined$let$lambda$1 extends Lambda implements l	// class@0018a2
{
    public final LivePendantRightArea $this_run$inlined;

    public void LivePendantRightArea$$special$$inlined$let$lambda$1(LivePendantRightArea p0){
       this.$this_run$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LivePendantRightArea$$special$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       LivePendantRightArea y = this.$this_run$inlined.y;
       if (y != null && y.K()) {
          y.o();
       }
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action == b || action == 3) {
             action.m = false;
          }
       }else {
          action.m = b;
       }
       PatchProxy.onMethodExit(LivePendantRightArea$$special$$inlined$let$lambda$1.class, "1");
       return;
    }
}
