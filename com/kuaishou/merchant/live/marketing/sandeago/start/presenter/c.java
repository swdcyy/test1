package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.c;
import erd.g;
import java.lang.Object;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoRuleConfig;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoRuleConfig$StockConfig;
import java.lang.String;
import lnc.a1;

public final class c implements g	// class@001a73
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       if (p0.mStockConfig == null) {
          SandeagoRuleConfig$StockConfig stockConfig = new SandeagoRuleConfig$StockConfig();
          stockConfig.mStockLimit = 9999;
          stockConfig.mStockAlert = a1.p(0x7f104384);
          p0.mStockConfig = stockConfig;
       }
       return;
    }
}
