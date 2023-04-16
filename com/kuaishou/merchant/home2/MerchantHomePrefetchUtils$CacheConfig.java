package com.kuaishou.merchant.home2.MerchantHomePrefetchUtils$CacheConfig;
import java.io.Serializable;
import java.lang.Object;

public class MerchantHomePrefetchUtils$CacheConfig implements Serializable	// class@0016de
{
    public long feedExpireDuration;
    public int minFeedSize;
    public long pageExpireDuration;
    public int pageSize;
    public long reportDelayDuration;
    public static final long serialVersionUID = 0xf8ef4799e361120c;

    public void MerchantHomePrefetchUtils$CacheConfig(){
       super();
       this.pageExpireDuration = 0x5265c00;
       this.feedExpireDuration = 0x36ee80;
       this.reportDelayDuration = 2000;
       this.pageSize = 6;
       this.minFeedSize = 0;
    }
}
