package com.kuaishou.merchant.marketing.platform.MerchantMarketingPlatformPluginImpl;
import rs3.a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.marketing.platform.MerchantMarketingPlatformPluginImpl$2;
import java.lang.Boolean;
import com.kuaishou.merchant.marketing.platform.MerchantMarketingPlatformPluginImpl$1;
import com.kuaishou.merchant.marketing.platform.MerchantMarketingPlatformPluginImpl$3;

public class MerchantMarketingPlatformPluginImpl implements a	// class@001b03
{

    public void MerchantMarketingPlatformPluginImpl(){
       super();
    }
    public List C(){
       Object obj = PatchProxy.apply(null, this, MerchantMarketingPlatformPluginImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MerchantMarketingPlatformPluginImpl$2(this);
    }
    public boolean isAvailable(){
       return true;
    }
    public List t(boolean p0){
       MerchantMarketingPlatformPluginImpl merchantMark = MerchantMarketingPlatformPluginImpl.class;
       if (PatchProxy.isSupport(merchantMark)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, merchantMark, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new MerchantMarketingPlatformPluginImpl$1(this, p0);
    }
    public List v(){
       Object obj = PatchProxy.apply(null, this, MerchantMarketingPlatformPluginImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MerchantMarketingPlatformPluginImpl$3(this);
    }
}
