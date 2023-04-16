package com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter$mPageContext$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter;
import java.lang.Object;
import su.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fq5.b;
import ks3.f0;
import ks3.t;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import ot3.l0;

public final class MarketingBasePresenter$mPageContext$2 extends Lambda implements a	// class@001af3
{
    public final MarketingBasePresenter this$0;

    public void MarketingBasePresenter$mPageContext$2(MarketingBasePresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final g invoke(){
       Object[] objArray = null;
       g obj = PatchProxy.apply(objArray, this, MarketingBasePresenter$mPageContext$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new g("LIVE_WATCH", this.this$0.W8().d(), this.this$0.W8().getLiveStreamId(), this.this$0.Y8().J4());
       t ot = this.this$0.X8();
       if (ot != null) {
          LiveMerchantBaseContext liveMerchant = ot.a();
          if (liveMerchant != null) {
             objArray = liveMerchant.getMerchantAudienceParams();
          }
       }
       obj.e = l0.m(objArray);
       return obj;
    }
}
