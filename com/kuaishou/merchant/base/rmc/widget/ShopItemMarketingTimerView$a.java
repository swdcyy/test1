package com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingTimerView$a;
import android.os.CountDownTimer;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingTimerView;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingTimerView$b;
import java.lang.Long;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTimer;

public final class ShopItemMarketingTimerView$a extends CountDownTimer	// class@001597
{
    public final ShopItemMarketingTimerView a;

    public void ShopItemMarketingTimerView$a(ShopItemMarketingTimerView p0,long p1,long p2,int p3,u p4){
       if (p3 & 0x02) {
          p2 = 500;
       }
       this.a = p0;
       super(p1, p2);
       return;
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingTimerView$a.class, "2")) {
          return;
       }
       ShopItemMarketingTimerView$b mTimeOutList = this.a.getMTimeOutListener();
       if (mTimeOutList != null) {
          mTimeOutList.a();
       }
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(ShopItemMarketingTimerView$a.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ShopItemMarketingTimerView$a.class, "1")) {
          return;
       }
       ShopItemMarketingTimerView$a ta = this.a;
       ShopItemMarketingTimerView d = ta.d;
       if (d == null) {
          a.S("mTimer");
       }
       ta.a(p0, d);
       return;
    }
}
