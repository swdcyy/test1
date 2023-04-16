package com.kwai.framework.kgi.sdk.internal.config.KgiConfigItemHolder;
import java.io.Serializable;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfigItemHolder$a;
import nsd.u;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfigItem;
import com.kwai.framework.kgi.sdk.internal.config.KgiChannelConfigItem;
import qrd.l1;
import java.lang.Object;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class KgiConfigItemHolder implements Serializable	// class@00158e
{
    public boolean enableKgi;
    public KgiConfigItem kgiConfig;
    public static final KgiConfigItemHolder$a Companion;
    public static final KgiConfigItemHolder DISABLE;
    public static final KgiConfigItemHolder TEST;
    public static final long serialVersionUID;

    static {
       KgiConfigItemHolder.Companion = new KgiConfigItemHolder$a(null);
       KgiConfigItemHolder kgiConfigIte = new KgiConfigItemHolder();
       kgiConfigIte.enableKgi = true;
       KgiConfigItem kgiConfigIte1 = new KgiConfigItem();
       kgiConfigIte1.abParams = "{\"edge_enable_all_guide\": true,\"edge_enable_unlogin_like_pop\": true,\"edge_use_gbm_model\": true,\"max_trigger_cnt_day\": 100,\"edge_enable_unlogin_like_random_pop\": true}";
       kgiConfigIte1.samplingRate = 0x3f000000;
       KgiChannelConfigItem[] kgiChannelCo = new KgiChannelConfigItem[true];
       KgiChannelConfigItem kgiChannelCo1 = new KgiChannelConfigItem();
       kgiChannelCo1.channelId = 1;
       kgiChannelCo1.triggerMaxCountEveryLaunch = 100;
       kgiChannelCo1.intervalSecondCallEngineFeedbackConsume = 10;
       kgiChannelCo1.triggerMaxCountEveryLaunch = 100;
       kgiChannelCo[0] = kgiChannelCo1;
       kgiConfigIte1.channelConfigs = CollectionsKt__CollectionsKt.r(kgiChannelCo);
       kgiConfigIte.kgiConfig = kgiConfigIte1;
       KgiConfigItemHolder.TEST = kgiConfigIte;
       KgiConfigItemHolder.serialVersionUID = 0xff96b1e5e71442d0;
       kgiConfigIte = new KgiConfigItemHolder();
       kgiConfigIte.enableKgi = false;
       KgiConfigItemHolder.DISABLE = kgiConfigIte;
    }
    public void KgiConfigItemHolder(){
       super();
    }
    public static final KgiConfigItemHolder getDISABLE(){
       return KgiConfigItemHolder.DISABLE;
    }
    public static final long getSerialVersionUID(){
       return KgiConfigItemHolder.serialVersionUID;
    }
    public static final KgiConfigItemHolder getTEST(){
       return KgiConfigItemHolder.TEST;
    }
}
