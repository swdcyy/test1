package com.yxcorp.gifshow.detail.fragments.a;
import ok.o;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.TubeRecommendFeed;

public final class a implements o	// class@00150c
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b = (p0 != null && p0.getEntity() instanceof TubeRecommendFeed)? true: false;
       return b;
    }
}
