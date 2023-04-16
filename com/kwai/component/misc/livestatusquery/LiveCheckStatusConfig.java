package com.kwai.component.misc.livestatusquery.LiveCheckStatusConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveCheckStatusConfig implements Serializable	// class@0009ca
{
    public Map mBizRequestIntervalMs;
    public boolean mEnableCheckLiveStatus;
    public long mLiveStartMinMs;
    public int mMaxRequestBatchSize;
    public long mRequestIntervalMs;
    public static final long serialVersionUID = 0xc45efb2fb46a734e;

    public void LiveCheckStatusConfig(){
       super();
       this.mMaxRequestBatchSize = 10;
       this.mRequestIntervalMs = 0xea60;
       this.mEnableCheckLiveStatus = true;
       this.mLiveStartMinMs = 0x7530;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveCheckStatusConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveCheckStatusConfig{mMaxRequestBatchSize="+this.mMaxRequestBatchSize+", mRequestIntervalMs="+this.mRequestIntervalMs+", mEnableCheckLiveStatus="+this.mEnableCheckLiveStatus+", mLiveStartMinMs="+this.mLiveStartMinMs+", mBizRequestIntervalMs="+this.mBizRequestIntervalMs+'}';
    }
}
