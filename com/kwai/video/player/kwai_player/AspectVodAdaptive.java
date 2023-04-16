package com.kwai.video.player.kwai_player.AspectVodAdaptive;
import java.lang.String;
import java.util.List;

public interface abstract AspectVodAdaptive	// class@000b2b
{

    void setAbrConfig(String p0);
    void setDeviceResolution(int p0,int p1);
    void setModelPath(String p0);
    void setMp4AbrModelPath(String p0);
    void setNetworkType(int p0);
    void setRepQualityTypeBlackList(List p0);
    void setRepQualityTypeWhiteList(List p0);
}
