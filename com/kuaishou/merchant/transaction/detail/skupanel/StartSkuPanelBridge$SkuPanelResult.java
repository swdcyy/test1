package com.kuaishou.merchant.transaction.detail.skupanel.StartSkuPanelBridge$SkuPanelResult;
import com.kwai.yoda.function.FunctionResultParams;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class StartSkuPanelBridge$SkuPanelResult extends FunctionResultParams	// class@00077b
{
    public HashMap data;

    public void StartSkuPanelBridge$SkuPanelResult(){
       super();
       this.data = new HashMap();
    }
    public static StartSkuPanelBridge$SkuPanelResult cancelResult(){
       StartSkuPanelBridge$SkuPanelResult obj = PatchProxy.apply(null, null, StartSkuPanelBridge$SkuPanelResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StartSkuPanelBridge$SkuPanelResult();
       obj.mResult = 0;
       return obj;
    }
}
