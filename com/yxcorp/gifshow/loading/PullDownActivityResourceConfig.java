package com.yxcorp.gifshow.loading.PullDownActivityResourceConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PullDownActivityResourceConfig implements Serializable	// class@001a95
{
    public long mEndTimestamp;
    public String mResourceUrl;
    public List mShowPages;
    public long mStartTimestamp;
    public String mTraceId;
    public static final long serialVersionUID = 0x322330f0a15b0eae;

    public void PullDownActivityResourceConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PullDownActivityResourceConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PullDownActivityResourceConfig{mTraceId=\'"+this.mTraceId+'''+", mStartTimestamp="+this.mStartTimestamp+", mEndTimestamp="+this.mEndTimestamp+", mResourceUrl=\'"+this.mResourceUrl+'''+", mShowPages="+this.mShowPages+'}';
    }
}
