package com.yxcorp.gifshow.like.resource.LikeActivityResourceConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LikeActivityResourceConfig implements Serializable	// class@001a57
{
    public int mDisplayStyle;
    public long mEndTimestamp;
    public String mKsOrderId;
    public String mResourceUrl;
    public long mStartTimestamp;
    public static final long serialVersionUID = 0x322330f0a066eaae;

    public void LikeActivityResourceConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LikeActivityResourceConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LikeActivityResourceConfig{mStartTimestamp="+this.mStartTimestamp+", mEndTimestamp="+this.mEndTimestamp+", mDisplayStyle="+this.mDisplayStyle+", mResourceUrl=\'"+this.mResourceUrl+'''+'}';
    }
}
