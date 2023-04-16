package com.kwai.video.wayne.player.multisource.switcher.DataSourceFetcher;
import com.kwai.video.wayne.player.multisource.switcher.DataSourceFetchCallback;
import com.kwai.video.wayne.player.multisource.switcher.FetchReason;

public interface abstract DataSourceFetcher	// class@000daf
{

    void cancel();
    void fetch(DataSourceFetchCallback p0);
    void fetch(DataSourceFetchCallback p0,FetchReason p1);
}
