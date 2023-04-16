package com.kuaishou.gifshow.platform.network.keyconfig.ResourcePreloadingConfig;
import java.lang.Object;

public class ResourcePreloadingConfig	// class@000883
{
    public int downloadParallelCount;
    public boolean enableDownloadResWithBandwidthLimit;
    public boolean enableSerializedDownloadLiveGiftResource;
    public int limitDownloadBufferSize;
    public boolean limitDownloadEmoji;

    public void ResourcePreloadingConfig(){
       super();
       this.downloadParallelCount = 1;
       this.enableDownloadResWithBandwidthLimit = true;
       this.enableSerializedDownloadLiveGiftResource = true;
       this.limitDownloadEmoji = true;
       this.limitDownloadBufferSize = 10;
    }
}
