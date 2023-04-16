package com.kuaishou.webkit.extension.KsWebView$ResourceInfoLoadedFromMemoryCache;
import java.lang.String;
import java.lang.Object;

public class KsWebView$ResourceInfoLoadedFromMemoryCache	// class@0012e3
{
    public long mTimeStamp;
    public String mUrl;

    public void KsWebView$ResourceInfoLoadedFromMemoryCache(String p0,long p1){
       super();
       this.mUrl = p0;
       this.mTimeStamp = p1;
    }
    public long getTimeStamp(){
       return this.mTimeStamp;
    }
    public String getUrl(){
       return this.mUrl;
    }
}
