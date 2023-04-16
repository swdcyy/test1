package com.yxcorp.gifshow.webview.jsmodel.component.JsLocationWithCheckParams;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.webview.yoda.utils.a;

public final class JsLocationWithCheckParams implements Serializable	// class@001778
{
    public String bizType;
    public String callback;
    public String content;
    public String featureId;
    public int forcePermissionRequest;
    public String title;

    public void JsLocationWithCheckParams(){
       super();
       this.title = "";
       this.content = "";
       this.bizType = "";
       this.featureId = "";
       this.forcePermissionRequest = a.b;
       this.callback = "";
    }
}
