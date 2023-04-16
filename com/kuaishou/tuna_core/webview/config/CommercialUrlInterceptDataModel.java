package com.kuaishou.tuna_core.webview.config.CommercialUrlInterceptDataModel;
import com.yxcorp.gifshow.tuna.webview.config.IPolicyDataModel;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashSet;
import java.util.Collection;

public class CommercialUrlInterceptDataModel implements IPolicyDataModel	// class@001135
{
    public HashSet mJumpOutWhiteUrlSet;

    public void CommercialUrlInterceptDataModel(){
       super();
       this.mJumpOutWhiteUrlSet = null;
    }
    public static CommercialUrlInterceptDataModel justWhiteUrls(List p0){
       CommercialUrlInterceptDataModel obj = PatchProxy.applyOneRefs(p0, null, CommercialUrlInterceptDataModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CommercialUrlInterceptDataModel();
       if (p0 != null) {
          HashSet hashSet = new HashSet();
          obj.mJumpOutWhiteUrlSet = hashSet;
          hashSet.addAll(p0);
       }
       return obj;
    }
}
