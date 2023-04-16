package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.b;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.NasaRecommendUserFeed;

public final class b implements PhotoType$a	// class@001765
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final BaseFeed a(){
       return new NasaRecommendUserFeed();
    }
}
