package com.kwai.video.wayne.player.config.inerface.UnifiedDccAlgConfigInterface;

public interface abstract UnifiedDccAlgConfigInterface	// class@000ce5
{

    int getBufferAdjustRatioTh_100();
    int getBufferLowRatioTh_100();
    int getBwAdjustRatioTh_100();
    int getMaxInitBufferDurMs();
    int getMinInitBufferDurMs();
    boolean isEnableUnifiedAlg();
}
