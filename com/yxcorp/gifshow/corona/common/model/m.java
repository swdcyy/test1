package com.yxcorp.gifshow.corona.common.model.m;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeed;

public final class m implements PhotoType$a	// class@001258
{
    public static final m a;

    static {
       m.a = new m();
    }
    public void m(){
       super();
    }
    public final BaseFeed a(){
       return new CoronaSubChannelFeed();
    }
}
