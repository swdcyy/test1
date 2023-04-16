package com.kuaishou.merchant.web.yoda.params.JsSelectIdCardParams;
import java.io.Serializable;
import java.lang.Object;

public class JsSelectIdCardParams implements Serializable	// class@0009e6
{
    public int mAuthorizeType;
    public String mCallback;
    public int mMaxFileSize;
    public int mMaxHeight;
    public int mMaxWidth;
    public int mMinHeight;
    public int mMinWidth;
    public static final long serialVersionUID = 0xfebe5324265babe;

    public void JsSelectIdCardParams(){
       super();
       this.mMaxFileSize = Integer.MAX_VALUE;
       this.mMaxWidth = Integer.MAX_VALUE;
       this.mMaxHeight = Integer.MAX_VALUE;
       this.mMinWidth = 0;
       this.mMinHeight = 0;
    }
}
