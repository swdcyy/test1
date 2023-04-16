package com.kwai.video.player.IKwaiSubtitleListener;
import java.util.List;

public interface abstract IKwaiSubtitleListener	// class@000ab8
{

    void onSelectedSubtitleStatusChange(int p0,int p1);
    void onSubtitleCues(List p0);
    void onSubtitleUpdate(List p0);
}
