package com.kuaishou.recruit.model.banner.b;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.recruit.model.banner.RecruitBannerFeed;

public final class b implements PhotoType$a	// class@000ee1
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final BaseFeed a(){
       return new RecruitBannerFeed();
    }
}
