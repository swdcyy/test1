package com.kuaishou.merchant.live.basic.model.RouterWhiteListConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public class RouterWhiteListConfig implements Serializable	// class@00189b
{
    public List urlWhiteList;
    public static final long serialVersionUID = 0x22e60bbbe774d549;

    public void RouterWhiteListConfig(){
       super();
    }
    public static RouterWhiteListConfig get(){
       Object obj = PatchProxy.apply(null, null, RouterWhiteListConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("merchantRouterLiveWhiteList", RouterWhiteListConfig.class, new RouterWhiteListConfig());
    }
}
