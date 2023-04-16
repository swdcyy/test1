package com.yxcorp.gifshow.relation.feed.model.b;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.relation.feed.model.PymkRecoBigCardFeed;

public final class b implements PhotoType$a	// class@001896
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final BaseFeed a(){
       return new PymkRecoBigCardFeed();
    }
}
