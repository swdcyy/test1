package com.kuaishou.merchant.live.bottombar.view.LiveMerchantAudienceBottomBarView$c;
import w4.j;
import com.kuaishou.merchant.live.bottombar.view.LiveMerchantAudienceBottomBarView;
import java.lang.Object;
import java.lang.ref.WeakReference;
import w4.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import n24.a;
import w4.c;

public class LiveMerchantAudienceBottomBarView$c implements j	// class@0018de
{
    public final WeakReference a;

    public void LiveMerchantAudienceBottomBarView$c(LiveMerchantAudienceBottomBarView p0){
       super();
       this.a = new WeakReference(p0);
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAudienceBottomBarView$c.class, "1")) {
       }else {
          LiveMerchantAudienceBottomBarView$c ta = this.a;
          if (ta != null && p0 != null) {
             LiveMerchantAudienceBottomBarView liveMerchant = ta.get();
             if (liveMerchant != null && !PatchProxy.applyVoidOneRefs(p0, liveMerchant, LiveMerchantAudienceBottomBarView.class, "9")) {
                liveMerchant.b.setComposition(p0);
                liveMerchant.b.setImageAssetDelegate(new a(liveMerchant));
                liveMerchant.b.s();
             }
          }
       }
       return;
    }
}
