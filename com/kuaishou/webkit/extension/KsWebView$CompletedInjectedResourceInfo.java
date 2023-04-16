package com.kuaishou.webkit.extension.KsWebView$CompletedInjectedResourceInfo;
import java.lang.String;
import java.lang.Object;

public class KsWebView$CompletedInjectedResourceInfo	// class@0012e2
{
    public long mTimeStamp;
    public String mUrl;

    public void KsWebView$CompletedInjectedResourceInfo(String p0,long p1){
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
