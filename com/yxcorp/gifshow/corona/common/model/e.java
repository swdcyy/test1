package com.yxcorp.gifshow.corona.common.model.e;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.corona.common.model.TubeHomeLocalFeed;

public final class e implements PhotoType$a	// class@001250
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final BaseFeed a(){
       return new TubeHomeLocalFeed();
    }
}
