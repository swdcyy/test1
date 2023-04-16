package com.kwai.video.wayne.player.main.RetryStrategy;
import java.lang.Object;
import java.lang.Math;
import nsd.u;

public final class RetryStrategy	// class@000d98
{
    public final int switchStrategy;
    public int trafficFreeUrlMaxRetryCount;

    public void RetryStrategy(int p0,int p1){
       super();
       this.switchStrategy = p0;
       this.trafficFreeUrlMaxRetryCount = Math.max(1, p1);
    }
    public void RetryStrategy(int p0,int p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = 1;
       }
       super(p0, p1);
       return;
    }
    public final int getSwitchStrategy(){
       return this.switchStrategy;
    }
    public final int getTrafficFreeUrlMaxRetryCount(){
       return this.trafficFreeUrlMaxRetryCount;
    }
    public final void setTrafficFreeUrlMaxRetryCount(int p0){
       this.trafficFreeUrlMaxRetryCount = p0;
    }
}
