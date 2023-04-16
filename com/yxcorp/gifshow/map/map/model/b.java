package com.yxcorp.gifshow.map.map.model.b;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.map.map.model.MomentFeed;

public final class b implements PhotoType$a	// class@001c9d
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final BaseFeed a(){
       return new MomentFeed();
    }
}
