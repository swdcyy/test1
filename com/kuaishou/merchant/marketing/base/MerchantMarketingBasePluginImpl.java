package com.kuaishou.merchant.marketing.base.MerchantMarketingBasePluginImpl;
import qs3.a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.marketing.base.MerchantMarketingBaseLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.marketing.base.MerchantMarketingBasePluginImpl$2;
import java.lang.Boolean;
import com.kuaishou.merchant.marketing.base.MerchantMarketingBasePluginImpl$1;
import com.kuaishou.merchant.marketing.base.MerchantMarketingBasePluginImpl$3;

public class MerchantMarketingBasePluginImpl implements a	// class@001ae8
{
    public static final String b = "MerchantMarketingBasePluginImpl";

    public void MerchantMarketingBasePluginImpl(){
       super();
    }
    public List C(){
       Object obj = PatchProxy.apply(null, this, MerchantMarketingBasePluginImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.d(MerchantMarketingBaseLogBiz.DEBUG, MerchantMarketingBasePluginImpl.b, "MerchantMarketingBasePluginImpl getAllAnchorPresenters");
       return new MerchantMarketingBasePluginImpl$2(this);
    }
    public boolean isAvailable(){
       return true;
    }
    public List t(boolean p0){
       MerchantMarketingBasePluginImpl merchantMark = MerchantMarketingBasePluginImpl.class;
       if (PatchProxy.isSupport(merchantMark)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, merchantMark, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.d(MerchantMarketingBaseLogBiz.DEBUG, MerchantMarketingBasePluginImpl.b, "MerchantMarketingBasePluginImpl getAllAudiencePresenters");
       return new MerchantMarketingBasePluginImpl$1(this);
    }
    public List v(){
       Object obj = PatchProxy.apply(null, this, MerchantMarketingBasePluginImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.d(MerchantMarketingBaseLogBiz.DEBUG, MerchantMarketingBasePluginImpl.b, "MerchantMarketingBasePluginImpl getAllAnchorPresenters");
       return new MerchantMarketingBasePluginImpl$3(this);
    }
}
