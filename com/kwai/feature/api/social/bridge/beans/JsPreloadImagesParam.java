package com.kwai.feature.api.social.bridge.beans.JsPreloadImagesParam;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class JsPreloadImagesParam implements Serializable	// class@0010a1
{
    public String mCallBack;
    public ArrayList mUrls;
    public static final long serialVersionUID = 0xf6b0a88889a5f0f5;

    public void JsPreloadImagesParam(){
       super();
       this.mUrls = new ArrayList();
    }
}
