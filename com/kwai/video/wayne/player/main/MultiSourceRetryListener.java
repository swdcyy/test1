package com.kwai.video.wayne.player.main.MultiSourceRetryListener;
import com.kwai.video.wayne.player.main.MultiSourceRetryListener$RetryInfo;

public interface abstract MultiSourceRetryListener	// class@000d71
{

    void onFirstPlayFailed(boolean p0,MultiSourceRetryListener$RetryInfo p1);
    void onMultiSourceRetryFinish(MultiSourceRetryListener$RetryInfo p0);
}
