package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayMoreView$createView$1$1$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.widget.LinearLayout;
import java.lang.Object;
import android.widget.ImageView;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.ImageView$ScaleType;

public final class HotSpotTodayMoreView$createView$1$1$3 extends Lambda implements l	// class@001889
{
    public final LinearLayout $this_linearLayout;

    public void HotSpotTodayMoreView$createView$1$1$3(LinearLayout p0){
       this.$this_linearLayout = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(ImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayMoreView$createView$1$1$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       this.$this_linearLayout.setGravity(16);
       p0.setScaleType(ImageView$ScaleType.FIT_XY);
       return;
    }
}
