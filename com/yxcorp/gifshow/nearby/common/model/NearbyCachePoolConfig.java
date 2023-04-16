package com.yxcorp.gifshow.nearby.common.model.NearbyCachePoolConfig;
import java.io.Serializable;
import java.lang.Object;

public class NearbyCachePoolConfig implements Serializable	// class@002123
{
    public int mCacheSize;
    public int mMaximumLeaveDay;
    public boolean mOnlyRequestWhenNoCache;
    public int mPopMaximum;
    public int mRequestInterval;

    public void NearbyCachePoolConfig(){
       super();
    }
}
