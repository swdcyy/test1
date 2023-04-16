package com.kwai.video.wayne.player.config.inerface.CommonConfigInterface;
import java.lang.String;

public interface abstract CommonConfigInterface	// class@000cda
{

    boolean enableAsyncStreamOpen();
    int getCacheSocketBufKB();
    int getFadeinEndTimeMs();
    int getMaxBufferDurMs();
    String getMediacodecDecodeTypeStr();
    int getVodLowDevice();
    boolean isEnabledByMediaCodecType(int p0,int p1);
    boolean useAudioGain();
}
