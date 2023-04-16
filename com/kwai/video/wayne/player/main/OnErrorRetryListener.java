package com.kwai.video.wayne.player.main.OnErrorRetryListener;
import com.kwai.video.wayne.player.main.RetryInfo;
import com.kwai.video.wayne.player.builder.WayneBuildData;

public interface abstract OnErrorRetryListener	// class@000d78
{

    void onPostRetry(RetryInfo p0,WayneBuildData p1);
    boolean onPreRetry(RetryInfo p0,WayneBuildData p1);
    void onRetryError(RetryInfo p0,WayneBuildData p1);
}
