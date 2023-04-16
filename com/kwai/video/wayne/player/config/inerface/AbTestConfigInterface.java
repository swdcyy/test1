package com.kwai.video.wayne.player.config.inerface.AbTestConfigInterface;
import java.lang.String;

public interface abstract AbTestConfigInterface	// class@000cd8
{

    boolean enableClipsCheckSlideConfig(int p0,int p1);
    String getAudioStr();
    int getEnableClipVodH264CheckSlideConfig();
    int getEnableClipVodH265CheckSlideConfig();
    int getMaxBufBspMs();
    int getMaxBufStrategy();
    int getMaxBufStrategyForSlide();
    int getPdStartPlayMaxMs();
    int getPdStartPlayMaxMsSlide();
    int getPdStartPlayTh();
    int getPdStartPlayThSlide();
    int getSoftwareDecodeFpsLimit();
    int getSoftwareDecodeHeightLimit();
    int getSoftwareDecodeWidthLimit();
    int getVideoPictureQueueSize();
    String getVodKs265Params();
    boolean isEnableMediaCodecDummySurface();
    boolean isEnableSoftwareDecodeLimit();
    boolean isVodEnableAvSyncOpt();
}
