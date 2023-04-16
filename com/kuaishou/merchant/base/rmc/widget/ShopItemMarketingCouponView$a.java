package com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingCouponView$a;
import android.os.CountDownTimer;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingCouponView;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentCouponInfo;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import java.lang.Long;

public final class ShopItemMarketingCouponView$a extends CountDownTimer	// class@00158d
{
    public final ShopItemMarketingCouponView a;

    public void ShopItemMarketingCouponView$a(ShopItemMarketingCouponView p0,long p1,long p2,int p3,u p4){
       if (p3 & 0x02) {
          p2 = 500;
       }
       this.a = p0;
       super(p1, p2);
       return;
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingCouponView$a.class, "2")) {
          return;
       }
       ShopItemMarketingCouponView$a ta = this.a;
       ShopItemMarketingCouponView.b(this.a).setText(ta.c(ShopItemMarketingCouponView.a(ta), 0));
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(ShopItemMarketingCouponView$a.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ShopItemMarketingCouponView$a.class, "1")) {
          return;
       }
       ShopItemMarketingCouponView$a ta = this.a;
       ShopItemMarketingCouponView.b(this.a).setText(ta.c(ShopItemMarketingCouponView.a(ta), p0));
       return;
    }
}
