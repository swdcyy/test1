package com.kuaishou.bowl.data.center.data.model.page.component.CacheConfig;
import java.io.Serializable;
import java.lang.Object;

public class CacheConfig implements Serializable	// class@0011e7
{
    public long mExpireTimeMs;
    public int mRetryIntervalMs;
    public int mRetryTimes;
    public static final long serialVersionUID = 0xcee5acb413504939;

    public void CacheConfig(){
       super();
    }
}
