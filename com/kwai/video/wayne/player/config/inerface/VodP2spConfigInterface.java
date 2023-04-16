package com.kwai.video.wayne.player.config.inerface.VodP2spConfigInterface;
import java.lang.String;

public interface abstract VodP2spConfigInterface	// class@000ce7
{

    int getP2spCdnRequestInitialSize(boolean p0);
    int getP2spCdnRequestMaxSize(boolean p0);
    int getP2spOffThreshold(boolean p0);
    int getP2spOnThreshold(boolean p0);
    String getP2spParams(boolean p0);
    String getP2spPolicy(boolean p0);
    int getP2spTaskMaxSize(boolean p0);
    String getP2spTaskVersion(boolean p0);
    boolean isP2spHoleIgnoreSpeedcal(boolean p0);
}
