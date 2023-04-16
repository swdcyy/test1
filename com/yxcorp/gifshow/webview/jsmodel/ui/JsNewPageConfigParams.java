package com.yxcorp.gifshow.webview.jsmodel.ui.JsNewPageConfigParams;
import java.io.Serializable;
import java.lang.Object;

public final class JsNewPageConfigParams implements Serializable	// class@001793
{
    public String mCallback;
    public String mLeftTopBtnType;
    public boolean mTranslucent;
    public String mUrl;

    public void JsNewPageConfigParams(){
       super();
       this.mLeftTopBtnType = "back";
    }
}
