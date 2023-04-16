package com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$a$a$a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$a;
import java.util.Objects;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController;
import android.view.ViewGroup;
import nn2.v1;
import java.lang.ref.WeakReference;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Integer;
import t02.a0;
import kotlin.jvm.internal.a;
import aq5.d;
import fq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import dq3.a;
import lnc.a1;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public final class LiveAudienceWishListPendentController$a$a$a implements Runnable	// class@0012c0
{
    public final LiveAudienceWishListPendentController$a$a b;

    public void LiveAudienceWishListPendentController$a$a$a(LiveAudienceWishListPendentController$a$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceWishListPendentController$a$a$a.class, "1")) {
          return;
       }
       LiveAudienceWishListPendentController$a b = this.b.b.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoid(objArray, b, LiveAudienceWishListPendentController.class, "13")) {
          ViewGroup viewGroup = b.n();
          if (viewGroup != null) {
             int[] ointArray = new int[2];
             viewGroup.getLocationOnScreen(ointArray);
             int[] ointArray1 = new int[2];
             Activity uActivity = b.i().get();
             if (uActivity != null) {
                objArray = Integer.valueOf(n.k(uActivity));
             }
             a0 z2 = b.y.Z2;
             a.o(z2, "mLivePlayCallerContext.mLiveBasicContext");
             if (!z2.A0().r2(AudienceBizRelation.FOLLOW_USER_PHOTO_FEED_PENDANT)) {
                LiveAudienceWishListPendentController b1 = b.B;
                if (b1 != null) {
                   a.m(b1);
                   if (!a.b(b1.mLiveSourceType)) {
                   }
                }else if(objArray != null){
                   i = objArray.intValue();
                }else {
                   i = 0;
                }
                ointArray1[0] = i;
             label_0086 :
                i = ointArray1[0] - ointArray[0];
                LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(viewGroup.getLayoutParams());
                if (layoutParams.width == -2) {
                   b.A = viewGroup.getWidth();
                }
                if (b.A > i) {
                   Objects.requireNonNull(i.v);
                   layoutParams.width = (i < i.u)? 0: i;
                }else {
                   layoutParams.width = -2;
                }
                viewGroup.setLayoutParams(layoutParams);
             }
             i = (objArray != null)? objArray.intValue(): a1.d(0x7f0708ab) - 0;
             ointArray1[0] = i;
             goto label_0086 ;
          }
       }
       return;
    }
}
