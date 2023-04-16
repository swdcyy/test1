package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketOutsideBottomTipView$defaultViewBgDrawable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketOutsideBottomTipView;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;

public final class LiveActivityRedPacketOutsideBottomTipView$defaultViewBgDrawable$2 extends Lambda implements a	// class@00098b
{
    public final LiveActivityRedPacketOutsideBottomTipView this$0;

    public void LiveActivityRedPacketOutsideBottomTipView$defaultViewBgDrawable$2(LiveActivityRedPacketOutsideBottomTipView p0){
       this.this$0 = p0;
       super(0);
    }
    public final Drawable invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveActivityRedPacketOutsideBottomTipView$defaultViewBgDrawable$2 obj = PatchProxy.apply(null, this, LiveActivityRedPacketOutsideBottomTipView$defaultViewBgDrawable$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       GradientDrawable gradientDraw = PatchProxy.apply(null, obj, LiveActivityRedPacketOutsideBottomTipView.class, "6");
       if (gradientDraw != patchProxyRe) {
       }else {
          gradientDraw = new GradientDrawable();
          gradientDraw.setCornerRadius((float)a1.e(LiveActivityRedPacketOutsideBottomTipView.j));
          gradientDraw.setColor(LiveActivityRedPacketOutsideBottomTipView.i);
       }
       return gradientDraw;
    }
    public Object invoke(){
       return this.invoke();
    }
}
