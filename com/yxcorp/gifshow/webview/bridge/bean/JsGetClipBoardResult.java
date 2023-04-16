package com.yxcorp.gifshow.webview.bridge.bean.JsGetClipBoardResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsGetClipBoardResult implements Serializable	// class@001720
{
    public int mResult;
    public String mText;
    public static final long serialVersionUID = 0xb860cada02578da7;

    public void JsGetClipBoardResult(int p0,String p1){
       super();
       this.mResult = p0;
       this.mText = p1;
    }
}
