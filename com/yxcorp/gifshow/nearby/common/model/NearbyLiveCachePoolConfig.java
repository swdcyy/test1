package com.yxcorp.gifshow.nearby.common.model.NearbyLiveCachePoolConfig;
import java.io.Serializable;
import java.lang.Object;

public class NearbyLiveCachePoolConfig implements Serializable	// class@002126
{
    public int cacheSize;
    public int cacheValidInterval;
    public boolean notPlayCloseLiveFeed;
    public int notShowLiveEndStrategy;
    public int visibleLiveEndStrategy;

    public void NearbyLiveCachePoolConfig(){
       super();
    }
}
