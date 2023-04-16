package com.oceanlong.home_perf.cache.CacheConfig;
import java.io.Serializable;
import com.oceanlong.home_perf.cache.CacheConfig$a;
import nsd.u;
import java.lang.Object;

public final class CacheConfig implements Serializable	// class@000a9f
{
    public final long FEED_EXPIRE_DURATION;
    public final int MIN_FEED_SIZE;
    public final long PAGE_EXPIRE_DURATION;
    public final int PAGE_SIZE;
    public final long REPORT_DELAY_DURATION;
    public long feedExpireDuration;
    public int minFeedSize;
    public long pageExpireDuration;
    public int pageSize;
    public long reportDelayDuration;
    public static final CacheConfig$a Companion;
    public static final long serialVersionUID;

    static {
       CacheConfig.Companion = new CacheConfig$a(null);
    }
    public void CacheConfig(){
       super();
       this.PAGE_EXPIRE_DURATION = 0x5265c00;
       this.FEED_EXPIRE_DURATION = 0x36ee80;
       this.REPORT_DELAY_DURATION = 2000;
       this.PAGE_SIZE = 6;
       this.pageExpireDuration = 0x5265c00;
       this.feedExpireDuration = 0x36ee80;
       this.reportDelayDuration = 2000;
       this.pageSize = 6;
       this.minFeedSize = this.MIN_FEED_SIZE;
    }
    public final long getFeedExpireDuration(){
       return this.feedExpireDuration;
    }
    public final int getMinFeedSize(){
       return this.minFeedSize;
    }
    public final long getPageExpireDuration(){
       return this.pageExpireDuration;
    }
    public final int getPageSize(){
       return this.pageSize;
    }
    public final long getReportDelayDuration(){
       return this.reportDelayDuration;
    }
    public final void setFeedExpireDuration(long p0){
       this.feedExpireDuration = p0;
    }
    public final void setMinFeedSize(int p0){
       this.minFeedSize = p0;
    }
    public final void setPageExpireDuration(long p0){
       this.pageExpireDuration = p0;
    }
    public final void setPageSize(int p0){
       this.pageSize = p0;
    }
    public final void setReportDelayDuration(long p0){
       this.reportDelayDuration = p0;
    }
}
