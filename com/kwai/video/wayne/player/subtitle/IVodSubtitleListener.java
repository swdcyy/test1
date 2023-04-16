package com.kwai.video.wayne.player.subtitle.IVodSubtitleListener;
import java.util.List;

public interface abstract IVodSubtitleListener	// class@000db2
{

    void onSelectedSubtitleStatusChange(int p0,int p1);
    void onSubtitleCues(List p0);
    void onSubtitleUpdate(List p0);
}
