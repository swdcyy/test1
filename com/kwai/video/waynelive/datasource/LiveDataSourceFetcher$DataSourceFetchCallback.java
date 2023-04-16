package com.kwai.video.waynelive.datasource.LiveDataSourceFetcher$DataSourceFetchCallback;
import java.lang.String;
import com.kwai.video.waynelive.datasource.ILiveDatasource;
import com.kwai.video.waynelive.datasource.LiveDataSource;

public interface abstract LiveDataSourceFetcher$DataSourceFetchCallback	// class@000de6
{

    void onFailed(String p0);
    void onSucceed(ILiveDatasource p0);
    void onSucceed(LiveDataSource p0);
}
