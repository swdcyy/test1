package com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FreezeConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveMessageFrequencyConfig$FreezeConfig implements Serializable	// class@000cdb
{
    public String mConfigBizId;
    public long mMessageColdTimeMs;
    public static final long serialVersionUID = 0xaaf8f582106e31d7;

    public void LiveMessageFrequencyConfig$FreezeConfig(){
       super();
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, LiveMessageFrequencyConfig$FreezeConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.mConfigBizId) ^ 0x01);
    }
}
