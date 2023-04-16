package com.yxcorp.gifshow.follow.common.model.c;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.follow.common.model.RecommendUserFeed;

public final class c implements PhotoType$a	// class@001073
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final BaseFeed a(){
       return new RecommendUserFeed();
    }
}
