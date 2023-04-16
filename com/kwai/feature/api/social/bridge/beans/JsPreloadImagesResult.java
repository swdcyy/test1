package com.kwai.feature.api.social.bridge.beans.JsPreloadImagesResult;
import java.io.Serializable;
import java.lang.Object;

public class JsPreloadImagesResult implements Serializable	// class@0010a3
{
    public List infos;
    public int result;
    public static final long serialVersionUID = 0xf6b0a88889a5f0f5;

    public void JsPreloadImagesResult(){
       super();
       this.result = 1;
    }
    public void JsPreloadImagesResult(int p0){
       super();
       this.result = 1;
       this.result = p0;
    }
}
