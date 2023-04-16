package com.kwai.video.wayne.player.config.inerface.DccOptConfigInterface;

public interface abstract DccOptConfigInterface	// class@000cdc
{

    int getBufferLowRatioTh_10();
    int getBufferLowRatioTh_10_ForHls();
    int getFirstHighBufferMs();
    int getFirstHighBufferMs_ForHls();
    boolean isEnableHlsDccOpt();
    boolean isEnableVodDccOpt();
    boolean isUseVodAdaptive();
}
