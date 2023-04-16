package com.kwai.video.player.misc.ITrackInfo;
import com.kwai.video.player.misc.IMediaFormat;
import java.lang.String;

public interface abstract ITrackInfo	// class@000b88
{

    IMediaFormat getFormat();
    String getInfoInline();
    String getLanguage();
    int getTrackType();
}
