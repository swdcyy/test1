package com.yxcorp.gifshow.corona.common.model.d;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListFeed;

public final class d implements PhotoType$a	// class@00124f
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final BaseFeed a(){
       return new PadCoronaRankingListFeed();
    }
}
