package com.yxcorp.gifshow.nearby.common.model.NearbyVideoCacheConfig;
import java.io.Serializable;
import java.lang.Object;

public class NearbyVideoCacheConfig implements Serializable	// class@00212e
{
    public int mCachePopSize;
    public int mCacheSize;
    public int mCacheValidInterval;

    public void NearbyVideoCacheConfig(){
       super();
    }
    public void NearbyVideoCacheConfig(int p0,int p1,int p2){
       super();
       this.mCachePopSize = p0;
       this.mCacheSize = p1;
       this.mCacheValidInterval = p2;
    }
}
