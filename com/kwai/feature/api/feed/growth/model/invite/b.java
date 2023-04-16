package com.kwai.feature.api.feed.growth.model.invite.b;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.feed.growth.model.invite.InviteSlidePageFeedModel;

public final class b implements PhotoType$a	// class@000edf
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final BaseFeed a(){
       return new InviteSlidePageFeedModel();
    }
}
