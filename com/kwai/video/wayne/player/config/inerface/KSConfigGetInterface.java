package com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import com.kwai.video.wayne.player.config.inerface.AbTestConfigInterface;
import com.kwai.video.wayne.player.config.inerface.CommonConfigInterface;
import com.kwai.video.wayne.player.config.inerface.AtlasKitConfigInterface;
import com.kwai.video.wayne.player.config.inerface.SegmentConfigInterface;
import com.kwai.video.wayne.player.config.inerface.SlideConfigInterface;
import com.kwai.video.wayne.player.config.inerface.VodP2spConfigInterface;
import com.kwai.video.wayne.player.config.inerface.RenderConfigInterface;
import com.kwai.video.wayne.player.config.inerface.InjectConfigInterface;
import com.kwai.video.wayne.player.config.module.StartPlayConfigModule$StartPlayConfigModuleGetter;
import com.kwai.video.wayne.player.config.ks_sub.AzerothCommonConfig;
import com.kwai.video.wayne.player.config.ks_sub.DccAlgSubConfig;
import com.kwai.video.wayne.player.config.ks_sub.DccOptConfig;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.config.hw_codec.VodMediaCodecConfig;
import java.util.List;
import com.kwai.video.wayne.player.config.ks_sub.UnifiedDccAlgConfig;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface$KSUserFeature;

public interface abstract KSConfigGetInterface implements AbTestConfigInterface, CommonConfigInterface, AtlasKitConfigInterface, SegmentConfigInterface, SlideConfigInterface, VodP2spConfigInterface, RenderConfigInterface, InjectConfigInterface, StartPlayConfigModule$StartPlayConfigModuleGetter	// class@000ce0
{

    AzerothCommonConfig getAzerothCommonConfig();
    int getBufferedDataSourceSizeKB();
    int getCacheDownloadConnectTimeoutMs();
    int getCacheDownloadReadTimeoutMs();
    DccAlgSubConfig getDccAlgConfig(int p0);
    DccOptConfig getDccOptConfig(int p0);
    int getEnableAdPlcType();
    int getFirstHighWaterMarkMs();
    VodMediaCodecConfig getHwCodecConfig(WayneBuildData p0,boolean p1,boolean p2);
    int getHwDecPlayScene();
    int getLastHighWaterMarkMs();
    int getMaxBufferSize();
    int getMinSeekReopenThresoldSizeKb();
    int getNextHighWaterMarkMs();
    List getQualityList();
    int getSeekHighWaterMarkMs();
    int getSwDecodeMaxResolution();
    UnifiedDccAlgConfig getUnifiedDccAlgConfig(int p0);
    KSConfigGetInterface$KSUserFeature getUserFeature();
    void setQualityList(List p0);
    KSConfigGetInterface$KSUserFeature setUserFeature(KSConfigGetInterface$KSUserFeature p0);
}
