package com.kuaishou.gifshow.platform.network.keyconfig.GrowthUpPopupConfig;
import java.io.Serializable;
import com.kuaishou.gifshow.platform.network.keyconfig.GrowthUpPopupConfig$a;
import nsd.u;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;

public final class GrowthUpPopupConfig implements Serializable	// class@000870
{
    public String activityId;
    public List blackPages;
    public List blackPagesString;
    public long commonWaitInterval;
    public boolean disableAction;
    public long dispersedTime;
    public long endTime;
    public boolean isAbandon;
    public boolean isPublicBeta;
    public Boolean isUseVideo;
    public String ksOrderId;
    public long lastReportTime;
    public List mainActivityPaths;
    public long maxPopupTimes;
    public List nebulaBlackPages;
    public List nebulaBlackPagesString;
    public ConcurrentHashMap notShowReasons;
    public long popupId;
    public long popupInterval;
    public long receiveTime;
    public String source;
    public GrowthUpPopupUiConfig uiConfig;
    public long updateTime;
    public static final GrowthUpPopupConfig$a Companion;
    public static final long serialVersionUID;

    static {
       GrowthUpPopupConfig.Companion = new GrowthUpPopupConfig$a(null);
       GrowthUpPopupConfig.serialVersionUID = 0xe5be003d45219187;
    }
    public void GrowthUpPopupConfig(){
       super();
       this.source = "unknown";
       this.notShowReasons = new ConcurrentHashMap();
       this.endTime = -1;
       this.updateTime = -1;
       this.dispersedTime = -1;
       this.popupInterval = -1;
       this.maxPopupTimes = -1;
       this.commonWaitInterval = -1;
    }
    public static final long getSerialVersionUID(){
       return GrowthUpPopupConfig.serialVersionUID;
    }
}
