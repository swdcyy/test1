package com.yxcorp.gifshow.nearby.common.model.NearbyCachePoolPastRecord;
import java.io.Serializable;
import java.lang.Object;

public class NearbyCachePoolPastRecord implements Serializable	// class@002124
{
    public long mLastEnterLocal;
    public long mLastUpdateCacheFromNet;

    public void NearbyCachePoolPastRecord(){
       super();
    }
    public void NearbyCachePoolPastRecord(long p0,long p1){
       super();
       this.mLastEnterLocal = p0;
       this.mLastUpdateCacheFromNet = p1;
    }
}
