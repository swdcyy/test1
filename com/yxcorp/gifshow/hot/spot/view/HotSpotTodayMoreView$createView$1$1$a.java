package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayMoreView$createView$1$1$a;
import android.view.View$OnTouchListener;
import android.widget.LinearLayout;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class HotSpotTodayMoreView$createView$1$1$a implements View$OnTouchListener	// class@00188a
{
    public final LinearLayout b;

    public void HotSpotTodayMoreView$createView$1$1$a(LinearLayout p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, HotSpotTodayMoreView$createView$1$1$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.p(p1, "event");
       if (!p1.getAction()) {
          this.b.setAlpha(0x3f000000);
       }else if(p1.getAction() == 1 || p1.getAction() == 3){
          this.b.setAlpha(0x3f800000);
       }
       return false;
    }
}
