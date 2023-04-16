package com.kuaishou.webkit.extension.KsWebExtensionStatics$PreConnectHostInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;

public class KsWebExtensionStatics$PreConnectHostInfo	// class@0012da
{
    public long mFirstUseTimeStamp;
    public String mHost;
    public long mProxyResolveEndTimeStamp;
    public boolean mResolvedByProxy;
    public long mResolvedTimeStamp;
    public long mTimeStamp;
    public int mUseCount;
    public boolean mUsingExistedConnect;

    public void KsWebExtensionStatics$PreConnectHostInfo(String p0,long p1,long p2,int p3,long p4,long p5,boolean p6,boolean p7){
       super();
       this.mHost = p0;
       this.mTimeStamp = p1;
       this.mFirstUseTimeStamp = p2;
       this.mUseCount = p3;
       this.mProxyResolveEndTimeStamp = p4;
       this.mResolvedTimeStamp = p5;
       this.mResolvedByProxy = p6;
       this.mUsingExistedConnect = p7;
    }
    public long getFirstUseTimeStamp(){
       return this.mFirstUseTimeStamp;
    }
    public String getHost(){
       return this.mHost;
    }
    public long getProxyResolveEndTimeStamp(){
       return this.mProxyResolveEndTimeStamp;
    }
    public boolean getResolvedByProxy(){
       return this.mResolvedByProxy;
    }
    public long getResolvedTimeStamp(){
       return this.mResolvedTimeStamp;
    }
    public long getTimeStamp(){
       return this.mTimeStamp;
    }
    public int getUseCount(){
       return this.mUseCount;
    }
    public boolean getUsingExistedConnect(){
       return this.mUsingExistedConnect;
    }
    public String toString(){
       return "host:"+this.mHost+", conn time:"+this.mTimeStamp+", useCount:"+this.mUseCount+", mFirstUseTimeStamp:"+this.mFirstUseTimeStamp+", proxy resolve end time:"+this.mProxyResolveEndTimeStamp+", dns time:"+this.mResolvedTimeStamp+", use proxy:"+this.mResolvedByProxy+", using exists:"+this.mUsingExistedConnect;
    }
}
