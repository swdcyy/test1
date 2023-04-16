package com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.LiveTopPendantViewFlipper$a;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.LiveTopPendantViewFlipper;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.ArrayList;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ev1.a;

public class LiveTopPendantViewFlipper$a extends GestureDetector$SimpleOnGestureListener	// class@0016cc
{
    public final LiveTopPendantViewFlipper b;

    public void LiveTopPendantViewFlipper$a(LiveTopPendantViewFlipper p0){
       this.b = p0;
       super();
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveTopPendantViewFlipper$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (this.b.g.size() > 1) {
          LiveTopPendantViewFlipper$a tb = this.b;
          a.a(tb.i, tb.g.size());
       }
       return false;
    }
}
