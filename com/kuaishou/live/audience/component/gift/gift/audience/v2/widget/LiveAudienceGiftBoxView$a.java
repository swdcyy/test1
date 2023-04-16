package com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveAudienceGiftBoxView$a;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveAudienceGiftBoxView;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import java.util.Objects;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView;

public class LiveAudienceGiftBoxView$a extends GestureDetector$SimpleOnGestureListener	// class@000b69
{
    public final LiveAudienceGiftBoxView b;

    public void LiveAudienceGiftBoxView$a(LiveAudienceGiftBoxView p0){
       this.b = p0;
       super();
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       LiveAudienceGiftBoxView$a obj;
       if (PatchProxy.isSupport(LiveAudienceGiftBoxView$a.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, LiveAudienceGiftBoxView$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if ((p1.getX() - p0.getX()) - 100.00f > 0 && (Math.abs((p1.getY() - p0.getY())) - 0x42480000 < 0 && this.b.a())) {
          obj = this.b;
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoid(null, obj, LiveAudienceGiftBoxView.class, "15")) {
             obj.getParent().getParent().i();
          }
       }
       return super.onFling(p0, p1, p2, p3);
    }
}
