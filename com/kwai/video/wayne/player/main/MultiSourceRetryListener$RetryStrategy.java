package com.kwai.video.wayne.player.main.MultiSourceRetryListener$RetryStrategy;
import java.lang.Object;
import java.lang.Math;

public final class MultiSourceRetryListener$RetryStrategy	// class@000d70
{
    public final int mSwitchStrategy;
    public int mTrafficFreeUrlMaxRetryCount;

    public void MultiSourceRetryListener$RetryStrategy(int p0){
       super(p0, 1);
    }
    public void MultiSourceRetryListener$RetryStrategy(int p0,int p1){
       super();
       this.mSwitchStrategy = p0;
       this.mTrafficFreeUrlMaxRetryCount = Math.max(1, p1);
    }
}
