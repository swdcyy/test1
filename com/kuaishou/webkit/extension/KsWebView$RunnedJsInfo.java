package com.kuaishou.webkit.extension.KsWebView$RunnedJsInfo;
import java.lang.String;
import java.lang.Object;

public class KsWebView$RunnedJsInfo	// class@0012e4
{
    public long mCompileEndTimeStamp;
    public long mCompileStartTimeStamp;
    public long mEndTimeStamp;
    public long mRunEndTimeStamp;
    public String mUrl;

    public void KsWebView$RunnedJsInfo(String p0,long p1,long p2,long p3,long p4){
       super();
       this.mUrl = p0;
       this.mCompileStartTimeStamp = p1;
       this.mCompileEndTimeStamp = p2;
       this.mRunEndTimeStamp = p3;
       this.mEndTimeStamp = p4;
    }
    public long getCompileEndTimeStamp(){
       return this.mCompileEndTimeStamp;
    }
    public long getCompileStartTimeStamp(){
       return this.mCompileStartTimeStamp;
    }
    public long getEndTimeStamp(){
       return this.mEndTimeStamp;
    }
    public long getRunEndTimeStamp(){
       return this.mRunEndTimeStamp;
    }
    public String getUrl(){
       return this.mUrl;
    }
}
