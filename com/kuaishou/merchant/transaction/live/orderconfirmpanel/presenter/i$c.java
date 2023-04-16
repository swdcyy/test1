package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i$c;
import sfc.a;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam;
import androidx.fragment.app.FragmentActivity;
import rk0.b;
import android.app.Activity;
import oi4.a;
import oi4.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam$ReselectedParams;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;

public class i$c extends a	// class@000827
{
    public final i c;

    public void i$c(i p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, i$c.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.W8();
       i$c tc = this.c;
       if (tc.U.mReselectedEventType == 7) {
          a uoa = b.a(tc.P8());
          ClientContent$LiveStreamPackage liveStreamPa = this.c.h9();
          i$c tc1 = this.c;
          i y = tc1.y;
          b = (tc1.U.mReselectedParamModel.mPromotionParam != null)? true: false;
          uoa.L(liveStreamPa, y, b);
       }
       return;
    }
}
