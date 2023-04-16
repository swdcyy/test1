package com.yxcorp.gifshow.corona.common.model.l;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeed;

public final class l implements PhotoType$a	// class@001257
{
    public static final l a;

    static {
       l.a = new l();
    }
    public void l(){
       super();
    }
    public final BaseFeed a(){
       return new CoronaBannerFeed();
    }
}
