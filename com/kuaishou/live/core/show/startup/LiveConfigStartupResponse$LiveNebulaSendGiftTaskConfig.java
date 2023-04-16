package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig implements Serializable	// class@00105b
{
    public long mDelayRequestTaskInfoAfterSendGiftMillis;
    public boolean mDisableEarnCoin;
    public String mEarnCoinFirstTimeText;
    public String mEarnCoinSleepStatusText;
    public String mSendGiftTaskGuideText;
    public String mTaskHelpPageUrl;
    public String mTaskListMainPageUrl;
    public static final long serialVersionUID = 0xab49ea25e76b7d83;

    public void LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig(){
       super();
       this.mDelayRequestTaskInfoAfterSendGiftMillis = 3000;
       this.mDisableEarnCoin = false;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveNebulaSendGiftTaskConfig{mSendGiftTaskGuideText="+this.mSendGiftTaskGuideText+", mDelayRequestTaskInfoAfterSendGiftMillis="+this.mDelayRequestTaskInfoAfterSendGiftMillis+", mTaskListMainPageUrl=\'"+this.mTaskListMainPageUrl+", mEarnCoinFirstTimeText=\'"+this.mEarnCoinFirstTimeText+", mEarnCoinSleepStatusText=\'"+this.mEarnCoinSleepStatusText+", mDisableEarnCoin="+this.mDisableEarnCoin+", mTaskHelpPageUrl=\'"+this.mTaskHelpPageUrl+'}';
    }
}
