package com.yxcorp.gifshow.follow.common.model.l;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.follow.common.model.PymkBarFeed;

public final class l implements PhotoType$a	// class@00107c
{
    public static final l a;

    static {
       l.a = new l();
    }
    public void l(){
       super();
    }
    public final BaseFeed a(){
       return new PymkBarFeed();
    }
}
