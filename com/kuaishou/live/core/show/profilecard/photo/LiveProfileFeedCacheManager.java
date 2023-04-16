package com.kuaishou.live.core.show.profilecard.photo.LiveProfileFeedCacheManager;
import java.lang.Object;
import android.util.LruCache;

public class LiveProfileFeedCacheManager	// class@000dda
{
    public LruCache a;

    public void LiveProfileFeedCacheManager(int p0){
       super();
       this.a = new LruCache(p0);
    }
}
