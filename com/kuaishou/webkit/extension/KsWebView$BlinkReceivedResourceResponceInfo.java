package com.kuaishou.webkit.extension.KsWebView$BlinkReceivedResourceResponceInfo;
import java.lang.String;
import java.lang.Object;

public class KsWebView$BlinkReceivedResourceResponceInfo	// class@0012e1
{
    public boolean mIsFromMemoryCache;
    public boolean mIsInjected;
    public long mTimeStamp;
    public String mUrl;

    public void KsWebView$BlinkReceivedResourceResponceInfo(String p0,boolean p1,boolean p2,long p3){
       super();
       this.mUrl = p0;
       this.mIsFromMemoryCache = p1;
       this.mIsInjected = p2;
       this.mTimeStamp = p3;
    }
    public boolean getIsFromMemoryCache(){
       return this.mIsFromMemoryCache;
    }
    public boolean getIsInjected(){
       return this.mIsInjected;
    }
    public long getTimeStamp(){
       return this.mTimeStamp;
    }
    public String getUrl(){
       return this.mUrl;
    }
}
