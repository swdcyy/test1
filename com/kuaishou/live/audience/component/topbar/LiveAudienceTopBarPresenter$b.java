package com.kuaishou.live.audience.component.topbar.LiveAudienceTopBarPresenter$b;
import ks3.i0$a;
import com.kuaishou.live.audience.component.topbar.LiveAudienceTopBarPresenter;
import java.lang.Object;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig$HeadAuthentication;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig$HeadAuthentication$SlideAnimation;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import ks3.h0;

public class LiveAudienceTopBarPresenter$b implements i0$a	// class@000be0
{
    public final LiveAudienceTopBarPresenter b;

    public void LiveAudienceTopBarPresenter$b(LiveAudienceTopBarPresenter p0){
       this.b = p0;
       super();
    }
    public void D2(MerchantLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceTopBarPresenter$b.class, "1")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.mHeadAuthentication;
          if (p0 != null) {
             MerchantLivePlayConfig$HeadAuthentication mSlideAnimat = p0.mSlideAnimation;
             if (mSlideAnimat != null) {
                MerchantLivePlayConfig$HeadAuthentication$SlideAnimation mMerchantAva = mSlideAnimat.mMerchantAvatarTagImage;
                if (mMerchantAva != null) {
                   this.b.P.L(mMerchantAva);
                   this.b.Q.setAlpha(0);
                }
             }
          }
       }
       return;
    }
    public void r5(){
       h0.a(this);
    }
}
