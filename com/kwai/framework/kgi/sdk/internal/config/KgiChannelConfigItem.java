package com.kwai.framework.kgi.sdk.internal.config.KgiChannelConfigItem;
import java.io.Serializable;
import com.kwai.framework.kgi.sdk.internal.config.KgiChannelConfigItem$a;
import nsd.u;
import java.lang.Object;

public final class KgiChannelConfigItem implements Serializable	// class@001585
{
    public int channelId;
    public KgiChannelConfigExtraItem extra;
    public int intervalSecondCallEngine;
    public int intervalSecondCallEngineComplete;
    public int intervalSecondCallEngineFeedbackConsume;
    public int intervalSecondRequestAsync;
    public int triggerMaxCountEveryLaunch;
    public static final KgiChannelConfigItem$a Companion;
    public static final KgiChannelConfigItem DEFAULT;
    public static final long serialVersionUID;

    static {
       KgiChannelConfigItem.Companion = new KgiChannelConfigItem$a(null);
       KgiChannelConfigItem.serialVersionUID = 0xff96b1e5e71442ce;
       KgiChannelConfigItem.DEFAULT = new KgiChannelConfigItem();
    }
    public void KgiChannelConfigItem(){
       super();
       this.intervalSecondCallEngine = 15;
       this.intervalSecondRequestAsync = 5;
       this.intervalSecondCallEngineComplete = 5;
       this.intervalSecondCallEngineFeedbackConsume = 60;
       this.triggerMaxCountEveryLaunch = 1;
    }
    public static final KgiChannelConfigItem getDEFAULT(){
       return KgiChannelConfigItem.DEFAULT;
    }
    public static final long getSerialVersionUID(){
       return KgiChannelConfigItem.serialVersionUID;
    }
}
