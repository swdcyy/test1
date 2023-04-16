package com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveShopPreloadHelper$DynamicConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveShopPreloadHelper$DynamicConfig implements Serializable	// class@001971
{
    public int count;
    public String renderUrl;
    public static final long serialVersionUID = 0x7fabd56f1d670bd7;

    public void LiveShopPreloadHelper$DynamicConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveShopPreloadHelper$DynamicConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DynamicConfig{renderUrl=\'"+this.renderUrl+'''+", count="+this.count+'}';
    }
}
