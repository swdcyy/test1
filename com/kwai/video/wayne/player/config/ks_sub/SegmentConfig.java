package com.kwai.video.wayne.player.config.ks_sub.SegmentConfig;
import com.kwai.video.wayne.player.config.inerface.SegmentConfigInterface;
import java.lang.Object;
import com.kwai.video.wayne.player.config.ks_sub.DccAlgSubConfig;

public class SegmentConfig implements SegmentConfigInterface	// class@000cff
{
    public DccAlgSubConfig dccAlgConfig;
    public boolean enablePlaylistCache;
    public int maxBufferDurMs;
    public int segmentCacheCount;

    public void SegmentConfig(){
       super();
       this.maxBufferDurMs = 0xea60;
       DccAlgSubConfig uDccAlgSubCo = new DccAlgSubConfig();
       this.dccAlgConfig = uDccAlgSubCo;
       uDccAlgSubCo.dccMBTh_10 = 80;
       uDccAlgSubCo.enableDccAlg = true;
       uDccAlgSubCo.dccPreReadMs = 0x4e20;
       this.enablePlaylistCache = false;
       this.segmentCacheCount = 60;
    }
    public int getSegmentCacheCount(){
       return this.segmentCacheCount;
    }
    public boolean isEnablePlaylistCache(){
       return this.enablePlaylistCache;
    }
}
