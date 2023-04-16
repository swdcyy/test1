package com.kwai.video.waynelive.datasource.LiveDataSourceFetcher;
import com.kwai.video.waynelive.LiveRestartReason;
import com.kwai.video.waynelive.datasource.LiveDataSourceFetcher$DataSourceFetchCallback;

public interface abstract LiveDataSourceFetcher	// class@000de7
{

    void fetchDataSource(LiveRestartReason p0,LiveDataSourceFetcher$DataSourceFetchCallback p1);
}
