package com.yxcorp.gifshow.hot.spot.view.HotSpotFeedTitleView$createView$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import zf6.k;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import lnc.a1;
import android.graphics.drawable.Drawable;

public final class HotSpotFeedTitleView$createView$1$2 extends Lambda implements l	// class@00184b
{
    public static final HotSpotFeedTitleView$createView$1$2 INSTANCE;

    static {
       HotSpotFeedTitleView$createView$1$2.INSTANCE = new HotSpotFeedTitleView$createView$1$2();
    }
    public void HotSpotFeedTitleView$createView$1$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotFeedTitleView$createView$1$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       if (!k.d()) {
          int[] ointArray = new int[]{a1.a(0x7f061e52),a1.a(0x7f061dcc)};
          GradientDrawable gradientDraw = new GradientDrawable(GradientDrawable$Orientation.TOP_BOTTOM, ointArray);
          gradientDraw.setGradientType(0);
          p0.setBackground(gradientDraw);
       }
       return;
    }
}
