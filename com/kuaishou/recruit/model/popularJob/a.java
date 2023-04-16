package com.kuaishou.recruit.model.popularJob.a;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.recruit.model.popularJob.RecruitPopularJobFeed;

public final class a implements PhotoType$a	// class@000ee5
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final BaseFeed a(){
       return new RecruitPopularJobFeed();
    }
}
