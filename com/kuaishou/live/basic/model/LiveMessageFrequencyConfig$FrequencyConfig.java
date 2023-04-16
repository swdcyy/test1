package com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveMessageFrequencyConfig$FrequencyConfig implements Serializable	// class@000cdc
{
    public long mAnchorSafeShowTimeMs;
    public long mAppearColdTimeSpan;
    public int mAppearTimesByColdTime;
    public int mAppearTimesByLiveStream;
    public long mAudienceSafeShowTimeMs;
    public String mConfigBizId;
    public int mPriority;
    public long mShowDurationMs;
    public static final long serialVersionUID = 0xebfb808593df3d83;

    public void LiveMessageFrequencyConfig$FrequencyConfig(){
       super();
    }
    public long getSafeShowTime(boolean p0){
       LiveMessageFrequencyConfig$FrequencyConfig tmAnchorSafe = (p0)? this.mAnchorSafeShowTimeMs: this.mAudienceSafeShowTimeMs;
       return tmAnchorSafe;
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, LiveMessageFrequencyConfig$FrequencyConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.mConfigBizId) ^ 0x01);
    }
}
