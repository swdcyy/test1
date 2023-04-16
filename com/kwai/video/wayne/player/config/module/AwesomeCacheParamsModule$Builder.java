package com.kwai.video.wayne.player.config.module.AwesomeCacheParamsModule$Builder;
import java.lang.Object;
import com.kwai.video.wayne.player.config.module.AwesomeCacheParamsModule;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.module.AwesomeCacheParamsModule$1;

public class AwesomeCacheParamsModule$Builder	// class@000d08
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

    public void AwesomeCacheParamsModule$Builder(){
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
    }
    public AwesomeCacheParamsModule$Builder acheV2ScopeMaxBytes(long p0){
       this.acheV2ScopeMaxBytes = p0;
       return this;
    }
    public AwesomeCacheParamsModule build(){
       Object obj = PatchProxy.apply(null, this, AwesomeCacheParamsModule$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AwesomeCacheParamsModule(this, null);
    }
    public AwesomeCacheParamsModule$Builder enableBriefCDNLog(boolean p0){
       this.enableBriefCDNLog = p0;
       return this;
    }
    public AwesomeCacheParamsModule$Builder hodorScopeSizeAdjustConfig(String p0){
       this.hodorScopeSizeAdjustConfig = p0;
       return this;
    }
    public AwesomeCacheParamsModule$Builder mediaCacheBytesLimit(long p0){
       this.mediaCacheBytesLimit = p0;
       return this;
    }
    public AwesomeCacheParamsModule$Builder networkConnectWaitMs(int p0){
       this.networkConnectWaitMs = p0;
       return this;
    }
    public AwesomeCacheParamsModule$Builder preloadCronInterval(int p0){
       this.preloadCronInterval = p0;
       return this;
    }
    public AwesomeCacheParamsModule$Builder scopeMaxDownloadCnt(int p0){
       this.scopeMaxDownloadCnt = p0;
       return this;
    }
    public AwesomeCacheParamsModule$Builder socketBufSizeKbForPreload(int p0){
       this.socketBufSizeKbForPreload = p0;
       return this;
    }
    public AwesomeCacheParamsModule$Builder speedKbpsThresholdForScopeSize(int p0){
       this.speedKbpsThresholdForScopeSize = p0;
       return this;
    }
}
