package com.yxcorp.gifshow.webview.jsmodel.component.JsLocationRequestWitchCheckParams;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationRequestWitchCheckParams$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.webview.yoda.utils.a;

public final class JsLocationRequestWitchCheckParams implements Serializable	// class@001775
{
    public String bizType;
    public String content;
    public String featureId;
    public int forcePermissionRequest;
    public String mCallback;
    public String mRequestMsg;
    public boolean mShowMultiTimeDialog;
    public String title;
    public static final JsLocationRequestWitchCheckParams$a Companion;
    public static final long serialVersionUID;

    static {
       JsLocationRequestWitchCheckParams.Companion = new JsLocationRequestWitchCheckParams$a(null);
    }
    public void JsLocationRequestWitchCheckParams(){
       super();
       this.title = "";
       this.content = "";
       this.bizType = "";
       this.featureId = "";
       this.forcePermissionRequest = a.b;
    }
}
