package com.yxcorp.gifshow.corona.common.model.n;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleFeed;

public final class n implements PhotoType$a	// class@001259
{
    public static final n a;

    static {
       n.a = new n();
    }
    public void n(){
       super();
    }
    public final BaseFeed a(){
       return new CoronaTitleFeed();
    }
}
