package com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoRuleConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoRuleConfig$StockConfig;
import lnc.a1;

public class SandeagoRuleConfig implements Serializable	// class@001a51
{
    public SandeagoRuleConfig$StockConfig mStockConfig;
    public static final long serialVersionUID = 0xdececa77e95688a;

    public void SandeagoRuleConfig(){
       super();
    }
    public static SandeagoRuleConfig defaultRule(){
       SandeagoRuleConfig obj = PatchProxy.apply(null, null, SandeagoRuleConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SandeagoRuleConfig();
       SandeagoRuleConfig$StockConfig stockConfig = new SandeagoRuleConfig$StockConfig();
       stockConfig.mStockLimit = 200;
       stockConfig.mStockAlert = a1.p(0x7f10437f);
       obj.mStockConfig = stockConfig;
       return obj;
    }
}
