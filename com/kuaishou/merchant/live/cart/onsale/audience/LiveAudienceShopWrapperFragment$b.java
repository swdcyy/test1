package com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopWrapperFragment$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopWrapperFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.basic.fragment.MerchantInterceptDismissBottomSheetFragment;

public class LiveAudienceShopWrapperFragment$b extends m	// class@00191d
{
    public final LiveAudienceShopWrapperFragment c;

    public void LiveAudienceShopWrapperFragment$b(LiveAudienceShopWrapperFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceShopWrapperFragment$b.class, "1")) {
          return;
       }
       this.c.dismiss();
       return;
    }
}
