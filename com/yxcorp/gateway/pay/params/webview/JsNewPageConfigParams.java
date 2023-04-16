package com.yxcorp.gateway.pay.params.webview.JsNewPageConfigParams;
import java.io.Serializable;
import java.lang.Object;

public final class JsNewPageConfigParams implements Serializable	// class@001254
{
    public String mCallback;
    public String mType;
    public String mUrl;
    public static final long serialVersionUID = 0x189c5674f11d9bfd;

    public void JsNewPageConfigParams(){
       this.mType = "back";
    }
}
