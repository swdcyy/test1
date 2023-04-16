package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveAudienceGiftBoxVipGradeBarView$a;
import android.graphics.drawable.GradientDrawable;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveAudienceGiftBoxVipGradeBarView;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.Rect;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lnc.a1;

public class LiveAudienceGiftBoxVipGradeBarView$a extends GradientDrawable	// class@00120b
{
    public final LiveAudienceGiftBoxVipGradeBarView a;

    public void LiveAudienceGiftBoxVipGradeBarView$a(LiveAudienceGiftBoxVipGradeBarView p0,GradientDrawable$Orientation p1,int[] p2){
       this.a = p0;
       super(p1, p2);
    }
    public boolean getPadding(Rect p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceGiftBoxVipGradeBarView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0.set(a1.d(R.dimen.arg_RES_7f0702ac), a1.d(R.dimen.arg_RES_7f0702ac), a1.d(R.dimen.arg_RES_7f0702ac), a1.d(R.dimen.arg_RES_7f0702ac));
       return true;
    }
}
