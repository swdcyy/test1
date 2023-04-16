package com.kuaishou.merchant.bridge.jsmodel.component.JsNewPageConfigParams;
import java.io.Serializable;
import java.lang.Object;

public final class JsNewPageConfigParams implements Serializable	// class@001619
{
    public String mCallback;
    public String mLeftTopBtnType;
    public String mUrl;

    public void JsNewPageConfigParams(){
       super();
       this.mLeftTopBtnType = "back";
    }
}
