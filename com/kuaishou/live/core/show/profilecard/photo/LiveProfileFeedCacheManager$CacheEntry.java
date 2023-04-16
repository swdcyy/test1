package com.kuaishou.live.core.show.profilecard.photo.LiveProfileFeedCacheManager$CacheEntry;
import java.io.Serializable;
import com.kuaishou.live.core.show.profilecard.photo.LiveProfileFeedResponse;
import java.lang.Object;

public class LiveProfileFeedCacheManager$CacheEntry implements Serializable	// class@000dd9
{
    public final long mExpireTime;
    public final LiveProfileFeedResponse mLiveProfileFeedResponse;
    public static final long serialVersionUID = 0x61c98d66e4c52ed2;

    public void LiveProfileFeedCacheManager$CacheEntry(LiveProfileFeedResponse p0,long p1){
       super();
       this.mLiveProfileFeedResponse = p0;
       this.mExpireTime = p1;
    }
}
