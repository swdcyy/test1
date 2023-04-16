package com.kwai.feature.api.social.moment.model.d;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.social.moment.model.MomentFeed;

public final class d implements PhotoType$a	// class@001198
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final BaseFeed a(){
       return new MomentFeed();
    }
}
