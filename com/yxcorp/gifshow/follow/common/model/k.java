package com.yxcorp.gifshow.follow.common.model.k;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.follow.common.model.PymiBarFeed;

public final class k implements PhotoType$a	// class@00107b
{
    public static final k a;

    static {
       k.a = new k();
    }
    public void k(){
       super();
    }
    public final BaseFeed a(){
       return new PymiBarFeed();
    }
}
