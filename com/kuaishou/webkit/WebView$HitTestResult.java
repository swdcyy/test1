package com.kuaishou.webkit.WebView$HitTestResult;
import java.lang.Object;
import java.lang.String;

public class WebView$HitTestResult	// class@001287
{
    public String mExtra;
    public int mType;
    public static final int ANCHOR_TYPE = 1;
    public static final int IMAGE_ANCHOR_TYPE = 6;

    public void WebView$HitTestResult(){
       super();
       this.mType = 0;
    }
    public String getExtra(){
       return this.mExtra;
    }
    public int getType(){
       return this.mType;
    }
    public void setExtra(String p0){
       this.mExtra = p0;
    }
    public void setType(int p0){
       this.mType = p0;
    }
}
