package com.kuaishou.merchant.bridge.jsmodel.component.JsMerchantLocationRequestWithCheckParams;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.webview.yoda.utils.a;

public final class JsMerchantLocationRequestWithCheckParams implements Serializable	// class@001613
{
    public String bizType;
    public String callback;
    public String content;
    public String featureId;
    public int forcePermissionRequest;
    public String title;

    public void JsMerchantLocationRequestWithCheckParams(){
       super();
       this.title = "";
       this.content = "";
       this.bizType = "";
       this.featureId = "";
       this.forcePermissionRequest = a.b;
       this.callback = "";
    }
}
