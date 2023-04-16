package com.yxcorp.gifshow.follow.common.model.i;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed;

public final class i implements PhotoType$a	// class@001079
{
    public static final i a;

    static {
       i.a = new i();
    }
    public void i(){
       super();
    }
    public final BaseFeed a(){
       return new FollowingUserBannerFeed();
    }
}
