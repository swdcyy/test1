package com.kwai.video.wayne.player.config.module.AwesomeCacheParamsModule;
import com.kwai.video.wayne.player.config.module.AwesomeCacheParamsModule$Builder;
import java.lang.Object;
import com.kwai.video.wayne.player.config.module.AwesomeCacheParamsModule$1;
import java.lang.String;

public class AwesomeCacheParamsModule	// class@000d09
{
    public long acheV2ScopeMaxBytes;
    public boolean enableBriefCDNLog;
    public String hodorScopeSizeAdjustConfig;
    public long mediaCacheBytesLimit;
    public int networkConnectWaitMs;
    public int preloadCronInterval;
    public int scopeMaxDownloadCnt;
    public int socketBufSizeKbForPreload;
    public int speedKbpsThresholdForScopeSize;

    public void AwesomeCacheParamsModule(AwesomeCacheParamsModule$Builder p0){
       super();
       this.acheV2ScopeMaxBytes = 0x100000;
       this.speedKbpsThresholdForScopeSize = -1;
       this.hodorScopeSizeAdjustConfig = "{}";
       this.scopeMaxDownloadCnt = 100;
       this.networkConnectWaitMs = -1;
       this.preloadCronInterval = 5;
       this.enableBriefCDNLog = false;
       this.socketBufSizeKbForPreload = -1;
       this.mediaCacheBytesLimit = 0x9600000;
       this.acheV2ScopeMaxBytes = p0.acheV2ScopeMaxBytes;
       this.speedKbpsThresholdForScopeSize = p0.speedKbpsThresholdForScopeSize;
       this.hodorScopeSizeAdjustConfig = p0.hodorScopeSizeAdjustConfig;
       this.scopeMaxDownloadCnt = p0.scopeMaxDownloadCnt;
       this.networkConnectWaitMs = p0.networkConnectWaitMs;
       this.preloadCronInterval = p0.preloadCronInterval;
       this.enableBriefCDNLog = p0.enableBriefCDNLog;
       this.socketBufSizeKbForPreload = p0.socketBufSizeKbForPreload;
       this.mediaCacheBytesLimit = p0.mediaCacheBytesLimit;
    }
    public void AwesomeCacheParamsModule(AwesomeCacheParamsModule$Builder p0,AwesomeCacheParamsModule$1 p1){
       super(p0);
    }
    public long getAcheV2ScopeMaxBytes(){
       return this.acheV2ScopeMaxBytes;
    }
    public String getHodorScopeSizeAdjustConfig(){
       return this.hodorScopeSizeAdjustConfig;
    }
    public long getMediaCacheBytesLimit(){
       return this.mediaCacheBytesLimit;
    }
    public int getNetworkConnectWaitMs(){
       return this.networkConnectWaitMs;
    }
    public int getPreloadCronInterval(){
       return this.preloadCronInterval;
    }
    public int getScopeMaxDownloadCnt(){
       return this.scopeMaxDownloadCnt;
    }
    public int getSocketBufSizeKbForPreload(){
       return this.socketBufSizeKbForPreload;
    }
    public int getSpeedKbpsThresholdForScopeSize(){
       return this.speedKbpsThresholdForScopeSize;
    }
    public boolean isEnableBriefCDNLog(){
       return this.enableBriefCDNLog;
    }
    public AwesomeCacheParamsModule setAcheV2ScopeMaxBytes(long p0){
       this.acheV2ScopeMaxBytes = p0;
       return this;
    }
}
